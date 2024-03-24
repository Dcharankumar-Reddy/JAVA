// Examaple on  while loop natural numbers from 10 to 1

public class While_loop_10_to_1 {

    public static void main(String[] args) {
        int count = 10; // Start with the last natural number
        System.out.println("First 10 Natural Numbers in Reverse:");

        // Loop to print the first 10 natural numbers in reverse order
        while (count >= 1) {
            System.out.println(count);
            count--; // Decrement count for the previous number
        }
    }
}

