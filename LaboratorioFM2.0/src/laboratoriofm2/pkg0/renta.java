/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriofm2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Garcia
 */
public class renta extends javax.swing.JFrame {

    /**
     * Creates new form renta
     */
    public renta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtExistencia_J = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAutor_J = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbox_Tienda = new javax.swing.JComboBox<>();
        lbTienda = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbClas = new javax.swing.JLabel();
        cbox_Clas = new javax.swing.JComboBox<>();
        cbox_Genero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtNombre_J = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio_J = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("rentar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Género");

        jLabel8.setText("Clasificación");

        jLabel4.setText("Autor");

        jLabel10.setText("Tienda");

        cbox_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_TiendaActionPerformed(evt);
            }
        });

        lbTienda.setText("...");

        lbGenero.setText("...");

        lbClas.setText("...");

        cbox_Clas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_ClasActionPerformed(evt);
            }
        });

        cbox_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_GeneroActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio");

        jLabel6.setText("Existencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbox_Tienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtExistencia_J)
                                    .addComponent(txtPrecio_J)
                                    .addComponent(cbox_Clas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnModificar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGenero)
                            .addComponent(lbClas)
                            .addComponent(lbTienda))
                        .addGap(246, 246, 246))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbox_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAutor_J, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(54, 54, 54)
                                        .addComponent(txtNombre_J, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAutor_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbox_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_Clas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtExistencia_J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbox_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbClas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbGenero)
                                .addGap(20, 20, 20)))
                        .addGap(66, 66, 66)
                        .addComponent(lbTienda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String buscar = txtbuscado.getText().trim();
        if(buscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el campo de busqueda!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("select * from Articulos where Codigo_A = ? and CTipo_A=2");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
            txtNombre_J.setText(rs.getString("Nombre_A"));
            txtAutor_J.setText(rs.getString("Autor_A"));
            lbGenero.setText(rs.getString("CGenero_A"));
            lbClas.setText(rs.getString("Clasificacion_A"));
            
            txtPrecio_J.setText(rs.getString("Precio_A"));
            txtExistencia_J.setText(rs.getString("Existencia"));
            lbTienda.setText(rs.getString("Tienda"));
            
            btnEliminar.setEnabled(true);
            btnModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Pelicula no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("insert into Articulos values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtNombre_J.getText().trim());
            pst.setString(3, txtAutor_J.getText().trim());
            pst.setString(4, lbGenero.getText().trim());
            pst.setString(5, lbClas.getText().trim());
            pst.setString(6, "0");
            pst.setString(7, txtPrecio_J.getText().trim());
            pst.setString(8, txtExistencia_J.getText().trim());
            pst.setString(9, "2");
            pst.setString(10, lbTienda.getText().trim());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            txtNombre_J.setText("");
            txtAutor_J.setText("");

            txtPrecio_J.setText("");
            txtExistencia_J.setText("");
            lbGenero.setText("");
            lbClas.setText("");
            lbTienda.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            cbox_Tienda.setSelectedIndex(0);
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "¡REGITRO FALLIDO!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtbuscado.getText().trim();
        if(buscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el campo de busqueda!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("select * from Articulos where Codigo_A = ? and CTipo_A=2");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtNombre_J.setText(rs.getString("Nombre_A"));
                txtAutor_J.setText(rs.getString("Autor_A"));
                lbGenero.setText(rs.getString("CGenero_A"));
                lbClas.setText(rs.getString("Clasificacion_A"));

                txtPrecio_J.setText(rs.getString("Precio_A"));
                txtExistencia_J.setText(rs.getString("Existencia"));
                lbTienda.setText(rs.getString("Tienda"));

                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Pelicula no registrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbox_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_TiendaActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("select Codigo_T from Tiendas where Nombre_T= ?");
            pst.setString(1, cbox_Tienda.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                lbTienda.setText(rs.getString("Codigo_T"));

            } else {

            }

        }catch (Exception e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_TiendaActionPerformed

    private void cbox_ClasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_ClasActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("select CClas_A from Clas_A where Nombre_A= ?");
            pst.setString(1, cbox_Clas.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                lbClas.setText(rs.getString("CClas_A"));

            } else {

            }

        }catch (Exception e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_ClasActionPerformed

    private void cbox_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_GeneroActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("select CGenero_A from Genero_A where Nombre_A= ?");
            pst.setString(1, cbox_Genero.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                lbGenero.setText(rs.getString("CGenero_A"));

            } else {

            }

        }catch (Exception e){

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_GeneroActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("delete from Articulos where Codigo_A = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();

            txtbuscado.setText("");

            JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

            txtNombre_J.setText("");
            txtAutor_J.setText("");

            txtPrecio_J.setText("");
            txtExistencia_J.setText("");
            lbGenero.setText("");
            lbClas.setText("");
            lbTienda.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            cbox_Tienda.setSelectedIndex(0);

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String codigo = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LabFM", "root", "Polo.2015");
            PreparedStatement pst = cn.prepareStatement("update articulos set Nombre_A = ? , Autor_A= ? , CGenero_A=? , Clasificacion_A= ? , Duracion_A= ?, Precio_A= ?, Existencia=?, Tienda=? where Codigo_A = " + codigo);

            pst.setString(1, txtNombre_J.getText().trim());
            pst.setString(2, txtAutor_J.getText().trim());
            pst.setString(3, lbGenero.getText().trim());
            pst.setString(4, lbClas.getText().trim());
            pst.setString(5, "0");
            pst.setString(6, txtPrecio_J.getText().trim());
            pst.setString(7, txtExistencia_J.getText().trim());
            pst.setString(8, lbTienda.getText().trim());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

            txtNombre_J.setText("");
            txtAutor_J.setText("");

            txtPrecio_J.setText("");
            txtExistencia_J.setText("");
            lbGenero.setText("");
            lbClas.setText("");
            lbTienda.setText("");
            txtbuscado.setText("");
            cbox_Genero.setSelectedIndex(0);
            cbox_Clas.setSelectedIndex(0);
            cbox_Tienda.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "NO SE PUDO MODIFICAR.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(renta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new renta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_Clas;
    private javax.swing.JComboBox<String> cbox_Genero;
    private javax.swing.JComboBox<String> cbox_Tienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbClas;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbTienda;
    private javax.swing.JTextField txtAutor_J;
    private javax.swing.JTextField txtExistencia_J;
    private javax.swing.JTextField txtNombre_J;
    private javax.swing.JTextField txtPrecio_J;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
