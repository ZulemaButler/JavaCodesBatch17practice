package class19;
/*Great a class named "Programming". While creating an object of the class, if nothing is passed to it,
then the message "I love programming" should be printed. If some String is passed to it, then in place of "programming
languages" the value variable should be printed. Ex: if we pass "Java" then "I love Java" should be printed.

 */
public class Programming {

    public Programming(){
        System.out.println("I love programming languages");
    }
    public Programming(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        new Programming("Java");
    }
}
