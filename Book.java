package finals;

public class Book implements Resource {
    private String title;

    public Book(String title) {
        this.title = title;
    }


    public void borrow(LibrarySystem.Student student) {
        System.out.println(student.getName() + " is borrowing the book with a title of " + title);
    }
}
