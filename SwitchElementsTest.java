/*
 * Program takes an array and returns the array with even indexes swapped
 * with the value at the index + 1. If the array is odd, the last value will
 * remain unchanged.
 *
 * Example: [1, 2, 3, 4, 5] -> [2, 1, 4, 3, 5]
 *
 * @author Stewart
 * @version JAVA 8, 7/15/2019
 */

public class SwitchElementsTest {
    /// main's parameter is an array of strings (String[]) named, 'args'
    /// (String[] args) is used to catch command line prompt data
    /// .length -> property of an array
    /// .length() -> method of strings
    public static void main(String[] args){

        /* Test Cases for program */
        int[] test1= {1, 2, 5, 6, 8, 9};
        int[] test2= {0, 5, 7, 8, 1, 3, -1};
        int[] test3= {5};

        /* Creates new instance of 'SwitchElements' named, 'switchE' */
        SwitchElements switchE = new SwitchElements();

        /* Runs the 'switchArrayElements' method with each of the test cases */
        switchE.switchArrayElements(test1);
        switchE.switchArrayElements(test2);
        switchE.switchArrayElements(test3);
    }
}
