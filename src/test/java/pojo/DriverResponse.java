package pojo;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverResponse {

    private String uuid;
    private Integer id;
    private List<Object> schedule;
    private String full_name;
    private Boolean is_staff;
    private String status;
    private String created_at;
    private String updated_at;
    private String driver_local_identifier;
    private List<ContactResponse> contacts_phone;
    private List<ContactResponse> contacts_email;
    private List<ContactResponse> contacts_skype;
    private List<ContactResponse> contacts_viber;
    private List<ContactResponse> contacts_other;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Object> schedule) {
        this.schedule = schedule;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Boolean getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(Boolean is_staff) {
        this.is_staff = is_staff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDriver_local_identifier() {
        return driver_local_identifier;
    }

    public void setDriver_local_identifier(String driver_local_identifier) {
        this.driver_local_identifier = driver_local_identifier;
    }

    public List<ContactResponse> getContacts_phone() {
        return contacts_phone;
    }

    public void setContacts_phone(List<ContactResponse> contacts_phone) {
        this.contacts_phone = contacts_phone;
    }

    public List<ContactResponse> getContacts_email() {
        return contacts_email;
    }

    public void setContacts_email(List<ContactResponse> contacts_email) {
        this.contacts_email = contacts_email;
    }

    public List<ContactResponse> getContacts_skype() {
        return contacts_skype;
    }

    public void setContacts_skype(List<ContactResponse> contacts_skype) {
        this.contacts_skype = contacts_skype;
    }

    public List<ContactResponse> getContacts_viber() {
        return contacts_viber;
    }

    public void setContacts_viber(List<ContactResponse> contacts_viber) {
        this.contacts_viber = contacts_viber;
    }

    public List<ContactResponse> getContacts_other() {
        return contacts_other;
    }

    public void setContacts_other(List<ContactResponse> contacts_other) {
        this.contacts_other = contacts_other;
    }
}
