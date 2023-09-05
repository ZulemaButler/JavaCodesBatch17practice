package class8;

public class MightHaveToDelete {
    public static void main(String[] args) {
        //hacve to search the array for number 45
        int [] nums = {10, 23, 25, 56, 45, 20};
        for (int i =0; i< nums.length; i++) {

            if (nums[i] > 20) {
                nums[i] = 0;

            }
            System.out.println(nums[i]);
        }


    }



}
