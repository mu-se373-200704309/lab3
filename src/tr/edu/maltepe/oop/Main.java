package tr.edu.maltepe.oop;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	book b1 = new book("b1");
        book b2 = new book("b2");
        book b3 = new book("b3");
    library lib =new library("lib");
    student s = new student("yaren");
    professor p =new professor("ensar");
    Sport_Center center =new Sport_Center() ;

    lib.addbook(b1);
    lib.addbook(b2);
    lib.addbook(b3);

    lib.lendbook(b1,s);
    s.returnbook(lib,b1);
    lib.lendbook(b2,p);
    lib.lendbook(b3,s);
    s.returnbook(lib,b3 );
    p.returnbook(lib,b2);


    center.inSport_Center(s);
    center.inSport_Center(p);
    center.outSport_Center(s);
    center.outSport_Center(p);
  s.soccer();

    }
}
