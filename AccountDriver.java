import java.util.Scanner;

class AccountDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        Account myAccount = new Account(name, 0.00);

        System.out.printf("Your balance is: $%.2f\n", 
            myAccount.getBalance());

        input.close();
    }
}