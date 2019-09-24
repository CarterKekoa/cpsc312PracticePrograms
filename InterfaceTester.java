import java.util.Arrays;
import java.util.Random;

public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println("Output 1: " + "zags".compareTo("apple"));
        System.out.println("Output 2: " + "zags".compareTo("Zags"));
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));

        Circle myCircle = new Circle();

        System.out.println("Output 7: " + myCircle.equals(myCircle));
        System.out.println("Output 8: " + new Circle().equals(new Circle()));

        /*
        What does compareTo() return when invoked with a String?
            <0 when the invoking obj is < the arg obj
            >0 when the invoking obj is > the arg obj
            0 when  the invoking obj is the same as the arg obj
        When would you use compareTo()?
            ordering, elements, sorting..
        What does equals() return when comparing Strings?
            boolean, true if the same string, false otherwise strings
            are immutable, so same string same object
        What does equals() return when comparing Circles?
            boolean, true if references refer to same object memory
            false otherwise
        In general, what is the purpose of equals()? (tricky)
            compare object references to see if they refer to the same object in memory
            that is what is inherited from Object
            ...you could override equals() and compare based on value
        What happens when you try to run the following code (output 9)? Any ideas for how to
         */

        System.out.println("Output 9: " + myCircle.compareTo(myCircle));
        //inheritance: a set of methods that a class promises to implement
        //Java provides a Comparable interface

        //an interface provides a reference type
        Comparable myComparable = myCircle; //another example of polymorphism

        //we can define our own interfaces!!
        Shape myShape = myCircle;

        //with Comparable, we can now sort our circles
        Circle[] myCircles = new Circle[5];
        Random rand = new Random();
        for(int i = 0; i < myCircles.length; i++){
            myCircles[i] = new Circle(i, i, rand.nextDouble());
        }
        System.out.println(Arrays.toString(myCircles));
        Arrays.sort(myCircles);
        System.out.println(Arrays.toString(myCircles));

        //task: define a Rectangle that is also a Shape
        //declare and initialize and array of Shape references
        //include a few Circles and Rectangles
        Rectangle rectangle = new Rectangle();

        Shape[] myShapes = new Shape[3];
        myShapes[0] = myCircle;
        myShapes[1] = rectangle;
        //myShapes[2] = new Rectangle(4,7);
        myShapes[2] = new Shape() {
            //5x5 square
            @Override
            public double computePerimeter() {
                return 20;
            }

            @Override
            public double computeArea() {
                return 25;
            }
        };


        for(Shape shape : myShapes){
            System.out.println(shape);
            System.out.println(shape.computePerimeter());
            System.out.println(shape.computeArea());
            System.out.println("**********************");
        }
    }
}
