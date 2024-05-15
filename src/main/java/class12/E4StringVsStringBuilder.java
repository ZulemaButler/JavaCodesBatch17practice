package class12;

public class E4StringVsStringBuilder {
    public static void main(String[] args) {
        String name1, name2, name3,name4;
        name1="I love you";
        name2="I love you";
        name3="I love you";
        name4="I love you";

        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();

    }
}
