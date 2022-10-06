/*
* This program usew the RodasStack
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-10-06
*/

import java.util.Scanner;
/**
* Class Main.
*/

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        // use MrCoxallStack class
        final RodasStack newStack = new RodasStack();

        System.out.print("Enter an integer: ");
        final int userNumber = myObj.nextInt();
        newStack.Push(userNumber);

        newStack.StackArray();

        System.out.println("\nDone.");
    }
}
