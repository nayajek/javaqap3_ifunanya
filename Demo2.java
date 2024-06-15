public class Demo2 {
    public static void main(String[] args) {
        //Create instances of the classes and test the methods
        Shape S = new Shape("Red", true);
        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0, "Blue", true);
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "Green", false);
        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0, "Yellow", true);
        
        //Test the methods and print the results
        System.out.println(S);
        System.out.println(C);
        System.out.println("Area: " + C.getArea() + ", Perimeter: " + C.getPerimeter());
        System.out.println(C1);
        System.out.println("Area: " + C1.getArea() + ", Perimeter: " + C1.getPerimeter());
        System.out.println(R);
        System.out.println("Area: " + R.getArea() + ", Perimeter: " + R.getPerimeter());
        System.out.println(R1);
        System.out.println("Area: " + R1.getArea() + ", Perimeter: " + R1.getPerimeter());
        System.out.println(Sq);
        System.out.println("Area: " + Sq.getArea() + ", Perimeter: " + Sq.getPerimeter());
        System.out.println(Sq1);
        System.out.println("Area: " + Sq1.getArea() + ", Perimeter: " + Sq1.getPerimeter());
    }
}