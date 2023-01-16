public class Book extends Item {
    private int isbn_number;
    private String author;
    public Book(){
    }
    public Book(String title, String author,int isbn_number){
        super.setTitle(title);
        this.isbn_number=isbn_number;
        this.author=author;
    }
    private String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author1){
        author=author1;
    }
    private int getIsbn_number(){
        return isbn_number;
    }
    public void getListing(){
        System.out.println("Book name - "+getTitle()+"\nAuthor - "+getAuthor()+"\nISBN# - "+getIsbn_number());
    }
}
