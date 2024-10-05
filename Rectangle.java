package Shape;

public class Rectangle extends Geom implements Icompute,Comparable<Geom> {
    private double width;
    private double height;

    public double area(){

        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }


    }

