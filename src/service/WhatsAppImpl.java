package service;

import classes.Person;
import classes.WhatsApp;
import enums.Status;

import java.util.List;

public interface WhatsAppImpl {
    List <WhatsApp> getAllWhatsApp (List <WhatsApp> people);

    String InstallWhatsApp (List <WhatsApp> people);
    void ChangeStatus (List <WhatsApp> people);
    String addContact (List <WhatsApp> people,WhatsApp pers);
    void SendAMessage (List <WhatsApp> people,WhatsApp pers);

}
