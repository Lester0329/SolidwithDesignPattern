package finals;

public class ProgramRun {
    public static void main(String[] args) {
        LibrarySystem.Student student = new LibrarySystem.Student("Mark Lester Laurente");

        Book book = new Book("Fundamentals of Programming");
        Journal journal = new Journal("El Filibusterismo");
        LibrarySystem.Article article = new LibrarySystem.Article("History of Philippines");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(article);
    }
}
