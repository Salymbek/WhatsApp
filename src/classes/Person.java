package classes;

import enums.Country;
import enums.Gender;
import enums.Image;
import enums.Status;
import service.PersonService;
import service.WhatsAppImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Person implements PersonService,WhatsAppImpl {
    private String id;
    private Passport passport;
    private WhatsApp whatsApp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person(String id, String lastName, String firstname, String birthday, String place, String gender) {
    }


    public WhatsApp getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(WhatsApp whatsApp) {
        this.whatsApp = whatsApp;
    }

    public Person(String id,Passport passport, WhatsApp whatsApp) {
        this.id = id;
        this.passport = passport;
        this.whatsApp = whatsApp;
    }




    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }


    public Person() {



    }


    @Override
    public List<Passport> getAllPassport(List<Passport> people) {
        return people;
    }

    @Override
    public void getPassportFirstName(List<Passport> people, String firstName) {
        System.out.print("Write first name: ");
        Scanner scanner = new Scanner(System.in);
        String scanName = scanner.nextLine();
        for (Passport pers : people) {
            if (pers.getName().trim().toLowerCase().contains(scanName.trim().toLowerCase())){
                System.out.print(pers);
            }else {
                System.out.print("Person with " + scanName + " not found !!!" );
            }
        }

    }

    @Override
    public String createPassport(List<Passport> people) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Birthday (yyyy-mm-dd): ");
        String birthday = scanner.nextLine();
        System.out.print("Place Of birth: ");
        String place  = scanner.nextLine();
        System.out.print("Gender: ");
        String gen = scanner.nextLine();
        Gender.valueOf(gen);
        people.add(new Passport(id,lastName,firstName,birthday,Country.valueOf(place.toUpperCase()),Gender.valueOf(gen.toUpperCase())));
        return "Passport successfully created! ";
    }




    @Override
    public List<WhatsApp> getAllWhatsApp(List<WhatsApp> people) {
        return people;
    }

    @Override
    public String InstallWhatsApp(List<WhatsApp> people) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("create password: ");
        String password = scanner.nextLine();
        System.out.print("Write phone number: ");
        int phoneNumScan = scanner.nextInt();
        System.out.print("user Name: ");
        String userNameScan = scanner.nextLine();
        people.add(new WhatsApp(password,phoneNumScan,userNameScan, Image.DEFAULT_IMAGE, Status.ПРИВЕТ_Я_ИСПОЛЬЗУЮ_WHATSAPP));

        return "WhatsApp successfully saved!";


    }

    @Override
    public void ChangeStatus(List<WhatsApp> people) {
        Scanner sc = new Scanner(System.in);
        Person pero = new Person();
        System.out.println("Write you password WhatsApp: ");
        String str = sc.nextLine();
        if (str.equals(getWhatsApp().getPassword())){
             getWhatsApp().setStatus(Status.ПРИВЕТ_Я_ИСПОЛЬЗУЮ_WHATSAPP);
            System.out.println("Current status: "+getWhatsApp().getStatus());
            System.out.print("Write new status ");
            String stat = sc.nextLine();
            for (WhatsApp w: people) {
                if (stat.trim().toUpperCase().equals(w.getStatus())){

                }
            }

//            if (stringBuilder.equals(getWhatsApp().getStatus())){
//                System.out.println("""
//                        "Status change successfully : """ +
//                        "\n  image= "+getWhatsApp().getImage() +
//                        "\n  userName= "+getWhatsApp().getUserName() +
//                        "\n  status= "+ getWhatsApp().getStatus() +
//                        "\n````````````````````````````````````````````");
//
//
//
//            }

        }
    }

    @Override
    public String addContact(List<WhatsApp> people, WhatsApp pers) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write phone number: ");
        String phone = scanner.nextLine();
        for (WhatsApp w : people) {
            if (phone.equals(w.getPhoneNumber())) {
                System.out.println("Current contact: " + w.getUserName());
               // pers.getPersons(new Contact(w.getPhoneNumber(), w.getUserName()));

            }
        }
        return "";
    }
    @Override
    public void SendAMessage(List<WhatsApp> people, WhatsApp pers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write you password: ");
        String parol = scanner.nextLine();
        if (parol.equals(getWhatsApp().getPassword())){
            System.out.println("To whom to send a message. Write contact name: ");
            String user = scanner.nextLine();
            for (Contact c: pers.getPersons()) {
                if (user.equals(c.getName())){
                    System.out.println("Current contact " + c.getName() );
                }
            }

        }
    }


}
