import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesesSeq {


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);  
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a parentheses sequence: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("The sequence is VALID.");
        } else {
            System.out.println("The sequence is NOT valid.");
        }

        sc.close();
    }
}
