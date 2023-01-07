// Script Classes
public class Library {

    public class Book {
        private Author author;
        private String name;
        private Double price;
        private int qty = 0;

        public Book(String name, Double price, Author author, int qty){
            // method variables
            this.name=name;
            this.price=price;
            this.author=author;
            this.qty=qty;
        }

        public Book(String name, double price, Author author){
            // Variables
            this.name=name;
            this.price=price;
            this.author=author;
        } 

        // Getters
        public String getName(){
            return this.name;
        }
        public double getPrice() {
            return this.price;
        }
        public int getQty(){
            return this.qty;
        }
        public Author getAuthor(){
            return this.author;
        }
        // Setters
        public void setPrice(double price){
            this.price=price;
        }
        public void setQty(int qty){
            this.qty=qty;
        }
        
        @Override
        public String toString(){
            return "Book[name= " + name + ", Author[name= " + author.name + ", email= " + author.email + ", gender=" + author.gender + "], price=" + price +", qty= " + qty +"]";
        }
    }

    public class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
    }
    
    public static void main(String[] args) {
        Library newLibrary = new Library();
        Author firstAuthor = newLibrary.new Author("Sir Write A Lot", "dave@big-d.com", 'M');
        Book firstBook = newLibrary.new Book("Java Help Book", 9.99, firstAuthor);
        
        firstBook.setPrice(10.0);
        firstBook.setQty(1);

        
        Book secondBook =  newLibrary.new Book("Java Further Help Required", 15.99, firstAuthor);
        secondBook.setPrice(20.0);
        secondBook.setQty(0);
        
        System.out.println(firstBook);
        System.out.println(secondBook);
    }

}

