package classes;

import enums.Image;
import enums.Status;

import java.util.Arrays;
import java.util.List;

public class WhatsApp   {

    private String password;
    private int phoneNumber;
    private String userName;
    private Image image;
    private Status status;
    private List<Contact> persons;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }





    public WhatsApp() {
    }

    @Override
    public String toString() {
        return "\n       WhatsApp / Profile    " +
                "\n' phoneNumber=" + phoneNumber +
                "\n' image=" + image +
                "\n' userName='" + userName + '\'' +
                "\n```````````````````````````````````````"+
                "\n' password='" + password + '\'' +
                "\n```````````````````````````````````````"
                ;
    }

    public WhatsApp(String password, int phoneNumber, String userName, Image image,Status status) {
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.image = image;
        this.status = status;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public List<Contact> getPersons() {
        return persons;
    }

    public void setPersons(List<Contact> persons) {
        this.persons = persons;
    }







}
