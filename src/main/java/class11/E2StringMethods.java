package class11;

public class E2StringMethods {
    public static void main(String[] args) {

        //write a code that wil count how many time the letter A has appeared in teh string
        String str="Batch 17 is A great.Just Kidding. Please don't take it seriously";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
           // System.out.print(str.charAt(i)); // this prints out what's inside of " "

            if (str.charAt(i)=='a'|| str.charAt(i)=='A'){
                count++;
            }}
              System.out.println(count);

    }

}
