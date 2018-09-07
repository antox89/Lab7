
package angeltorres_lab7;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        
        if(rb_m.isSelected()){
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_mensaje = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jd_login = new javax.swing.JDialog();
        jd_registro = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        tf_registro_nombre = new javax.swing.JTextField();
        tf_registro_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rb_m = new javax.swing.JRadioButton();
        rm_f = new javax.swing.JRadioButton();
        sp_registro_edad = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        tf_registro_passwrd = new javax.swing.JPasswordField();
        checkox_registro = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        bt_registrar_selectFoto = new javax.swing.JButton();
        lb_registro_foto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chb_registro_correr = new javax.swing.JCheckBox();
        chb_registro_bailar = new javax.swing.JCheckBox();
        chb_registro_cantar = new javax.swing.JCheckBox();
        chb_registro_comer = new javax.swing.JCheckBox();
        chb_registro_viajar = new javax.swing.JCheckBox();
        chb_registro_nadar = new javax.swing.JCheckBox();
        chb_registro_techno = new javax.swing.JCheckBox();
        chb_registro_metal = new javax.swing.JCheckBox();
        chb_registro_science = new javax.swing.JCheckBox();
        chb_registro_art = new javax.swing.JCheckBox();
        chb_registro_anime = new javax.swing.JCheckBox();
        chb_registro_musica = new javax.swing.JCheckBox();
        chb_registro_saltar = new javax.swing.JCheckBox();
        chb_registro_biz = new javax.swing.JCheckBox();
        chb_registro_sports = new javax.swing.JCheckBox();
        chb_registro_news = new javax.swing.JCheckBox();
        chb_registro_tvshows = new javax.swing.JCheckBox();
        chb_registro_movies = new javax.swing.JCheckBox();
        bt_registro_signup = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_usuarioRegistrados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_test = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jlb_foto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        rb_cuenta_m = new javax.swing.JRadioButton();
        rb_cuenta_f = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        chb_registro_correr1 = new javax.swing.JCheckBox();
        chb_registro_bailar1 = new javax.swing.JCheckBox();
        chb_registro_cantar1 = new javax.swing.JCheckBox();
        chb_registro_comer1 = new javax.swing.JCheckBox();
        chb_registro_viajar1 = new javax.swing.JCheckBox();
        chb_registro_nadar1 = new javax.swing.JCheckBox();
        chb_registro_techno1 = new javax.swing.JCheckBox();
        chb_registro_metal1 = new javax.swing.JCheckBox();
        chb_registro_science1 = new javax.swing.JCheckBox();
        chb_registro_art1 = new javax.swing.JCheckBox();
        chb_registro_anime1 = new javax.swing.JCheckBox();
        chb_registro_musica1 = new javax.swing.JCheckBox();
        chb_registro_saltar1 = new javax.swing.JCheckBox();
        chb_registro_biz1 = new javax.swing.JCheckBox();
        chb_registro_sports1 = new javax.swing.JCheckBox();
        chb_registro_news1 = new javax.swing.JCheckBox();
        chb_registro_tvshows1 = new javax.swing.JCheckBox();
        chb_registro_movies1 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        jLabel2.setText("Para:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "........." }));

        jLabel3.setText("Asunto:");

        jLabel4.setText("Mensaje:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Enviar");

        javax.swing.GroupLayout jd_mensajeLayout = new javax.swing.GroupLayout(jd_mensaje.getContentPane());
        jd_mensaje.getContentPane().setLayout(jd_mensajeLayout);
        jd_mensajeLayout.setHorizontalGroup(
            jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mensajeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jd_mensajeLayout.createSequentialGroup()
                        .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jd_mensajeLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jd_mensajeLayout.setVerticalGroup(
            jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mensajeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_registro.setTitle("Tander :: Registro");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Usuario:");

        jLabel7.setText("Sexo:");

        jLabel8.setText("Edad:");

        buttonGroup1.add(rb_m);
        rb_m.setSelected(true);
        rb_m.setText("M");

        buttonGroup1.add(rm_f);
        rm_f.setText("F");

        sp_registro_edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 99, 1));

        jLabel9.setText("Password:");

        checkox_registro.setText("Premium");

        jLabel10.setText("Foto:");

        bt_registrar_selectFoto.setText("Seleccionar...");
        bt_registrar_selectFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrar_selectFotoMouseClicked(evt);
            }
        });

        lb_registro_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angeltorres_lab7/180x220_pp.jpg"))); // NOI18N

        jLabel11.setText("Intereses:");

        chb_registro_correr.setText("Correr");

        chb_registro_bailar.setText("Bailar");

        chb_registro_cantar.setText("Cantar");

        chb_registro_comer.setText("Comer");

        chb_registro_viajar.setText("Viajar");

        chb_registro_nadar.setText("Nadar");

        chb_registro_techno.setText("Techno");

        chb_registro_metal.setText("Metal");

        chb_registro_science.setText("Science");

        chb_registro_art.setText("Art");

        chb_registro_anime.setText("Anime");

        chb_registro_musica.setText("Musica");

        chb_registro_saltar.setText("Saltar");

        chb_registro_biz.setText("Biz");

        chb_registro_sports.setText("Sports");

        chb_registro_news.setText("News");

        chb_registro_tvshows.setText("TV Shows");

        chb_registro_movies.setText("Movies");

        bt_registro_signup.setText("Registrar");
        bt_registro_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registro_signupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_registrar_selectFoto)
                            .addGroup(jd_registroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_registro_foto)))
                        .addGap(57, 57, 57)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_registro_correr)
                            .addComponent(chb_registro_bailar)
                            .addComponent(chb_registro_cantar)
                            .addComponent(chb_registro_comer)
                            .addComponent(chb_registro_viajar)
                            .addComponent(chb_registro_nadar))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_registro_musica)
                            .addComponent(chb_registro_anime)
                            .addComponent(chb_registro_art)
                            .addComponent(chb_registro_science)
                            .addComponent(chb_registro_metal)
                            .addComponent(chb_registro_techno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_registro_movies)
                            .addComponent(chb_registro_tvshows)
                            .addComponent(chb_registro_news)
                            .addComponent(chb_registro_sports)
                            .addComponent(chb_registro_biz)
                            .addComponent(chb_registro_saltar))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9))
                                    .addGroup(jd_registroLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel5)))
                                .addComponent(jLabel8))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_registroLayout.createSequentialGroup()
                                .addComponent(rb_m)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rm_f)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkox_registro))
                            .addComponent(tf_registro_user)
                            .addComponent(sp_registro_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_registro_passwrd)
                            .addComponent(tf_registro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_registro_signup)
                        .addGap(66, 66, 66))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(130, 130, 130))
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registroLayout.createSequentialGroup()
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_registro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_registro_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_registroLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(bt_registro_signup)))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_registro_passwrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sp_registro_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rb_m)
                    .addComponent(rm_f)
                    .addComponent(checkox_registro))
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_registro_foto)
                    .addComponent(jLabel10)
                    .addGroup(jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_registroLayout.createSequentialGroup()
                            .addComponent(chb_registro_musica)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_anime)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_art)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_science)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_metal)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_techno))
                        .addGroup(jd_registroLayout.createSequentialGroup()
                            .addComponent(chb_registro_correr)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_bailar)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_cantar)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_comer)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_viajar)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_nadar))
                        .addGroup(jd_registroLayout.createSequentialGroup()
                            .addComponent(chb_registro_movies)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_tvshows)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_news)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_sports)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_biz)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_saltar))))
                .addGap(18, 18, 18)
                .addComponent(bt_registrar_selectFoto)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tander");

        jl_usuarioRegistrados.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_usuarioRegistrados);

        jLabel1.setText("Usuarios");

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        ta_test.setColumns(20);
        ta_test.setRows(5);
        jScrollPane3.setViewportView(ta_test);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        jlb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angeltorres_lab7/180x220_pp.jpg"))); // NOI18N

        jLabel12.setText("Nombre:");

        jLabel13.setText("Usuario:");

        jLabel14.setText("Password:");

        jLabel15.setText("Sexo:");

        rb_cuenta_m.setText("M");

        rb_cuenta_f.setText("F");

        jLabel16.setText("Edad:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(18, 18, 99, 1));

        jCheckBox1.setText("Premium");

        chb_registro_correr1.setText("Correr");

        chb_registro_bailar1.setText("Bailar");

        chb_registro_cantar1.setText("Cantar");

        chb_registro_comer1.setText("Comer");

        chb_registro_viajar1.setText("Viajar");

        chb_registro_nadar1.setText("Nadar");

        chb_registro_techno1.setText("Techno");

        chb_registro_metal1.setText("Metal");

        chb_registro_science1.setText("Science");

        chb_registro_art1.setText("Art");

        chb_registro_anime1.setText("Anime");

        chb_registro_musica1.setText("Musica");

        chb_registro_saltar1.setText("Saltar");

        chb_registro_biz1.setText("Biz");

        chb_registro_sports1.setText("Sports");

        chb_registro_news1.setText("News");

        chb_registro_tvshows1.setText("TV Shows");

        chb_registro_movies1.setText("Movies");

        jLabel17.setText("Intereses:");

        jLabel18.setText("Otro:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 298, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chb_registro_correr1)
                        .addComponent(chb_registro_bailar1)
                        .addComponent(chb_registro_cantar1)
                        .addComponent(chb_registro_comer1)
                        .addComponent(chb_registro_viajar1)
                        .addComponent(chb_registro_nadar1))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chb_registro_musica1)
                        .addComponent(chb_registro_anime1)
                        .addComponent(chb_registro_art1)
                        .addComponent(chb_registro_science1)
                        .addComponent(chb_registro_metal1)
                        .addComponent(chb_registro_techno1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chb_registro_movies1)
                        .addComponent(chb_registro_tvshows1)
                        .addComponent(chb_registro_news1)
                        .addComponent(chb_registro_sports1)
                        .addComponent(chb_registro_biz1)
                        .addComponent(chb_registro_saltar1))
                    .addContainerGap(325, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(chb_registro_musica1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_anime1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_art1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_science1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_metal1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_techno1))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(chb_registro_correr1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_bailar1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_cantar1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_comer1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_viajar1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_nadar1))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(chb_registro_movies1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_tvshows1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_news1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_sports1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_biz1)
                            .addGap(18, 18, 18)
                            .addComponent(chb_registro_saltar1)))
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        jButton3.setText("Modificar");

        jButton4.setText("Guardar");

        jButton5.setText("Seleccionar...");

        jButton6.setText("Agregar Interés");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_foto)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton5)))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordField1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(27, 27, 27)
                                        .addComponent(rb_cuenta_m)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_cuenta_f)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jCheckBox1)))))
                        .addGap(89, 89, 89)
                        .addComponent(jButton4)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(rb_cuenta_m)
                            .addComponent(rb_cuenta_f))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)))
                    .addComponent(jlb_foto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuenta", jPanel2);

        jMenu1.setText("Tander");

        jMenuItem1.setText("Log In");
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Registro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setText("Log Out");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Exit");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrar_selectFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrar_selectFotoMouseClicked
        JFileChooser fc =new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg","png","jpeg","gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION){
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(180, 220, 0);
            this.lb_registro_foto.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_bt_registrar_selectFotoMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jd_registro.pack();
        jd_registro.setModal(true);
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void bt_registro_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registro_signupMouseClicked
        
        int cI=0, edad;
        String nombre, usuario, password, sexo, premium;
        Icon foto;
        
        String interes;
        Interes inter = new Interes("");
        
        foto = lb_registro_foto.getIcon();
        
        nombre = tf_registro_nombre.getText();
        usuario = tf_registro_user.getText();
        password = tf_registro_passwrd.getText();
        
        if(rb_m.isSelected()){
            sexo="M";
        }else{
            sexo="F";
        }
        
        if(checkox_registro.isSelected()){
            premium = "Premium";
        }else{
            premium="Regular";
        }
        
        
        
        
        Usuario u = new Usuario(nombre, sexo, usuario, password, usuario, foto, premium);
        
        
        //inter.setInteres(interes);
        
        if(chb_registro_correr.isSelected()){
            interes = "Correr";
            //inter.setInteres(interes+",");
            u.agregarInteres(new Interes(interes));
            cI++;
        }
        if(chb_registro_bailar.isSelected()){
            interes = "Bailar";
            u.agregarInteres(new Interes(interes));
            cI++;
        }
        if(chb_registro_cantar.isSelected()){
            interes = "Cantar";
            u.agregarInteres(new Interes(interes));
            cI++;
        }
        
        //u.agregarInteres(inter);
        
        adminUsuario au = new adminUsuario("./users.att");
        adminUsuario auT = new adminUsuario("./users.txt");
        
        try {
            auT.agregarUsuario(u);
            auT.escribirTexto();
            
            if(cI>2){
            
            if(au.buscar(usuario) ==-1){
            
            if(password.length()>=3){
            //u.agregarInteres(inter);
            au.agregarUsuario(u);
            
            au.escribirArchivo();
            }else{
            System.out.println("Password muy corto");
            }
            
            }else{
            System.out.println("Ya existe el usuario");
            }
            
            }else{
            
            System.out.println("Ingrese 2 intereses");
            cI=0;
            }
            
            
        } catch (IOException ex) {
            
        }
        
        
        lb_registro_foto.setIcon(lb_registro_foto.getIcon());
        tf_registro_nombre.setText("");
        tf_registro_user.setText("");
        tf_registro_passwrd.setText("");
        
    }//GEN-LAST:event_bt_registro_signupMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DefaultListModel lista = (DefaultListModel)jl_usuarioRegistrados.getModel();
        
        adminUsuario au = new adminUsuario("./users.att");
        au.cargarArchivo();
        System.out.println(au.getListaUsuarios().get(0).getNombre());
        
        String interes="", s="";
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            
            interes+=au.getListaUsuarios().get(i).getListaIntereses().toString();
            //for (Interes object : au.getListaUsuarios().get(i).getListaIntereses()) {
            //    interes+=object.getInteres();
            //}
            
        }
        lista.addElement(au.getListaUsuarios().toString());
        jl_usuarioRegistrados.setModel(lista);
        System.out.println(s);
        System.out.println(interes);
        ta_test.append(interes);
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_registrar_selectFoto;
    private javax.swing.JButton bt_registro_signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chb_registro_anime;
    private javax.swing.JCheckBox chb_registro_anime1;
    private javax.swing.JCheckBox chb_registro_art;
    private javax.swing.JCheckBox chb_registro_art1;
    private javax.swing.JCheckBox chb_registro_bailar;
    private javax.swing.JCheckBox chb_registro_bailar1;
    private javax.swing.JCheckBox chb_registro_biz;
    private javax.swing.JCheckBox chb_registro_biz1;
    private javax.swing.JCheckBox chb_registro_cantar;
    private javax.swing.JCheckBox chb_registro_cantar1;
    private javax.swing.JCheckBox chb_registro_comer;
    private javax.swing.JCheckBox chb_registro_comer1;
    private javax.swing.JCheckBox chb_registro_correr;
    private javax.swing.JCheckBox chb_registro_correr1;
    private javax.swing.JCheckBox chb_registro_metal;
    private javax.swing.JCheckBox chb_registro_metal1;
    private javax.swing.JCheckBox chb_registro_movies;
    private javax.swing.JCheckBox chb_registro_movies1;
    private javax.swing.JCheckBox chb_registro_musica;
    private javax.swing.JCheckBox chb_registro_musica1;
    private javax.swing.JCheckBox chb_registro_nadar;
    private javax.swing.JCheckBox chb_registro_nadar1;
    private javax.swing.JCheckBox chb_registro_news;
    private javax.swing.JCheckBox chb_registro_news1;
    private javax.swing.JCheckBox chb_registro_saltar;
    private javax.swing.JCheckBox chb_registro_saltar1;
    private javax.swing.JCheckBox chb_registro_science;
    private javax.swing.JCheckBox chb_registro_science1;
    private javax.swing.JCheckBox chb_registro_sports;
    private javax.swing.JCheckBox chb_registro_sports1;
    private javax.swing.JCheckBox chb_registro_techno;
    private javax.swing.JCheckBox chb_registro_techno1;
    private javax.swing.JCheckBox chb_registro_tvshows;
    private javax.swing.JCheckBox chb_registro_tvshows1;
    private javax.swing.JCheckBox chb_registro_viajar;
    private javax.swing.JCheckBox chb_registro_viajar1;
    private javax.swing.JCheckBox checkox_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_mensaje;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JList<String> jl_usuarioRegistrados;
    private javax.swing.JLabel jlb_foto;
    private javax.swing.JLabel lb_registro_foto;
    private javax.swing.JRadioButton rb_cuenta_f;
    private javax.swing.JRadioButton rb_cuenta_m;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rm_f;
    private javax.swing.JSpinner sp_registro_edad;
    private javax.swing.JTextArea ta_test;
    private javax.swing.JTextField tf_registro_nombre;
    private javax.swing.JPasswordField tf_registro_passwrd;
    private javax.swing.JTextField tf_registro_user;
    // End of variables declaration//GEN-END:variables
}
