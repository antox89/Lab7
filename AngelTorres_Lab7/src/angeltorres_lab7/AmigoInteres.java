

package angeltorres_lab7;

import java.io.Serializable;


public class AmigoInteres extends Usuario implements Serializable{

    public AmigoInteres() {
        super();
    }
    
    @Override
    public String toString() {
        return super.getNombre();
    }

}
