package exercise_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Mohammad Asheri", "mhm.asheri@gmail.com", 'm');
        System.out.println(author);
        author.setEmail("hadi.asheri@gmail.com");
        System.out.println("Name is: " + author.getName());
        System.out.println("Eamil is: " + author.getEmail());
        System.out.println("Gender is: " + author.getGender());

        Book dummyBook = new Book("Java for me", author, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()
    }
}
