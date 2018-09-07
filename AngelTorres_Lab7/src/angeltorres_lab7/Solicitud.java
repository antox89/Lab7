

package angeltorres_lab7;

import java.io.Serializable;


public class Solicitud implements Serializable{
    
    private boolean aceptar, rechazar;

    public Solicitud() {
    }

    public Solicitud(boolean aceptar, boolean rechazar) {
        this.aceptar = false;
        this.rechazar = false;
    }

    public boolean isAceptar() {
        return aceptar;
    }

    public void setAceptar(boolean aceptar) {
        this.aceptar = aceptar;
    }

    public boolean isRechazar() {
        return rechazar;
    }

    public void setRechazar(boolean rechazar) {
        this.rechazar = rechazar;
    }
    
    

}
