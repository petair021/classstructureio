package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Ryan Holiday", "Ego is the enemy");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());

        Book newBook = new Book("James Clear", "Atomic habits");
        System.out.println(newBook.getAuthor());
        System.out.println(newBook.getTitle());
    }

}
