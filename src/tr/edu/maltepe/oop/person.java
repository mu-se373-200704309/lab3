package tr.edu.maltepe.oop;

import java.util.Vector;

public  class person implements Do_sport {
private String name;
    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

     Vector bag = new Vector<>() ;
    public  void addbook (book b ){
        bag.add(b);


    }




    @Override
    public void swimming( Sport_Center center) {
        System.out.println(getName()+" swimming");
 return;
    }

    @Override
    public void soccer(Sport_Center center) {

    }

    @Override
    public void swimming() {

    }

    @Override
    public void soccer() {
        System.out.println(getName()+" plays soccer ");
 return;
    }



}
