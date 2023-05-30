/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancounion;




import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author holij
 */
public class RegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public RegistrarUsuario() {
        initComponents();
        this.setTitle("Registrate");
        this.setLocationRelativeTo(null);

        
      
     
    }
      private void limpiarcajas(){
       txtnombre.setText(null);
       txtCodigo.setText(null);
       txtape.setText(null);
       txtContraseña.setText(null);
      
   }
      
GuardarUsuario metodo = new GuardarUsuario();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtnombre = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnGuardarRegistro = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 164, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrate");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        txtnombre.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(null);
        txtnombre.setOpaque(false);
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
        });

        txtape.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtape.setForeground(new java.awt.Color(255, 255, 255));
        txtape.setBorder(null);
        txtape.setOpaque(false);
        txtape.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtapeFocusGained(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
        });

        btnGuardarRegistro.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarRegistro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/floppy-disk.png"))); // NOI18N
        btnGuardarRegistro.setText("Guardar");
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/right-arrow.png"))); // NOI18N
        btnMenu.setText("Iniciar Sesion");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo");

        txtContraseña.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(false);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                            .addComponent(jLabel3)
                                            .addComponent(jSeparator1))
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                                .addComponent(jSeparator6))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(btnMenu)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtape)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jSeparator5)
                                    .addComponent(jSeparator3)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(btnGuardarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenu)
                            .addComponent(btnGuardarRegistro))
                        .addGap(28, 28, 28))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        txtnombre.setText("");
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtapeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtapeFocusGained
             txtape.setText("");
    }//GEN-LAST:event_txtapeFocusGained

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
             txtCodigo.setText("");
    }//GEN-LAST:event_txtCodigoFocusGained

    
    
    private boolean codigoYaRegistrado(String codigo) {
    conectar cc = new conectar();
    java.sql.Connection cn = cc.conexion();
    try {
        String sql = "SELECT COUNT(*) FROM aliados WHERE Codigo = ?";
        PreparedStatement stmt = cn.prepareStatement(sql);
        stmt.setString(1, codigo);

        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);

        // Devolver true si hay al menos un registro con el mismo código
        return count > 0;
    } catch (SQLException e) {
        System.out.println("Error al verificar si el código está registrado: " + e.getMessage());
        return false;
    }finally {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

    
    
    
    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed
        
    String codigo = txtCodigo.getText().trim();
    String nombre = txtnombre.getText().trim();
    String apellido = txtape.getText().trim();
    String contraseña = txtContraseña.getText();

    // Verificar si el código ya está registrado
    if (codigoYaRegistrado(codigo)) {
        JOptionPane.showMessageDialog(null, "Código ya registrado");
        return;
    }

    // Guardar los datos del nuevo aliado en la tabla "registrosesion"
    int resultadoRegistroSesion = metodo.guardar(nombre, apellido, contraseña, codigo);


    if (resultadoRegistroSesion > 0) {
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        limpiarcajas();
    } else {
        JOptionPane.showMessageDialog(null, "Registro Fallido");
        limpiarcajas();
    }
    }//GEN-LAST:event_btnGuardarRegistroActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        IniciarSesion entrada = new IniciarSesion();
        entrada.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaFocusGained

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRegistro;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}


//JOHAN SEBEASTIAN QUIMBAYO
//SAMUEL RAMIREZ LARA
//LUIS FELIPE VILLOTA