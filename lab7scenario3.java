public class lab7scenario3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = b1;
        Book b3 = new Book();
        b3.title= b1.title;
        b3.page=b1.page;
        b2.addPages(20);
        b1.printBook();
        b2.printBook();
        // b2 does not create a new object instead it copies the reference of b1
        // addPages(20) modifies the page value of that single shared object
        // Since b1 and b2 refer to the same object both will show the updated page count
    }
}
