import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the expression: ");
        String str = scanner.nextLine();

        boolean ans = isBalancedBrackets(str);

        System.out.println(ans);

        scanner.close();
    }

    private static boolean isBalancedBrackets(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }

            if(ch == ')'){
                if(st.isEmpty() || st.peek() != '('){       // non-empty means more closing brackets
                    return false;
                }
                st.pop();
            }
            else if(ch == '}'){
                if(st.isEmpty() || st.peek() != '{'){
                    return false;
                }
                st.pop();
            }
            else if(ch == ']'){
                if(st.isEmpty() || st.peek() != '['){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();        // If the stack was balanced, all brackets must have been removed and stack would be empty
    }
}