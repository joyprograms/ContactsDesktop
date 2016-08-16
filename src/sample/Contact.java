package sample;

/**
 * Created by meekinsworks on 8/15/16.
 */
public class Contact {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    public Contact() {

    }

    @Override
    public String toString() {//doesnt print
        String output ="";
        output += name;
        output += ", ";
        output += phone;
        output += ", ";
        output += email;
        System.out.println(output);
        return output;
    }
}


