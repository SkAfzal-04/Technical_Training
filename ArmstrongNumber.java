import java.util.Scanner;
public class ArmstrongNumber {
    


    public static boolean isArmstrong(int num) {
        int original = num;
        int power = String.valueOf(num).length();
        int result = 0;

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, power);
            num /= 10;
        }

        return result == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inp = sc.nextInt();
        
        if (isArmstrong(inp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

    

