
import java.util.ArrayList;


public class PhoneBook {
   ArrayList <addContacts> phoneBook = new ArrayList<>();   //List to store the data




            void addContacts(addContacts ac)        //to add contacts to list
            {
               phoneBook.add(ac);
            }
            void updateContactViaName(int index_value,String new_Name)              //to update via name
            {

                addContacts ac1 =phoneBook.get(index_value);
                ac1.setName(new_Name);
                System.out.println("Updated successfully....");


            }
            void updateContactViaNumber(Long new_phone_Number1,int index_value)         // to update via phone number
            {

               addContacts ac1 =phoneBook.get(index_value);
               ac1.setPhoneNumber(new_phone_Number1);
                System.out.println("Updated successfully....");



            }
            void deleteContactViaPhoneNumber(Long Phone_number)             //to delete contact via phone number
            {
                for(addContacts i:phoneBook)
                {
                    if(i.phoneNumber.equals(Phone_number))
                    {
                        phoneBook.remove(i);
                        System.out.println("deleted successfully....");
                    }
                }

            }
            void deleteContactViaName(String Name)                  //to delete conntact via name
            {
                for(addContacts i:phoneBook)
                {
                    if(i.name.equalsIgnoreCase(Name))

                    {
                        phoneBook.remove(i);
                        System.out.println("deleted successfully....");
                    }
                }

            }
            void viewAllContacts()                  // to display all the contacts in a list
            {
                for(addContacts i:phoneBook)
                {
                    System.out.println("Name :"+i.getName());
                    System.out.println("PhoneNumber :"+i.getPhoneNumber());
                }
            }
            void viewBasedOnPhoneNumber(Long contactNumber) // to view a contact based on number
            {
                for(addContacts i:phoneBook)
                {

                    if(i.getPhoneNumber().equals(contactNumber))
                    {
                        System.out.println("Name :"+i.getName());
                    }
                }

            }
}
