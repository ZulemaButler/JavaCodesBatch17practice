package class13;

public class SyntaxEmployee {

    String empID;
    int salary;
    static String CEO="Sumair";

    void printInfo(){
        System.out.println(empID+" " +salary+ " ");
    }
    void changeName(String employeeInfo){
        empID=employeeInfo;
    }
}
