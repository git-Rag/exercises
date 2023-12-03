import java.util.Scanner;
public class oddnums {
    public static void printOdd(int o){
        int sum = 0;
        for (int i = 1; i<=o; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("The sum of those odd numbers is: "+ sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("From 1 to sum of how many odd numbers bitch? ");
        int askInt = sc.nextInt();
        printOdd(askInt);
    }
}
