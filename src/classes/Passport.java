package classes;

import enums.Country;
import enums.Gender;

public class Passport {

    private String id;
    private String lasName;
    private String name;
    private String birthday;
    private Country country;
    private Gender gender;

    public Passport(String id, String lasName, String name, String birthday, Country country, Gender gender) {
        this.id = id;
        this.lasName = lasName;
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.gender = gender;
    }

    public Passport() {
    }




    @Override
    public String toString() {
        return "\n         Passport      "  + '\'' +
                "\n lastName ='" + lasName + '\'' +
                "\n name ='" + name + '\'' +
                "\n birthday ='" + birthday + '\'' +
                "\n country =" + country + '\'' +
                "\n gender =" + gender + '\'' +
                "\n``````````````````````````````"
                ;
    }



    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
