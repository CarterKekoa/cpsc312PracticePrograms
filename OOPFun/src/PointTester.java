import java.util.Arrays;

public class PointTester {
    public static void main(String[] args) {
        Circle.Point pointOne = new Circle.Point();
        Circle.Point pointTwo = new Circle.Point(3, 4);

        //array of references
        Circle.Point[] points = new Circle.Point[5];
        //NO new point objects were not just made
        //we have to make them
        for(int i = 0; i < points.length; i++){
            points[i] = new Circle.Point(i, i); // actually making a Point object here
        }
        //print out the points array
        //static toString of the Arrays class
        System.out.println(Arrays.toString(points)); //Arrays is a class name, not a object reference name!!

        //task 3: in this project
        //create a Circle class and a CircleTester
        //Circle has a point (center) and a double (radius)
        //"has-a" relationship -> composition
        //"is-a" relationship -> inheritance
    }
}
