package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String user = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if (user.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your user name:");
                user = scan.next();
                System.out.println("Enter your password:");
                password = scan.next();

                if (user.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged In");
                    break;
                }
            }if (!(user.equals("Cydeo") && password.equals("WoodenSpoon"))){
                System.err.println("Your account is locked");
            }



scan.close();

        }

        }


    }

