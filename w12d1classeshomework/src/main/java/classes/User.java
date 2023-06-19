package classes;

public class User {

    private int copies;
    private int pages;
    public User(int pages,int copies){
        this.pages = pages;
        this.copies = copies;
    }

    public void reduceCopies(int num){
        this.copies -= num;
    }
    public int getCopies(){
        return this.copies;
    }

    public int getPages(){
        return this.pages;
    }
}
