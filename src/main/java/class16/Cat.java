package class16;
/*
Create Cat class define six fields create multiple constructors to give flexibility to the end user. PrintInfo method
as well to print all the details of a cat.

 */
public class Cat {


        private String name;
        private String nickName;
        private String color;
        private int age;
        private char gender;
        private double weight;

        public void printInfo(){
            System.out.println(name+" "+nickName+" "+color+" "+age+" "+gender+" "+weight);
        }

        public Cat (){

        }
        public Cat (String name,String nickName,String color, int age){
            this.name=name;
            this.nickName=nickName;
            this.color=color;
            this.age=age;

        }
        public Cat (String name,String nickName,String color, int age, char gender){
            this(name, nickName, color, age);
            this.gender=gender;

        }
        public Cat (String name,String nickName,String color, int age, char gender, double weight){
            this(name, nickName, color, age, gender);
            this.weight=weight;

        }






    }



