public class Book {
    public String title="Booklet";
    public int page=100;
    public int addPages (int y){
       return page+=y;
    }
    public void printBook(){
        System.out.println("Title of the book: "+title+" Page count: "+page);
    }

}
