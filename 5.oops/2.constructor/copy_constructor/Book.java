class Book {
    private String name;
    private String pages;

    public Book(String name, String pages) {
        this.name = name;
        this.pages = pages;
    }

    public Book(Book other){
        this.name = other.name;
        this.pages = other.pages;
    }

    // public String getTitle(){
    //     return name;
    // }
    
    // public String getPages(){
    //     return pages;
    // }

    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Pages: "+pages);

    }

    public static void main(String[] args) {

        Book book = new Book("Jay Shivray", "10000");
        book.show();
        Book book1 = new Book(book);
        book1.show();
        // Create an original object using the parameterized constructor
        // Book originalBook = new Book("Effective Java", "Joshua Bloch");

        // // Create a copy of the original object using the copy constructor
        // Book copiedBook = new Book(originalBook);

        // // Print details to verify that the copy has the same values as the original
        // System.out.println("Original Book Title: " + originalBook.getTitle());
        // System.out.println("Original Book Author: " + originalBook.getPages());

        // System.out.println("Copied Book Title: " + copiedBook.getTitle());
        // System.out.println("Copied Book Author: " + copiedBook.getPages());
    }
}
