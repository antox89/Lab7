

package angeltorres_lab7;

import java.io.Serializable;


public class Bloqueado extends Usuario implements Serializable{

    public Bloqueado() {
        super();
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    

}
