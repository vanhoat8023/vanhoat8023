package ke_thua.Circle_Cylinder;

public class Circle {
    private String color = "blue";
    private double radius=1;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color=color;
        this.radius=radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "A Shape with color of"+
                getColor()+" and "+
                "radius: "+ getRadius();
    }

}
