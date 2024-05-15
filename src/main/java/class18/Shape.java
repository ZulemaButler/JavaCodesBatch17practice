package class18;
/*
Write a program: ShapeClass has a constructor that take the radius and has a subclass as a CircleClass. Inside the Circle Class create
method to calculate the are of the circle.
 */
public class Shape {
    float radius=3;


}
class circle extends Shape{

    void area(){
        double area=radius*radius*Math.PI;
        System.out.println("Area of circle : " + area);
    }
}
class test{
    public static void main(String[] args) {
        circle obj=new circle();
        obj.area();

    }
}

