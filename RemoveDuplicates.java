/*
 * Here is my class that I will implement in order to solve the RemoveDuplicates problem.
 *
 * Author: Nick Burkett.
 * Date: 1/6/2025
 *
 * Status: SOLVED
 */
public class RemoveDuplicates{
        
        /*
         * Here is my solution function that will remove all duplicates in an array.
         *
         * @param int[] nums - Array passed in.
         * @return int - Return the new length of the array after I remove the duplicates.
         */
        public int removeDuplicates(int[] nums){
                
                if (nums.length == 0) {
                        return 0;
                }

                //InsertPos is where we will place the next unique number
                int insertPos = 1;

                //Go through the array starting at index 1
                for (int i = 1; i < nums.length; i++) {

                        //If current number is different from the previous number,
                        //This is a new unique element.
                        if (nums[i] != nums[i - 1]) {
                                nums[insertPos] = nums[i];
                                insertPos++;
                        }
                }

                //InsertPos is the count of unique elements
                return insertPos;
        }

        /*
         * Here is my main method for testing.
         */
        public static void main(String[] args){
                
                int[] testArr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};    //Create test data.

                RemoveDuplicates tmpObj = new RemoveDuplicates();     //Create instance of class for testing.

                System.out.println(tmpObj.removeDuplicates(testArr));

                for(int i = 0; i < testArr.length; i++){
                        System.out.println(testArr[i]);
                }

        }
}
