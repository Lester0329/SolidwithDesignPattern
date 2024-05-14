public class ProgramRun {
    public static void main(String[] args) {

        Student NEU = new Student("Mark Lester Laurente");

        Book book = new Book("Hello World");
        Journal journal = new Journal("The History of Programming Languages");
        Article article = new Article("What is Java Programming Language");

        NEU.borrowResource(book);
        NEU.borrowResource(journal);
        NEU.borrowResource(article);
    }
}
