package binus.datastructure.palindrome;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Palindrome {
    private Stack<Character> stack = new Stack<Character>();
    private Queue<Character> queue = new LinkedList<Character>();

    public Boolean checkPalindromeStack(String input) {
        // Strip the input string from spaces and make it lowercase
        input = input.replaceAll("\\s", "");
        input = input.toLowerCase();

        // Input character by character to stack
        for (int i = 0; i < input.length(); i++) {
            this.stack.push(input.charAt(i));
        }

        // Reverse the input string
        String reverse = "";
        while (!this.stack.isEmpty()) {
            reverse += this.stack.pop();
        }

        // Compare the input string with the reversed string
        if (input.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean checkPalindromeQueue(String input) {
        // Strip the input string from spaces and make it lowercase
        input = input.replaceAll("\\s", "");
        input = input.toLowerCase();

        // Input character by character to queue
        for (int i = 0; i < input.length(); i++) {
            this.queue.add(input.charAt(i));
        }

        // Reverse the input string, the hacky way
        Character[] reverseArray = new Character[input.length()];
        int i = input.length() - 1;
        while (!this.queue.isEmpty()) {
            reverseArray[i] = this.queue.remove();
            i--;
        }
        String reverse = "";
        for (Character c : reverseArray) {
            reverse += c;
        }

        // Compare the input string with the reversed string
        if (input.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
