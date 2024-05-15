package class15;
/*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to calculate average grade. Test student class for 5
 different students with different marks. Your program should print an average mark of each student
 named.
 */
public class Student {
  private  String name;
  private   double marks1;
    private double marks2;
    private double marks3;
    Student (String sName, double sMarks1, double sMarks2, double sMarks3){
        name=sName;
        marks1=sMarks1;
        marks2=sMarks2;
        marks3=sMarks3;
    }
    public void printAvg(){
        double avg=(marks1+marks2+marks3)/3;
        System.out.println(name+ " Got " +avg);



    }
}
