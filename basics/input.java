import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()
        System.out.println("enter your name");
        String name = sc.nextLine();
        
        System.out.println("you entered: " + num + " and your name is: " + name);
    } 
}
