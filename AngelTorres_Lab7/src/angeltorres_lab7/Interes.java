

package angeltorres_lab7;

import java.io.Serializable;


public class Interes implements Serializable{
    
    private String interes;

    public Interes() {
    }

    public Interes(String interes) {
        this.interes = interes;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return interes;
    }
    
    

}
