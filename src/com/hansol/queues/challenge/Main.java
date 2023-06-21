package com.hansol.queues.challenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        String lower = string.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z') {
                queue.add(lower.charAt(i));
                stack.push(lower.charAt(i));
            }
        }

        // Peek instead of removing. No need to do extra work to check equality.
        for (int j = 0; j < stack.size(); j++) {
            if (stack.peek() != queue.peek()) {
                return false;
            }
            queue.remove();
            stack.pop();
        }
        // All characters same in reverse <-> forward order.
        return true;
    }
}
