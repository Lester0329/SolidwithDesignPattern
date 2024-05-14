public class Journal implements Resource{
    private String title;

    public Journal(String title){
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing the journal titled " + title);
    }
}
