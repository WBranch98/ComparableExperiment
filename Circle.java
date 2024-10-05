package Shape;

public class Circle extends Geom {

    private double radius;

    public double area(){

        return radius * radius * Math.PI;
    }

    public double perimeter(){

        return radius * 2 * Math.PI;
    }




//ArrayList<Integer>  ArrayList<Double>  ArrayList<String>  ArrayList<Rectangle>  ArrayList<House>
    //ArrayList<int>  - not legal

}
