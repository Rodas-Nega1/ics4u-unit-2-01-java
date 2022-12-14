/*
 * This class creates an integer stack.
 *
 * @author  Rodas Nega
 * @version 1.0
 * @since   2022-10-05
*/

import java.util.ArrayList;
/**
*  Make class MrCoxallStack.
*/

public class RodasStack {
    /**
     * The number of revolutions of the peddles per minute.
    */
    private ArrayList<Integer> stackAsList = new ArrayList<Integer>();

    /**
     * The push() function.
     *
     * @param pushedNumber an element is implemented in an array
    */
    public void push(final int pushedNumber) {
        stackAsList.add(pushedNumber);
    }

    /**
     * The stackArray() function.
    */
    public void stackArray() {
        for (Integer arrayElement : stackAsList) {
            System.out.print(arrayElement);
        }
    }
}

