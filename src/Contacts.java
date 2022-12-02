import java.util.Scanner;

class Contacts {
    public static void main(String[] args) {   //main method

            Scanner sc = new Scanner(System.in);
            PhoneBook pb = new PhoneBook();
            try {
                while (true) {
                    System.out.println("enter 1:to add contact 2: Update a contact 3:delete a contact 4: View all contacts 5:view contact based on contact number 0:to QUIT");

                    int input = sc.nextInt();

                    if (input == 1) {
                        System.out.println("Enter your contact number");
                        Long number = sc.nextLong();
                        System.out.println("Enter contact Name");
                        String name = sc.next();
                        addContacts ac = new addContacts(name, number);
                        pb.addContacts(ac);                                     //to add contacts to list
                    } else if (input == 2) {
                        System.out.println("enter the index value of the phone number");
                        int index_Value = sc.nextInt();

                        System.out.println("enter your choice to Update 1:Phone number 2:Name");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:

                                System.out.println("Enter your phone Number to update");
                                Long new_phone_Number = sc.nextLong();
                                pb.updateContactViaNumber(new_phone_Number, index_Value);       // //to update via phone number
                                break;
                            case 2:
                                System.out.println("Enter your new Name to update");
                                String new_Name = sc.next();
                                pb.updateContactViaName(index_Value, new_Name);                  //to update via name
                                break;
                        }
                    } else if (input == 3) {
                        System.out.println("enter your choice to delete via phone number (or) name 1:Phone number 2:Name");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter your phone Numner");
                                Long phone_Number = sc.nextLong();
                                pb.deleteContactViaPhoneNumber(phone_Number);            //to delete via number
                                break;
                            case 2:
                                System.out.println("Enter your Name");
                                String Name = sc.next();
                                pb.deleteContactViaName(Name);                           //to delete via name

                                break;
                        }                                    //call the method
                    } else if (input == 4) {
                        pb.viewAllContacts();                         //call to the method to view all contacts
                    } else if (input == 5) {
                        System.out.println("Enter the number to Display Name");
                        Long contactNumber = sc.nextLong();
                        pb.viewBasedOnPhoneNumber(contactNumber);
                        //call to the method
                    } else if (input == 0) {
                        break;
                    } else {
                        input = 1;
                    }

                }
            }
            catch (Exception e)
            {
                System.out.println("chose right values"+e.getMessage());
            }
    }
}
