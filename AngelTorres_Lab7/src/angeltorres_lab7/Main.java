
package angeltorres_lab7;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.DefaultListModel;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_usuarioRegistrados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlb_foto = new javax.swing.JLabel();
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(617, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        jlb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angeltorres_lab7/180x220_pp.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlb_foto)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlb_foto)
                .addContainerGap(307, Short.MAX_VALUE))
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
    private javax.swing.JCheckBox chb_registro_anime;
    private javax.swing.JCheckBox chb_registro_art;
    private javax.swing.JCheckBox chb_registro_bailar;
    private javax.swing.JCheckBox chb_registro_biz;
    private javax.swing.JCheckBox chb_registro_cantar;
    private javax.swing.JCheckBox chb_registro_comer;
    private javax.swing.JCheckBox chb_registro_correr;
    private javax.swing.JCheckBox chb_registro_metal;
    private javax.swing.JCheckBox chb_registro_movies;
    private javax.swing.JCheckBox chb_registro_musica;
    private javax.swing.JCheckBox chb_registro_nadar;
    private javax.swing.JCheckBox chb_registro_news;
    private javax.swing.JCheckBox chb_registro_saltar;
    private javax.swing.JCheckBox chb_registro_science;
    private javax.swing.JCheckBox chb_registro_sports;
    private javax.swing.JCheckBox chb_registro_techno;
    private javax.swing.JCheckBox chb_registro_tvshows;
    private javax.swing.JCheckBox chb_registro_viajar;
    private javax.swing.JCheckBox checkox_registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_mensaje;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JList<String> jl_usuarioRegistrados;
    private javax.swing.JLabel jlb_foto;
    private javax.swing.JLabel lb_registro_foto;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rm_f;
    private javax.swing.JSpinner sp_registro_edad;
    private javax.swing.JTextField tf_registro_nombre;
    private javax.swing.JPasswordField tf_registro_passwrd;
    private javax.swing.JTextField tf_registro_user;
    // End of variables declaration//GEN-END:variables
}
