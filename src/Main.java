public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Ernest", "Hemingway");

        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("The Old Man and the Sea", author2, 1952);

        // Инфо о книгах
        System.out.println("Book: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " "
                + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());

        System.out.println("Book: " + book2.getTitle() + ", Author: " + book2.getAuthor().getFirstName() + " "
                + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());

        // Изменяем год публикации
        book1.setPublicationYear(1873);
        System.out.println("Updated publication year for book " + book1.getTitle() + ": " + book1.getPublicationYear());
    }
}