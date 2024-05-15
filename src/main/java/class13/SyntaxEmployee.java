package class13;
/*
Create a class called SyntaxEmployee:
Crete 3 variables empId, Salary, and set the CEO to "Sumair"
Create 2 obj of the class Syntax Employees
Set the value of eID, salary for each of the objects
Print out the eID, salary and CEO for each of the obj.
 */
public class SyntaxEmployee {

    String empID;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee Porscha=new SyntaxEmployee();
        Porscha.empID="T17";
        Porscha.salary=-20;

        SyntaxEmployee Zulema=new SyntaxEmployee();
        Zulema.empID="T18";
        Zulema.salary=22;
        System.out.println(Zulema.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(Zulema.CEO);
    }


    void printInfo(){
        System.out.println(empID+" " +salary+ " ");
    }
    void changeName(String employeeInfo){
        empID=employeeInfo;
    }
}
