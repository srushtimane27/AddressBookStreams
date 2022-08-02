
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;


class Person{
    int id;
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    int zip;
    int phonenumber;
    String mail;
    public Person(int id, String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String mail) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = Integer.parseInt(zip);
        this.phonenumber = Integer.parseInt(phonenumber);
        this.mail = mail;
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<Person>();

        //Add Persons
        personsList.add(new Person(2,"Srushti", "Mane","Shahupuri", "Satara", "Maharashtra","12457","45786125","abc@gmail.com"));
        personsList.add(new Person(1,"Rasika","Mule","Chinchwad","Pune","Maharashtra","56478","15236478","bhdg@gmail.com"));
        personsList.add(new Person(3,"Ruchika","Jadhav","Dapodi","Vasai","Gujrat","561424","214578965","huif@gmail.com"));


        //UC8:Search person in city or state
        personsList.stream()
                .filter(person -> person.city == "Pune")
                .forEach(person -> System.out.println(person.firstname));

        //UC9:View person by city or state
        personsList.stream()
                .filter(person -> person.city == "Satara")
                .forEach(person -> System.out.println(person.phonenumber));

        


    }
}
