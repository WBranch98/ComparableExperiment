package Shape;

public class Star {

    public class Rectangle extends Geom implements Icompute,Comparable<Geom> {
        private double width;
        private double height;

        public double area(){

            return width * height;
        }

        public double perimeter(){
            return 2 * (width + height);
        }

        public int compareTo(Geom robject) {
            if(this.area() > robject.area()){
                return 1;
            }
            else if(this.area() < robject.area()){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

}
