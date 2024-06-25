import java.util.Scanner;

class User_details {

    public static void main (String[] args ) {
        user_details();
    }

    public static void user_details() {

        Scanner Asking_user = new Scanner(System.in);
        String name_answer= System.out.print("Enter your user name: "); //? typed name on terminal

        String user_name = Asking_user.nextLine();
        System.out.println("Your name is: " + user_name );

       
        float password_answer = System.out.print("Enter password: ");  //? typed password on terminal
        int password = Integer.parseInt(Asking_user.nextLine()); // converting string to integer
        System.out.print("Your password is: " + password);

        if (name_answer == "moka" && password_answer == 1234; )



        

    }
}