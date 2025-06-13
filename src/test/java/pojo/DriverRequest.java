package pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DriverRequest {

    private String full_name;
    private String logbook_email;
    private String logbook_password;
    private Boolean is_staff;
    private Boolean is_local;
    private Boolean twic;
    private String driving_license_exp;
    private String medical_certification_exp;
    private List<Contact> contacts_phone;
    private List<Contact> contacts_email;
    private List<Contact> contacts_skype;
    private List<Contact> contacts_viber;
    private List<Contact> contacts_other;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLogbook_email() {
        return logbook_email;
    }

    public void setLogbook_email(String logbook_email) {
        this.logbook_email = logbook_email;
    }

    public String getLogbook_password() {
        return logbook_password;
    }

    public void setLogbook_password(String logbook_password) {
        this.logbook_password = logbook_password;
    }

    public Boolean getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(Boolean is_staff) {
        this.is_staff = is_staff;
    }

    public Boolean getIs_local() {
        return is_local;
    }

    public void setIs_local(Boolean is_local) {
        this.is_local = is_local;
    }

    public Boolean getTwic() {
        return twic;
    }

    public void setTwic(Boolean twic) {
        this.twic = twic;
    }

    public String getDriving_license_exp() {
        return driving_license_exp;
    }

    public void setDriving_license_exp(String driving_license_exp) {
        this.driving_license_exp = driving_license_exp;
    }

    public String getMedical_certification_exp() {
        return medical_certification_exp;
    }

    public void setMedical_certification_exp(String medical_certification_exp) {
        this.medical_certification_exp = medical_certification_exp;
    }

    public List<Contact> getContacts_phone() {
        return contacts_phone;
    }

    public void setContacts_phone(List<Contact> contacts_phone) {
        this.contacts_phone = contacts_phone;
    }

    public List<Contact> getContacts_email() {
        return contacts_email;
    }

    public void setContacts_email(List<Contact> contacts_email) {
        this.contacts_email = contacts_email;
    }

    public List<Contact> getContacts_skype() {
        return contacts_skype;
    }

    public void setContacts_skype(List<Contact> contacts_skype) {
        this.contacts_skype = contacts_skype;
    }

    public List<Contact> getContacts_viber() {
        return contacts_viber;
    }

    public void setContacts_viber(List<Contact> contacts_viber) {
        this.contacts_viber = contacts_viber;
    }

    public List<Contact> getContacts_other() {
        return contacts_other;
    }

    public void setContacts_other(List<Contact> contacts_other) {
        this.contacts_other = contacts_other;
    }
}
