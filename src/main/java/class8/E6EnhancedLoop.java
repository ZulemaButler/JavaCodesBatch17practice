package class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {
        int [] nums = {10, 23, 25, 56, 45, 20};//Print all the even numbers one by one from this
        for (int i =0; i< nums.length; i++) {  //array using enhanced for loop

            if (nums[i] > 20) {
                nums[i] = 0; //this code will replace whatever is inside

            }
            System.out.println(nums[i]);
        }


    }



}
