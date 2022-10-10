
package codigo;

public class Person {
    private String name;
    private String age;
    private String password;
    private String passport;
    private boolean canSit;
    private Seat seat;
    
    Person() {      
    }
    public Person(String name, String age, String password, boolean canSit, String passport) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.canSit = canSit;
        this.passport = passport;
    }    

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
  
    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    public boolean getCanSit() {
        return canSit;
    }

    public void setCanSit(boolean canSit) {
        this.canSit = canSit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
