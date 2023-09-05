package class11;

public class TStringMethods {
    public static void main(String[] args) {

        //write code that sill count how many x the letter A has appeared in the string
        String str="Batch 17 is great.";

        String input = "batch 17 is great";
        char targetChar = 'A';
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }

        System.out.println("The letter 'A' appears " + count + " times.");
    }



       // for (int i = 0; i < str.length(); i++) {
           // System.out.print(str.charAt(i));
        }

