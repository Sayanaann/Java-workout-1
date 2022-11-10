import java.util.Scanner;

public class MathFunction {

    static  void multiply(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number =  ");
        int b = sc.nextInt();

        int result1 = a*b;

        System.out.println("Result of integer " + a + "*" + b + " = " + result1);

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter first number = ");
        float c = sc1.nextFloat();
        System.out.print("Enter second number =  ");
        float d = sc1.nextFloat();

        float result2 = c*d;

        System.out.println("Result of float " + c + "*" + d + " = " + result2);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int e = sc2.nextInt();
        System.out.print("Enter second number =  ");
        float f = sc2.nextFloat();
        sc.close();

        float result3 = e*f;

        System.out.println("Result  " + e + "*" + f + " = " + result3);

    }
    public static void main(String[] args) {
        multiply();

    }}
