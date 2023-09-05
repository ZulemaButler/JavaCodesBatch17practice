package class9;

public class T4Array {
    public static void main(String[] args) {
        //Create 2D Array of cars: American, German, Korean, Italian.
        //the retrieve all values from that array using 2 different loops

        String[][] cars = {
                {"Jeep", "Benz", "Cadillac", "Mustang"},
                {"Audi", "Ford", "BMW", "Subaru"},
                {"Ford", "Kia", "Tesla", "Ferrari"},
                {"Honda", "Volkswagen", "Dodge", "Musty"},
        };

        for (String[] r : cars) {  //enhanced for loop
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("**************");
        for (int i=0; i< cars.length; i++){   //index based for loop
            for (int j =0; j < cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }


}
