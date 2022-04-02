package tr.edu.maltepe.oop;
import java.util.Vector;


    public class Sport_Center {
        private String name;
        private Vector human = new Vector();

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public void inSport_Center(person person) {

            human.add(person);
            System.out.println(person.getName() + " in the center");

        }


        public void outSport_Center(person person) {
            human.remove(person);
            System.out.println(person.getName() + " is not in the center");
        }

    }