import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    String s1 = "^[5-9]\\d{9}";

    public static void main(String[] args) {
        RegexDemo r1 = new RegexDemo();
        Pattern pattern = Pattern.compile(r1.s1);
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        Matcher m1 = pattern.matcher(s1);
        if(m1.matches()){
            System.out.println("Valid Number");
        }else{
            System.out.println("Invalid");
        }
    }
}
