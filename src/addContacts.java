public class addContacts {
    String name;
    Long phoneNumber;

    public addContacts(String name, Long phoneNumber) {    //constructor for addContacts
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {                   //getter to get name
        return name;
    }

    public void setName(String name) {     //Setter to set name
        this.name = name;
    }

    public Long getPhoneNumber() {          //getter to get phone number
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) { //Setter to set the phone number
        this.phoneNumber = phoneNumber;
    }
}
