package class8;

public class T5EnhancedLoop {
    public static void main(String[] args) {
        //find the largest even number

        int [] nums= {10, 77, 25, 56, 60, 20};

        int largest =nums[2];
        for (int d:nums){
            if (d>largest&& d%2==0) {
                largest = d;

            }
        }
        System.out.println(largest);
    }
}
