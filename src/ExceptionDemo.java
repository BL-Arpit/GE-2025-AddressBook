import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            if (a % 2 == 0) {
                throw new CustomException("Entered number is even");
            } else {
                System.out.println(a);
            }
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught");
        }

    }
}
