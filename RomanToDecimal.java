import java.util.HashMap;
import java.util.Scanner;

public class RomanToDecimal {

    public static int romanToDecimal(String s) {
        s = s.toUpperCase(); // Make case-insensitive
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = roman.get(ch);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman symbol: ");
        String roman = sc.nextLine();
        int decimal = romanToDecimal(roman);
        System.out.println("Decimal value: " + decimal);
        sc.close();
    }
}
