package HybridInheritance;

public class LibraryDemo {
    public static void main(String[] args) {
        // EBook Object - Shows Multilevel chain
        EBook ebook = new EBook();
        ebook.setTitle("Java Programming");
        ebook.setItemId(1001);
        ebook.setAuthor("James Gosling");
        ebook.setFileSize(25.5);

        System.out.println("--- EBook Details ---");
        ebook.displayItemDetails();
        ebook.displayBookDetails();
        ebook.displayEBookDetails();

        System.out.println("\n--- Magazine Details ---");
        // Magazine Object - Shows Hierarchical branch
        Magazine mag = new Magazine();
        mag.setTitle("Tech Today");
        mag.setItemId(1002);
        mag.setIssueNumber(45);

        mag.displayItemDetails();
        mag.displayMagazineDetails();
    }
}