import java.util.Scanner;

public class circumferencecalc {
    public static double findCirc(double radii){
        double radius = 2 * Math.PI * radii;
        return radius;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give us the radius of which we need to find the circumference of: ");
        double rad = sc.nextDouble();

        double result = findCirc(rad);
        System.out.println("The circumference of circle of the given radius is: "+ result);


    }
}
