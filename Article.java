public class Article implements Resource{
    private String title;

    public Article(String title){
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " is borrowing the article titled " + title);
    }
}
