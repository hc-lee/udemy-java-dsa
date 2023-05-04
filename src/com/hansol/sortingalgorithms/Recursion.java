package com.hansol.sortingalgorithms;

/*

Show recursion by demonstrating on the factorial algorithm.

Factorial Algorithm:

    1. Base case: if (num == 0) {return 1;}. Stop. Otherwise...
        2. set multiplier to 1
        3. set factorial to 1
        4. while (multiplier != num), do steps 5 and 6:
            5. multiply factorial by multiplier and assign the result to factorial
            6. add 1 to multiplier
    7. Stop. The result is the factorial.

    Iterative method is usually faster than recursive. There are tradeoffs when doing either.

 */


public class Recursion {

    public static void main(String[] args) {
        System.out.println("Iterative factorial: " + iterativeFactorial(5));
        System.out.println("Recursive factorial: " + recursiveFactorial(5));
    }

    public static int iterativeFactorial(int num){
        if (num == 0) {                         // By def, factorial(0) is 1. Handles 0 input.
            return 1;
        }
        int factorial = 1;                      // Initialize first factorial to 1.
        for (int i = 1; i <= num; i++) {        // Multiply 1 * 2 * 3..... * num
            factorial *= i;
        }
        return factorial;                       // Returns iterative factorial.
    }


    // This can be done recursively. Observe that n! = n(n-1)! by recursion relation of factorials. Then,
    public static int recursiveFactorial(int num) {
        if (num == 0) {                                     // Base case. Otherwise, you get infinite loop.
            return 1;
        }
        return num * recursiveFactorial(num - 1);           // Pushes recursiveFactorial(num-1) onto call stack. Repeats until base case.
    }

}
