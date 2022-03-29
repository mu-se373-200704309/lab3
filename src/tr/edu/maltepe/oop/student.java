package tr.edu.maltepe.oop;

public class student extends person {
    private String name ;
    student (String name ){
        this.name =name ;

    }

    public String getName() {
        return this.name;
    }

    public void returnbook(library lib, book b) {
        lib.addbook(b);
        System.out.println(this.name + " returned " + b.getname()+ " to library");
        bag.remove(b);

    }
}
