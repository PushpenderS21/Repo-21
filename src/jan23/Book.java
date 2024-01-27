package jan23;

public class Book {
    String title;
    String author;
    int publicationYear;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;

    }

    public void bookInfo() {
        System.out.println("Title of the book is : " + title);
        System.out.println("Author of the book is : " + author);
        System.out.println("Publication year of the book is : " + publicationYear);
    }


    public static void main(String[] args) {
        Book book1 = new Book("Story of my life", "Ram", 2001);
        System.out.println();
        Book book2 = new Book("The Truth", "james", 1985);
        System.out.println();
        Book book3 = new Book("The myth", "kamoi", 2015);
        book1.bookInfo();
        book2.bookInfo();


    }

}
