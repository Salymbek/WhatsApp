import classes.Passport;
import classes.Person;
import classes.WhatsApp;
import enums.Country;
import enums.Status;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Passport> peoplePas = new ArrayList<>();
        List<WhatsApp> person = new ArrayList<>();


        WhatsApp whatsApp = new WhatsApp();




        while (true){
            Person people = new Person();
            commands();
            System.out.print("Write command: ");
            switch (scanner.nextInt()){
                case 5 -> {
                    Country[] countries = Country.values();
                    for (Country s : countries) { System.out.println(s); }
                }
                case 6 -> {
                    Status[]statuses = Status.values();
                    for (Status stat: statuses) { System.out.println(stat); }
                }
                case 7 -> {
                    System.out.println(people.createPassport(peoplePas));
                }
                case 1 -> {
                    people.getAllPassport(peoplePas).forEach(System.out::println);

                }
                case 3 -> {
                     System.out.println(person);
                }
                case 8 -> {
                    System.out.println(people.InstallWhatsApp(person));
                }
                case 2 -> {

                    people.getPassportFirstName(peoplePas, scanner.nextLine());
                }
                case 9 -> {
                    people.ChangeStatus(person);

                }
                case 10 -> {

                    people.addContact(person,whatsApp);
                }


            }
















        }



    }































    public static void commands(){
        System.out.println("""
               
               >>>>>>>>>>>>>>>COMMANDS<<<<<<<<<<<<<<<
               1   -Get all passport
               2   -Get passport by first name
               3   -Get all WhatsApp
               4   -Go to your profile
               5   -Get all city
               6   -Get WhatsApp status
               7   -Create a passport
               8   -Install WhatsApp
               9   -Change status
               10  -Add contact
               11  -Send a message
               12  -See status
               
               """);
    }






//         -      1   -Get all passport
//         -      2   -Get passport by first name
//         -     3   -Get all WhatsApp
//               4   -Go to your profile
//         -      5   -Get all city
//         -      6   -Get WhatsApp status
//         -     7   -Create a passport
//         -      8   -Install WhatsApp
//          -     9   -Change status
//               10  -Add contact
//               11  -Send a message
//               12  -See status




















}