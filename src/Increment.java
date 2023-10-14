public class Increment {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Initial value of x: " + x);
        // Useful info: x=x+1 is the same as x+=1 is the same as x++
        // postfix
        // Post-increment: Use the current value of x and then increment
        System.out.println("Post-increment (x++): " + x++); // Postfix (x++): 4
        System.out.println("Value of x after post-increment: " + x); // Value of x after post-increment: 5

        // Reset x to 4
        x = 4;
        // prefix
        // Pre-increment: Increment x and then use the updated value
        System.out.println("Pre-increment (++x): " + ++x); // Prefix (++x): 5
        System.out.println("Value of x after pre-increment: " + x); // Value of x after pre-increment: 5
    }
}
