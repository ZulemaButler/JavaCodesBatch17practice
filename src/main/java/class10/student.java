package class10;

public class student {
    //creating a design
    String name;  //this is called Properties/Attributes of that object
    int age;   //when we design we don't need a main matter. but when we execute
    String id;

    // This "void" is called Methods/Functions/behavior
    void study(){ //this called Methods/functions/behaviours
        System.out.println("Studying 16 hours a day...." +name);
    }


    public static void main(String[] args) {
        //we are creating an actual student by using the student Class
        student zulemaObj =new student();
        zulemaObj.name= "Zulema";

        zulemaObj.age=21;
        zulemaObj.id="abc123";
        zulemaObj.study(); //scanner.nextInt();


        student ishObj=new student();
        ishObj.name="Ish";
        ishObj.age=18;
        ishObj.id="66754";
        ishObj.study();



    }

}


