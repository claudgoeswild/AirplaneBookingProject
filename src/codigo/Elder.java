
package codigo;


public class Elder extends Person {
    
    private boolean elderPass;    

    public boolean getElderPass() {
        return elderPass;
    }

    public void setElderPass(boolean elderPass) {
        this.elderPass = elderPass;
    }

    public Elder(boolean elderPass, String name, String age, String password, boolean canSit, String passport) {
        super(name, age, password, canSit, passport);
        this.elderPass = elderPass;
    }
}
