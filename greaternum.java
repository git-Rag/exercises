import java.util.Scanner;

public class greaternum {
    public static void greaterNumber(int a, int b){
        if (a < b){
            System.out.println("A is smaller than the number B");
        } else if (a > b) {
            System.out.println("B is smaller than the number A");
        } else {
            System.out.println("Invalid number!");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give us your first number A: ");
        int a = sc.nextInt();
        System.out.println("Give us your second number B: ");
        int b = sc.nextInt();

        greaterNumber(a, b);

    }
}
