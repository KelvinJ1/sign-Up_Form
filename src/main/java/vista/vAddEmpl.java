/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EmpleadoDAO;
import javax.swing.JOptionPane;
import modelos.Empleado;

/**
 *
 * @author Familia Pozuelo
 */
public class vAddEmpl extends javax.swing.JFrame {

    /**
     * Creates new form VAsigDATOS
     */
    public vAddEmpl() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        TxtCelular = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkProovedor = new javax.swing.JCheckBox();
        btnAgregarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombres);
        txtNombres.setBounds(10, 44, 165, 25);

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidos);
        txtApellidos.setBounds(225, 44, 165, 25);

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(10, 107, 165, 25);

        TxtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCelularKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCelular);
        TxtCelular.setBounds(225, 107, 165, 25);

        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtSalario);
        txtSalario.setBounds(225, 165, 165, 25);

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCargo);
        txtCargo.setBounds(10, 216, 165, 25);

        jLabel1.setText("Nombres*:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 24, 60, 14);

        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(225, 24, 60, 14);

        jLabel3.setText("Correo*:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 87, 44, 14);

        jLabel4.setText("Cargo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 196, 40, 14);

        jLabel5.setText("Salario*:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(225, 150, 50, 14);

        jLabel6.setText("Celular*:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(225, 87, 60, 14);

        chkProovedor.setText("Proovedor");
        chkProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkProovedorActionPerformed(evt);
            }
        });
        getContentPane().add(chkProovedor);
        chkProovedor.setBounds(60, 160, 80, 23);

        btnAgregarEmpleado.setText("Agregar empleado");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarEmpleado);
        btnAgregarEmpleado.setBounds(159, 288, 121, 31);

        setBounds(0, 0, 416, 369);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void chkProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkProovedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkProovedorActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
         Empleado empl = new Empleado(); //aqu?? se guardan los datos
        empl.setNombre(txtNombres.getText());
        empl.setApellido(txtApellidos.getText());
        empl.setCorreo(txtCorreo.getText());
        empl.setCelular(TxtCelular.getText());
        empl.setEsProveedor(chkProovedor.isSelected());
        empl.setCargo(txtCargo.getText());
        empl.setSalario(txtSalario.getText());

        //EmpleadoDAO.guardar(empl); //La clase que tiene las indicaciones en relacion programa/base de datos. Es decir, guarda. No se instancia porque es est??tica
        //al ser boolean, si se establece conexi??n==TRUE y muestra mensaje exitoso, sino, error
        if(txtNombres.getText().equals("") || txtCorreo.getText().equals("")||TxtCelular.getText().equals("")||txtSalario.getText().equals("")) {
                
                        JOptionPane.showMessageDialog(this, "Por favor, dilegenciar correctamente el formulario");
        }
       
        else{
        if (EmpleadoDAO.guardar(empl)){
            JOptionPane.showMessageDialog(this, "Guardado exitosamente!");
            this.dispose();
        } 
        else{ JOptionPane.showMessageDialog(this, "*ERROR*"
                + "\nNo se pudo guardar");}
        }
        
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
    
       char c = evt.getKeyChar();
if((c< 'a' || c>'z') && (c< 'A' || c>'Z')&& (c>' ')&&(c<'??'||c>'??')&&(c<'??'||c>'??')) evt.consume();
        
        
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
       
          char c = evt.getKeyChar();
if((c< 'a' || c>'z') && (c< 'A' || c>'Z')&& (c>' ')&&(c<'??'||c>'??')&&(c<'??'||c>'??')) evt.consume();
        
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
   
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void TxtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCelularKeyTyped
     
        
        char n=evt.getKeyChar();
        if (!Character.isDigit(n)){ evt.consume();}
        
    }//GEN-LAST:event_TxtCelularKeyTyped

    private void txtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyTyped
       
        char n=evt.getKeyChar();
        if (!Character.isDigit(n)){ evt.consume();}
        
        
        
    }//GEN-LAST:event_txtSalarioKeyTyped

    private void txtCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyTyped
    
        
        char c = evt.getKeyChar();
if((c< 'a' || c>'z') && (c< 'A' || c>'Z')&& (c>' ')&&(c<'??'||c>'??')&&(c<'??'||c>'??')) evt.consume();  

    }//GEN-LAST:event_txtCargoKeyTyped

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
            java.util.logging.Logger.getLogger(vAddEmpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAddEmpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAddEmpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAddEmpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vAddEmpl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCelular;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JCheckBox chkProovedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
