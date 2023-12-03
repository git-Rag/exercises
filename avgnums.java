import java.util.Scanner;

public class avgnums {
    //Code to find the average of two given numbers

    public static int giveAvg(int a, int b){
        int sum = a + b;
        int avg = sum / 2;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the first number: ");
        int a = sc.nextInt();
        System.out.println("Type in the second number: ");
        int b = sc.nextInt();

        int result = giveAvg(a, b);
        System.out.println(result);

    }

}
