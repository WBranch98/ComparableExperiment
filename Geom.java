package Shape;

public abstract class Geom implements Icompute, Comparable <Geom>{


    public abstract double area() ;


    public int compareTo(Geom cobject){

        if(this.area() > cobject.area()){
            return 1;
        }
        else if(this.area() < cobject.area()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
