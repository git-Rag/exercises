import java.util.Scanner;

public class votingeligib {
    public static void votingEligibility(int age){
        if (age < 18){
            System.out.println("You are underage and cannot vote!");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote! :)");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        votingEligibility(age);

    }
}
