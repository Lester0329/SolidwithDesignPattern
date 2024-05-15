package finals;

public class LibrarySystem {

    // Class Article implements Resource
    static class Article implements Resource {
        private String title;

        public Article(String title) {
            this.title = title;
        }


        public void borrow(Student student) {
            System.out.println(student.getName() + " is borrowing the article with a title of " + title);
        }
    }

    // Class Student
    static class Student {
        private static String name;

        public Student(String name) {
            this.name = name;
        }

        public static String getName() {
            return name;
        }

        public void borrowResource(Resource resource) {
            resource.borrow(this);
        }
    }
}
