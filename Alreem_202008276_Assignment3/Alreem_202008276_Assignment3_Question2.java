package Main;

import java.util.*;

public class Alreem_202008276_Assignment3_Question2 {
    public static void main(String[] args) {
        System.out.println("Please enter the statement : ");
        System.out.println("The statement is : " + (checkCorrect(new Scanner(System.in).nextLine()) ? "" : "not") + " balanced.");
    }

    public static boolean checkCorrect(String statement) {
        Stack<Character> stack = new Stack<>();
        for (char c : statement.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else if (c == ')')
                if (stack.peek() == '(')
                    stack.pop();
        }
        return stack.isEmpty();
    }
}


