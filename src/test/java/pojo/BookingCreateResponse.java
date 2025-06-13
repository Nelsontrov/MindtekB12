package pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingCreateResponse {

    private Integer bookingid;
    private BookingRequest booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public BookingRequest getBooking() {
        return booking;
    }

    public void setBooking(BookingRequest booking) {
        this.booking = booking;
    }
}
