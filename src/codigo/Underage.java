
package codigo;

public class Underage extends Person {
    
    private boolean authorization;

    public boolean getAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }

    public Underage(boolean authorization, String name, String age, String password, boolean canSit, String passport) {
        super(name, age, password, canSit,passport);
        this.authorization = authorization;
    }   
    
}
