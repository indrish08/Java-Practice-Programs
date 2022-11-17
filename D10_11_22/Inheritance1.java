package D10_11_22;

class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

}
class Book{
    private String bookName;

    private double price;
    private int qtyInStock;
    public Book(String bookName, double price, int qtyInStock){
        this.bookName=bookName;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    protected String getBookName(){
        return bookName;
    }
}

public class Inheritance1{
    public static void main(String[] args) {
        Book abook = new Book("java",200,5);
        System.out.println(abook.getBookName());
    }
}
