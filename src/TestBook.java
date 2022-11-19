public class TestBook {

    public static void main(String[] args) {
        Author anAuthor =  new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);

        Book anotherBook = new Book("more Java for dummy", new Author("Tan Ah Teck 2", "ahteck@somewhere.com", 'm'), 29.95, 888);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());

        Book[] books = {
                new Book("Java for dummy 1", anAuthor, 19.95, 1000),
                new Book("Java for dummy 2", anAuthor, 29.95, 2000),
                new Book("Java for dummy 3", anAuthor, 39.95, 3000),
                new Book("Java for dummy 4", anAuthor, 49.95, 4000),
                new Book("Java for dummy 5", anAuthor, 59.95, 5000)
        };

        for (Book book: books) {
            System.out.println(book.toString());
        }

    }



}
