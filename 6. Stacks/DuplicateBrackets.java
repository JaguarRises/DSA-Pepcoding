import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the expression: ");
        String str = scanner.nextLine();

        boolean ans = duplicateBrackets(str);

        System.out.println("Contains duplicate brackets? : " + ans);

        scanner.close();
    }

    private static boolean duplicateBrackets(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ')') {

                if (st.peek() == '(') {
                    return true;
                }
                else {
                    while (st.peek() != '(') {
                        st.pop();
                    }

                    st.pop();   // The '(' needs to be removed as well
                }

            }
            else {
                st.push(ch);
            }
        }

        return false;
    }
}