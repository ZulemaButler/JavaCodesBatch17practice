package class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="Black";


         if (winter==true){
             System.out.println("Its very cold!");
             if(jacketColor.equals("Red")) {
               System.out.println("Let go with Red Nike shoes");
           } else{
               System.out.println("Let's go with the blue ones");
             }
         }else {
             System.out.println("No need to wear a jacket");

         }
    }
}
