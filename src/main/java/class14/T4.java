package class14;
//create a method that will accept a String as a parameter and return a new String that consist only of vowels.
//Method should be available inside the class only where it was declared and executed by calling its name.
public class T4 {
    public static void main(String[] args)


    {
        System.out.println(vowels("Well hello, my Darlings"));
    }
  private  static String vowels(String str) {  //the answer
     return  str.replaceAll("[aeiouAEIOU]", "");

  }

    }


