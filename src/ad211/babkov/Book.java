package ad211.babkov;

public class Book {
    private final String name;
    private final String author;
    private final int year;
    private final double price;
    private int amount;

    public Book(String name,String author,int year,double price,int amount){
        this.name=name;
        this.author=author;
        this.year=year;
        this.price=price;
        this.amount=amount;
    }
    public double changePrice(double p,int a){
        p= p * a*0.1;
        return p;
    }
    public double allPrice(double p, int a){
        double allPrice = a*p;
        return allPrice;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public int getAmount(){
        return amount;
    }

}
