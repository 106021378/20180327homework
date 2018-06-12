import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Shop sh = new Shop();
        sh.lisp();
        ArrayList<Book> book1 = new ArrayList<>();
        String title;
        String author;
        String publisher;
        String ibsn;
        int price;
        boolean flag = true;
        while(flag){
            int n = scn.nextInt();
            switch (n){
                case 1:
                    System.out.println("書名");
                    title = scn.next();
                    System.out.println("作者");
                    author = scn.next();
                    System.out.println("出版");
                    publisher = scn.next();
                    System.out.println("ISBN");
                    ibsn = scn.next();
                    if (ibsn.length()==13){
                        ibsn = ibsn;
                    }else{
                        ibsn = "error";
                    }
                    System.out.println("價錢");
                    price = scn.nextInt();
                    Book book2 = new Book(title,author,publisher,ibsn,price);
                    book1.add(book2);
                    break;
                case 2:
                    for (int i=0;i<book1.size();i++){
                        Book book3 = (Book) book1.get(i);
                        if (book3.getTitle().equals(scn.next())){
                            book3.showinfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println(book1.size());
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}

