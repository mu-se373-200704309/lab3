package tr.edu.maltepe.oop;

import java.util.Vector;

public class library {
    private String name ;
    private Vector v = new Vector<>();
    library (String name) {
        this.name = name ;


    }
 public void addbook (book b) {
     v.add(b);
 }
 public void lendbook (book b,student s ){
        s.addbook(b);
        System.out.println(b.getname()+" is lend to "+ s.getName() );
        v.remove(b);
 }
    public void lendbook (book b,professor p ){
        p.addbook(b);
        System.out.println(b.getname()+" is lend to "+ p.getName() );
        v.remove(b);
    }
}
