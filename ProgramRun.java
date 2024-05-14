public class ProgramRun {
    public static void main(String[] args) {

        Student ron = new Student("Ron Anthony Sy");

        Book book = new Book("Hello World");
        Journal journal = new Journal("The History of Programming Languages");
        Article article = new Article("What is Java Programming Language");

        ron.borrowResource(book);
        ron.borrowResource(journal);
        ron.borrowResource(article);
    }
}
