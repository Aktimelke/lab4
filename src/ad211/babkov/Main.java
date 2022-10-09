package ad211.babkov;

public class Main {

    public static void main (String[] args){
        Triangle t1 = new Triangle();
        double hypotenuse,perimeter,square;
        hypotenuse = t1.hypotenuse();
        System.out.println("hypotenuse of triangle is " + hypotenuse);
        perimeter = t1.perimeter(hypotenuse);
        System.out.println("Perimeter of triangle is "+ perimeter);
        square = t1.square();
        System.out.println("Square of triangle is "+ square);

        Sphere s = new Sphere(0.1,2,0);
        double squareOfSphere,circumference;
        squareOfSphere = s.square();
        System.out.println("Square of sphere is "+ squareOfSphere);
        circumference = s.circumference();
        System.out.println("circumference of sphere is "+circumference);

        Student[] s1 = new Student[3];

         s1[0] = new Student("Kaoru","Nagisa",4,211,99.9);
         s1[1] = new Student("Ikari","Sindzi",1,211,64.3);
         s1[2] = new Student("Aska","Lengli",1,211,75.1);
        s1[0].moveCourse();
        s1[1].moveCourse();
        s1[2].setAverage(89.9);
        for(Student o : s1){
            System.out.println("name: "+o.getName()+" surname: "+o.getSurname()+" course: "+o.getCourse()+" group: "+o.getGroup()+" average mark: "+o.getAverage()+" salary: "+o.salary(o.getAverage()));
        }

        Book[] b = new Book[2];
        b[0] = new Book("Elden Ring","Ya",2001,150,100);
        b[1] = new Book("Prikol","Ti",2003,250,200);
        for (Book b1 : b){
            b1.setAmount(20);
            System.out.println("name: "+b1.getName()+" author: "+b1.getAuthor()+" year: "+b1.getYear()+" price: "+b1.changePrice(b1.getPrice(),b1.getAmount())+" amount: "+b1.getAmount());
            System.out.println("price of all books: "+ b1.allPrice(b1.getPrice(), b1.getAmount()));
        }
    }
}
