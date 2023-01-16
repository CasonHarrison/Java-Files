public class Periodical extends Item {
    private int issueNum;
    public Periodical(){
    }
    public Periodical(String title, int issue){
        super.setTitle(title);
        this.issueNum=issue;
    }
    private int getIssueNum(){
        return this.issueNum;
    }
    public void setIssueNum(int newIssue){
        this.issueNum=newIssue;
    }
    public void getListing(){
        System.out.println("Periodical Title - "+getTitle()+"\nIssue# - "+getIssueNum());
    }
}
