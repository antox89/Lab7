

package angeltorres_lab7;

import java.io.Serializable;


public class Amigo extends Usuario implements Serializable{

    public Amigo() {
        super();
    }
    
    @Override
    public String toString() {
        return super.getNombre();
    }

}
