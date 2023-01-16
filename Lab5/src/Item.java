public class Item {
    private String title;
    public Item(){
    }
    public Item(String newTitle){
       title=newTitle;
    }
    protected String getTitle(){
        return this.title;
    }
    protected void setTitle(String title) {
        this.title = title;
    }
    protected void getListing(){
    }
    public String toString(){
        return this.title;
    }
}
