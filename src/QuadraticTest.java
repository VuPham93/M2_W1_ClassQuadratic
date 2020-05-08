import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease enter a: ");
        double a = sc.nextDouble();
        System.out.print("PLease enter b: ");
        double b = sc.nextDouble();
        System.out.print("PLease enter c: ");
        double c = sc.nextDouble();

        Quadratic.QuadraticEquation ptb2 = new Quadratic.QuadraticEquation(a, b, c);

        System.out.println(ptb2.getRoots());

    }
}
