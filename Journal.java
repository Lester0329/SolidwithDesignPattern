package finals;

public class Journal implements Resource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }
    public void borrow(LibrarySystem.Student student) {
        System.out.println(LibrarySystem.Student.getName() + " is borrowing the journal with a title of " + title);
    }
}
