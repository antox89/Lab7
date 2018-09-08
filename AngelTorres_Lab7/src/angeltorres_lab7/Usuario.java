

package angeltorres_lab7;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;


public class Usuario implements Serializable{
    
    private String nombre, sexo, usuario, password, descripcion;
    private int edad;
    private Icon foto;
    private ArrayList<Interes> listaIntereses = new ArrayList();
    private ArrayList<Amigo> listaAmigos = new ArrayList();
    private ArrayList<Mensaje> listaMensaje = new ArrayList();
    private ArrayList<Solicitud> listaSolicitud = new ArrayList();
    private ArrayList<Cita> listaCalendario = new ArrayList();
    private ArrayList<Bloqueado> listaBloqueados = new ArrayList();
    private String premium;
    
    private static final long SerialVersionUID=444L;

    public Usuario() {
    }

    public Usuario(String nombre, String sexo, String usuario, String password, String descripcion, Icon foto, String premium, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.usuario = usuario;
        this.password = password;
        this.descripcion = descripcion;
        this.foto = foto;
        this.premium = premium;
        this.edad = edad;
    }
    
    public Usuario(String nombre, String sexo, String usuario, String password, String premium, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.usuario = usuario;
        this.password = password;
        this.premium = premium;
        this.edad = edad;
    }
    
    //
    public void agregarInteres(Interes i){
        this.listaIntereses.add(i);
    }
    
    public void agregarAmigo(Amigo a){
        this.listaAmigos.add(a);
    }
    
    public void agregarMensaje(Mensaje m){
        this.listaMensaje.add(m);
    }
    
    public void agregarSolicitud(Solicitud s){
        this.listaSolicitud.add(s);
    }
    
    public void agregarCita(Cita c){
        this.listaCalendario.add(c);
    }
    
    public void agregarBloqueado(Bloqueado b){
        this.listaBloqueados.add(b);
    }
    //

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Cita> getListaCalendario() {
        return listaCalendario;
    }

    public void setListaCalendario(ArrayList<Cita> listaCalendario) {
        this.listaCalendario = listaCalendario;
    }

    public ArrayList<Bloqueado> getListaBloqueados() {
        return listaBloqueados;
    }

    public void setListaBloqueados(ArrayList<Bloqueado> listaBloqueados) {
        this.listaBloqueados = listaBloqueados;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public ArrayList<Interes> getListaIntereses() {
        return listaIntereses;
    }

    public void setListaIntereses(ArrayList<Interes> listaIntereses) {
        this.listaIntereses = listaIntereses;
    }

    public ArrayList<Amigo> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<Amigo> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    public ArrayList<Mensaje> getListaMensaje() {
        return listaMensaje;
    }

    public void setListaMensaje(ArrayList<Mensaje> listaMensaje) {
        this.listaMensaje = listaMensaje;
    }

    public ArrayList<Solicitud> getListaSolicitud() {
        return listaSolicitud;
    }

    public void setListaSolicitud(ArrayList<Solicitud> listaSolicitud) {
        this.listaSolicitud = listaSolicitud;
    }

    public ArrayList<Cita> getCalendario() {
        return listaCalendario;
    }

    public void setCalendario(ArrayList<Cita> calendario) {
        this.listaCalendario = calendario;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }
    
    
    
    
    
    
    

}
