package ke_thua.Circle_Cylinder;

public class Cylinder extends Circle {
    public double height = 3;
    public Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }

    @Override
    public String toString(){
        return "Volume: "+getVolume()+" and "+
                super.toString();
    }

    public static void main(String[] args) {
        Cylinder h1=new Cylinder("red",1,2);
        System.out.println(h1);
    }
}
