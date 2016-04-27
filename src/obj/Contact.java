package obj;

import java.io.Serializable;

/**
 * Created by Nic on 4/27/2016.
 *
 * This is an example class that we can use to transmit contact information across platforms.
 */
public class Contact implements Serializable{

    private String name;
    private String phoneNumber;


    public Contact(String n, String p){
        this.name = n;
        this.phoneNumber = p;
    }

    public Contact(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
