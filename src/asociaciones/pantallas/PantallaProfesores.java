/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.pantallas;

import asociaciones.entidades.Curso;
import asociaciones.entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class PantallaProfesores extends javax.swing.JFrame {
    
    private Curso curso;

    /**
     * Creates new form PantallaProfesores
     */
    public PantallaProfesores(Curso curso) {
        initComponents();
        this.curso = curso;
    }

    PantallaProfesores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Profesor> buscar(String criterio) {
        return new ArrayList<>();
    }
    
    public void agregar(Profesor profesor) {
        Profesor[] profesores = curso.getProfesores();
        int tamaño = profesores.length;
        for (int i = 0; i < tamaño; i++) {
            if(profesores[i]!=null && 
                    !profesores[i].getNombre().isEmpty()){
                profesores[i]= profesor;
                return;
            }
            
            if(profesores[i]==null){
                profesores[i]=profesor;
                return;
            }
        }
    }
    
    public void eliminar(Profesor profesor) {
        //TODO:implementar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BrnAgregarProfe = new javax.swing.JButton();
        BtnCancelarProfe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListProfesor = new javax.swing.JList<>();
        BtnSalirProfe = new javax.swing.JButton();
        TextBuscarProfesor = new javax.swing.JTextField();
        BtnBuscarProfesor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BrnAgregarProfe.setText("Agregar");
        BrnAgregarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrnAgregarProfeActionPerformed(evt);
            }
        });

        BtnCancelarProfe.setText("Cancelar");
        BtnCancelarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarProfeActionPerformed(evt);
            }
        });

        ListProfesor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListProfesor);

        BtnSalirProfe.setText("Salir");
        BtnSalirProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirProfeActionPerformed(evt);
            }
        });

        BtnBuscarProfesor.setText("Buscar");

        jLabel1.setText("Profesores de: [ ]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSalirProfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrnAgregarProfe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelarProfe)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextBuscarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnBuscarProfesor)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuscarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarProfesor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrnAgregarProfe)
                    .addComponent(BtnCancelarProfe)
                    .addComponent(BtnSalirProfe))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrnAgregarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrnAgregarProfeActionPerformed
        
        Profesor profesor = new Profesor();
        PantallaEditarProfesor pantallaEditProfe = new PantallaEditarProfesor(profesor);
        pantallaEditProfe.setVisible(true);
        
        
    }//GEN-LAST:event_BrnAgregarProfeActionPerformed

    private void BtnCancelarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarProfeActionPerformed

    private void BtnSalirProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirProfeActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Curso curso = new Curso("",0,"");
                new PantallaProfesores(curso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrnAgregarProfe;
    private javax.swing.JButton BtnBuscarProfesor;
    private javax.swing.JButton BtnCancelarProfe;
    private javax.swing.JButton BtnSalirProfe;
    private javax.swing.JList<String> ListProfesor;
    private javax.swing.JTextField TextBuscarProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
