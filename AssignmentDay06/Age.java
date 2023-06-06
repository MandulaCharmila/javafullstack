package AssignmentDay06;

import java.io.*;
import java.util.Scanner;
public class Age {
    public static void personAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Person Age- ");
        int a= sc.nextInt();
        personAge(a);
    }
}