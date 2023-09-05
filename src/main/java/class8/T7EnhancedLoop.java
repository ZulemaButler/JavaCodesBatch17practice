package class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {
        int [] nums = {10, 23, 25, 56, 45, 20,-10,-5};// negative number with 0

        for (int i =0; i <nums.length; i++){
            if (nums[i]<0){
                nums[i]=0;}
            //iter (shortcut) will fill an enhanced for loop if you go through the array and replace all the
            //have an array on top
            for (int num: nums){ //used the enhance for loop to print the updated number
               System.out.println(num);
           }
        }
        }


    }




