package angeltorres_lab7;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void agregarUsuario(Usuario p) {
        this.listaUsuarios.add(p);
    }

    public int buscar(String user) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(user)) {
                return 0;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String s = "";
        for (Usuario u : listaUsuarios) {
            s += u.getNombre();
        }
        return s;
    }

    public void cargarArchivo() {
        try {

            listaUsuarios = new ArrayList();
            Usuario temp;

            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listaUsuarios.add(temp);
                    }
                } catch (EOFException e) {

                }
                objeto.close();
                entrada.close();
            }

        } catch (Exception e) {

        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(archivo, true);
            bw = new ObjectOutputStream(fw);
            for (Usuario e : listaUsuarios) {
                bw.writeObject(e);
            }
            bw.flush();

        } catch (Exception e) {

        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {

            }
        }
    }

    public void escribirTexto() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);

            for (Usuario u : listaUsuarios) {
                bw.write(u.getNombre() + ";");
                bw.write(u.getUsuario() + ";");
                bw.write(u.getPassword() + ";");
                bw.write(u.getEdad() + ";");

                for (Interes in : u.getListaIntereses()) {
                    bw.write(in.getInteres() + ",");
                }
                bw.write(";");
                bw.write(u.getDescripcion() + ";");
                bw.write(u.getPremium() + ";");
                bw.write(u.getSexo() + ";");

            }
            bw.flush();
        } catch (IOException e) {

        }
        bw.close();
        fw.close();

    }

    public void cargarArchivoT() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int edad;
                    String nombre, usuario, password, premium, sexo, desc;
                    ArrayList<Interes> temp = new ArrayList();
                    nombre = sc.next();
                    usuario = sc.next();
                    password = sc.next();
                    edad = sc.nextInt();

                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp.add(new Interes(s2.next()));
                    }
                    desc = sc.next();
                    premium = sc.next();
                    sexo = sc.next();

                    listaUsuarios.add(new Usuario(nombre, sexo, usuario, password, desc, premium, edad));
                    listaUsuarios.get(listaUsuarios.size() - 1).setListaIntereses(temp);;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }

}
