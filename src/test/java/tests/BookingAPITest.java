package tests;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import pojo.BookingCreateResponse;
import pojo.BookingDates;
import pojo.BookingPartialUpdateRequest;
import pojo.BookingRequest;

import static io.restassured.RestAssured.given;


public class BookingAPITest {

    @Test(groups = {"regression"})
    public void partialUpdateBookingAPITest(){
        /*
        1.Create booking
        2. Partial update booking
        3. Get booking and validate partial update is worked
         */

        // 1. Create booking

        BookingRequest bookingRequest=new BookingRequest();
        bookingRequest.setFirstname("John");
        bookingRequest.setLastname("Doe");
        bookingRequest.setTotalprice(111);
        bookingRequest.setDepositpaid(true);
        bookingRequest.setAdditionalneeds("Breakfast");

        BookingDates bookingDates=new BookingDates();
        bookingDates.setCheckin("2025-07-01");
        bookingDates.setCheckout("2025-08-01");
        bookingRequest.setBookingdates(bookingDates);

        Response response=given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Content-Type","application/json")
                .and().body(bookingRequest)
                .when().post("/booking");

        response.then().log().all();
        response.then().statusCode(200);

        BookingCreateResponse bookingCreateResponse=response.body().as(BookingCreateResponse.class); //deserialize json to java object
        int bookingId=bookingCreateResponse.getBookingid();

        //2. Partial Update booking
        BookingPartialUpdateRequest partialUpdateRequest=new BookingPartialUpdateRequest();
        partialUpdateRequest.setFirstname("Johnny");
        partialUpdateRequest.setLastname("Doe");
        partialUpdateRequest.setAdditionalneeds("Bicycle");

        Response pathResponse=given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Content-Type","application/json")
                .and().header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .and().body(partialUpdateRequest)
                .when().patch("/booking/"+bookingId);
        pathResponse.then().log().all();
        pathResponse.then().statusCode(200);

        // 3.Get Booking
        Response getResponse=given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Accept","application/json")
                .when().get("/booking/"+bookingId);
        getResponse.then().log().all();
        getResponse.then().statusCode(200);

        //Validation Step
        getResponse.then().body("firstname", Matchers.equalTo("Johnny"))
                .body("additionalneeds",Matchers.equalTo("Bicycle"))
                .body("bookingdates.checkin",Matchers.equalTo("2025-07-01"));



    }

    @Test
    public void deleteBookingAPITest(){
        /*
        1.Create booking
        2.Delete booking
        3.Get booking and validate 404 status code
         */
        BookingRequest bookingRequest=new BookingRequest();
        bookingRequest.setFirstname("John");
        bookingRequest.setLastname("Doe");
        bookingRequest.setTotalprice(111);
        bookingRequest.setDepositpaid(true);
        bookingRequest.setAdditionalneeds("Breakfast");

        BookingDates bookingDates=new BookingDates();
        bookingDates.setCheckin("2025-07-01");
        bookingDates.setCheckout("2025-08-01");
        bookingRequest.setBookingdates(bookingDates);

        Response response=given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Content-Type","application/json")
                .and().body(bookingRequest)
                .when().post("/booking");

        response.then().log().all();
        response.then().statusCode(200);

        BookingCreateResponse bookingCreateResponse=response.body().as(BookingCreateResponse.class); //deserialize json to java object
        int bookingId=bookingCreateResponse.getBookingid();

        //2. Delete booking
        Response deleteResponse=given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .and().header("Cookie", "token=<f43bd5759f84157>")
                .and().log().all()
                .when().delete("/booking/"+bookingId);
        deleteResponse.then().log().all();
        deleteResponse.then().statusCode(201);


        Response getResponse=given().baseUri("https://restful-booker.herokuapp.com")
                .and().header("Accept","application/json")
                .and().log().all()
                .when().get("/booking/"+bookingId);
        getResponse.then().log().all();
        getResponse.then().statusCode(404);

    }
}
