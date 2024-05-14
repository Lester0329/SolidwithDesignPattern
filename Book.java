public class Book implements Resource{
    private String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing the book titled " + title);
    }
}
