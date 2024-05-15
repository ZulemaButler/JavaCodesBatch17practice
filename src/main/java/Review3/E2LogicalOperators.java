package Review3;

public class E2LogicalOperators {
    public static void main(String[] args) {

        boolean isMeat=!true;
        boolean isEgg=true;
        boolean isFish=!true;
        boolean milk=true;
        boolean veggies=true;

        boolean isProtein =isEgg||isFish||isMeat;
        boolean isGoodDiet =(isEgg||isMeat||isFish) &&milk&&veggies;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);
    }
}
