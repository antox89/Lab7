

package angeltorres_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminUsuario {
    
    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public adminUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void agregarUsuario(Usuario p){
        this.listaUsuarios.add(p);
    }
    
    public void cargarArchivo(){
        try{
            
            listaUsuarios = new ArrayList();
            Usuario temp;
            
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while((temp=(Usuario)objeto.readObject())!=null){
                        listaUsuarios.add(temp);
                    }
                }catch(EOFException e){
                    
                }
                objeto.close();
                entrada.close();
            }
            
        }catch(Exception e){
            
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try{
            fw= new FileOutputStream(archivo);
            bw= new ObjectOutputStream(fw);
            for(Usuario e: listaUsuarios){
                bw.writeObject(e);
            }
            bw.flush();
            
        }catch(Exception e){
            
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(Exception e){
                
            }
        }
    }
    

}
