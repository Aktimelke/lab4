package ad211.babkov;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public Triangle(){
        param();
    }
    public Triangle(double a){
        param2();
    }
    private void param(){
        System.out.println("no parameters");
    }
    private void param2(){
        System.out.println("wrong parameters. You need base and height");
    }
    public double hypotenuse(){
        double h = Math.sqrt((Math.pow(base,2))+(Math.pow(height,2)));
        return h;
    }
    public double perimeter(double h){
        double p = base+height+h;
        return p;
    }
    public double square (){
        double s = (base + height)/2;
        return s;
    }
}
