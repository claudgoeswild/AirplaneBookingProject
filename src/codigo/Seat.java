
package codigo;


public class Seat {

    public Person person;
    public boolean isFree;
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Seat(Person passanger) {
        person = passanger;
        this.isFree = false;
    }

    public Seat(boolean isFree) {
        this.isFree = isFree;
    }
}
