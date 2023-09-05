package class8;

public class T6EnhancedLoop {
    public static void main(String[] args) {
        int [] nums = {10, 23, 25, 56, 45, 20,-10,-5};//Find the smallest number "10" from this array

        int smallest=nums[0];
        for(int n:nums){
            if (n<smallest){
                smallest = n;
            }
        }
        System.out.println(smallest);
        }


    }




