import java.util.Scanner;

class inputprogram {
    public static void main(String[] args){
        // System.out.println("Joep");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String firstname = input.next();

        System.out.print("Enter your lat name : ");
        String lastname = input.next();

        System.out.println("Your full name is "+firstname+" "+lastname);
    }
}