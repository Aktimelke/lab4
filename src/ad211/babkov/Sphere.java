package ad211.babkov;

public class Sphere {

    private double x;
    private double y;
    private double radius;

    public Sphere (double x,double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
        if(this.radius==0){
            point();
        }
    }

    public Sphere(){
     param();
    }

    private void param(){
        System.out.println("no parameters");
    }
    private void point(){
        System.out.println("This is not a sphere, it is a point with coordinates x = " + x +" y = " +y);
    }

    public double square(){
        double s = Math.PI*Math.pow(radius,2);
        return s;
    }

    public double circumference(){
        double c = 2*Math.PI*radius;
        return c;
    }

}
