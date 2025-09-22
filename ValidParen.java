import java.util.Scanner;
import java.util.Stack;

public class ValidParen {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (c == ')' && st.peek() != '(') {
                    return false;
                } else if (c == '}' && st.peek() != '{') {
                    return false;
                } else if (c == ']' && st.peek() != '[') {
                    return false;
                }
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] argh) {
        ValidParen v = new ValidParen();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            v.isValid(input);
        }
        sc.close();
    }
}
