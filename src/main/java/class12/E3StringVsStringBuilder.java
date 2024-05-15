package class12;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {


        String name="Butler"; //immutable-- the contents cannot be changed
        name.toLowerCase();
        System.out.println(name);

        StringBuilder sb=new StringBuilder("Sunday");// this is mutable-- the contents can be changed
        sb.reverse();
        System.out.println(sb);



    }
}
