package class11;

public class TStringMethods1 {

    public static void main(String[] args) {
        String str="hel";

            if (str.length()%2!=0&&str.length()>=3){ //this code prints out the middle character
              int middle=str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }
    }

