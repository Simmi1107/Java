//Implementing non-Object-Oriented Application to find Area of Few Shapes

import java.util.Scanner;


class Square
{
    float length;
    float area;

    //Taking input from user
    public void acceptInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        length=sc.nextFloat();
        
    }

    //Calculating Area
    public void compute()
    {
        area=length*length;
    }

    //Displaying the result
    public void disp()
    {
        System.out.println("Area of square is: "+ area);
        System.out.println("******************************************************");
    }
}

class Rectangle
{
    float length;
    float breadth;
    float area;

    //Taking input from user
    public void acceptInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length=sc.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        breadth=sc.nextFloat();
        
        
    }

    //Calculating Area
    public void compute()
    {
        area=length*breadth;
    }

    //Displaying the result
    public void disp()
    {
        System.out.println("Area of rectangle is: "+ area);
        System.out.println("******************************************************");
    }
}


class Circle
{
    float radius;
    float area;

    //Taking input from user
    public void acceptInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius=sc.nextFloat();
        sc.close();
    }

    //Calculating Area
    public void compute()
    {
        area=3.141f*radius*radius;
    }

    //Displaying the result
    public void disp()
    {
        System.out.println("Area of circle is: "+ area);
        System.out.println("******************************************************");
    }
}

public class Launch1 
{
    public static void main(String[] args) 
    {
        Square s=new Square();                 //Creating refernce of Square class
        Rectangle r=new Rectangle();           //Creating refernce of Rectangle class
        Circle c=new Circle();                 //Creating refernce of Circle class

        //Method Calling using Square type reference

        s.acceptInput();
        s.compute();
        s.disp();

        //Method Calling using Rectangle type reference

        r.acceptInput();
        r.compute();
        r.disp();

        //Method Calling using Circle type reference

        c.acceptInput();
        c.compute();
        c.disp();
        
    }
}
