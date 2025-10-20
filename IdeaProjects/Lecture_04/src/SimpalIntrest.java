import java.util.Scanner;

public class SimpalIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal:");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.println("Enter time: ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("Principal"+p);
        System.out.println("rate"+r);
        System.out.println("time"+t);

        System.out.println("simpal intrest is :"+ si);


    }
}
