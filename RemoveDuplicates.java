/*
 * Here is my class that I will implement in order to solve the RemoveDuplicates problem.
 *
 * Author: Nick Burkett.
 * Date: 1/6/2025
 *
 * Status: WIP
 */
public class RemoveDuplicates{
        
        /*
         * Here is my solution function that will remove all duplicates in an array.
         *
         * @param int[] nums - Array passed in.
         * @return int - Return the new length of the array after I remove the duplicates.
         */
        public int removeDuplicates(int[] nums){
                
                int len = nums.length;      //Need to save a var of nums.length to alter after I delete. 

                //Need to loop through the array nums.
                for(int i = 0; i < len; i++){
                        
                        //Need to check if I have encountered a duplicate.
                        if(nums[i] == nums[i+1]){

                                int count = 1;      //Set a counter var to keep track of the # of duplicates.
                                int itr = (i+1);    //Set a iterator that I will check for more duplicates after i.

                                //Need to check how many duplicates there are.
                                while(nums[itr] == nums[itr+1]){
                                        count += 1;     //Increment count.
                                        itr += 1;       //Increment itr to keep counting.

                                        //Here I check if we are about to increment to the last value in the array
                                        if(itr >= (len-1)){
                                                break;
                                        }
                                }

                                //Before I go ahead and start shifting items down, I need to check if I am duplicating to the end.
                                if((i + count) >= len){
                                        //If I end up in here, the rest of the duplicated array is at the end, so I don't need to do anything.
                                        len -= count; 
                                        break;
                                }

                                int itrV1 = (i+1);

                                while((itrV1 + count) < len){
                                        nums[itrV1] = nums[itrV1+count];      //Move all the elements down by count.
                                        itrV1 += 1;                       //Increment itrV1 to keep looping.
                                }

                                if(itrV1 == (len-1)){
                                        len -= 1; 
                                        break;
                                }

                                len -= count;       //Account for the elements I have removed/deleted.
                        }
                }

                return len;    //Return the # of elements in the array - the duplicates.
        }

        /*
         * Here is my main method for testing.
         */
        public static void main(String[] args){
                
                int[] testArr = {1, 1, 2};    //Create test data.

                RemoveDuplicates tmpObj = new RemoveDuplicates();     //Create instance of class for testing.

                System.out.println(tmpObj.removeDuplicates(testArr));

                for(int i = 0; i < testArr.length; i++){
                        System.out.println(testArr[i]);
                }

        }
}
