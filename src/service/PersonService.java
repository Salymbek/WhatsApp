package service;

import classes.Passport;
import classes.Person;
import enums.Country;

import java.util.List;

public interface PersonService {
    List<Passport> getAllPassport (List <Passport> people);
    void getPassportFirstName (List<Passport>people, String firstName);



    String createPassport (List<Passport> people);



}
