

package angeltorres_lab7;

import java.util.Date;


public class Cita {
    
    private Date fecha;
    private Usuario usuario;
    private String lugar;

    public Cita() {
    }

    public Cita(Date fecha, Usuario usuario, String lugar) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    

}
