package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
	book b1 = new book("b1");
        book b2 = new book("b2");
        book b3 = new book("b3");
    library lib =new library("lib");
    student s = new student("yaren");
    professor p =new professor("ali");


    lib.addbook(b1);
    lib.addbook(b2);
    lib.addbook(b3);

    lib.lendbook(b1,s);
    s.returnbook(lib,b1);
    lib.lendbook(b2,p);
    lib.lendbook(b3,s);
    s.returnbook(lib,b3 );
     p.returnbook(lib,b2);

    }
}
