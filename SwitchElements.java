public class SwitchElements {
    /* Private Attributes */
    private int[] arr;
    private String returnStr;

    public SwitchElements(){ }

    /** 
     * Method 'switchArrayElements' takes an array and prints the array with 
     * the values swapped for user to view. 
     *
     * @param arr The array the user would like to have swapped
     * @return void
     */
    public void switchArrayElements(int[] arr){
        /* Sets input array to the attribute array */
        this.arr = arr;
        /* adds the opening bracket to the string */
        this.returnStr = "[";

        /*
         * If the given array contains only 1 value, there is no need to swap any values.
         * the value of 'returnStr' is given a hard coded value 
         */
        if(this.arr.length == 1){
            this.returnStr += "" + this.arr[0] + "] --> [" + this.arr[0] + "]";
        /* Otherwise, the length of the array is greater than 1 and the following code can run */
        } else {

            /*
             * Adds the first value to the array to prevent an extra comma from 
             * appearing in 'returnStr'
             */
            this.returnStr += "" + this.arr[0];
            /*
             * Adds the values of 'this.arr' before any swaps to 'this.returnStr' to
             * preserve the values of 'this.arr' 
             */
            for(int i = 1; i < this.arr.length; i++){
                this.returnStr += ", " + this.arr[i];
            }
            /* Adds more syntax to make 'this.returnStr' look better */
            this.returnStr += "] --> [";

            /* For loop for swapping the even and odd values */
            for(int j = 0; j < this.arr.length; j += 2){
                /*
                 * Try to prevent out of bounds error from stopping the for loop
                 * in the case of the this.arr having an odd length.
                 * Alternative would be an if check and individual for loops for
                 * even and odd arrays.
                 */
                try{
                    /* Swaps the even values with the odd valeus */
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = temp;
                    /* 
                     * If there is an error (Out of bounds), program is told to 
                     * continue, the for loop will be stopped at the next check
                     * as the value of 'j' will then be greater than 'this.arr.lenght'.
                     */
                } catch(Exception e){
                    // System.out.println("ERROR: " + e);
                    continue;
                }
            }

            /*
             * Now that the 'this.arr' has had its elements swapped, loop through
             * 'this.arr' and add the values to 'this.returnStr'
             */
            this.returnStr += "" + this.arr[0];
            for(int k = 1; k < this.arr.length; k++){
                this.returnStr += ", " + this.arr[k];
            }
            this.returnStr += "]";
        }

        System.out.println(this.returnStr);
    }
}
