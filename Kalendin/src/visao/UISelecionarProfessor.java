/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import servicos.TurmaServicos;
import servicos.ServicoFactory;
import modelo.Aluno;
import modelo.Materia;
import modelo.Professor;
import modelo.Turma;
import modelo.Validar;
import servicos.AlunoServicos;
import servicos.MateriaServicos;
import servicos.ProfessorServicos;

/**
 *
 * @author admin
 */
public class UISelecionarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form UIConfigTurma
     */
    public UISelecionarProfessor(java.awt.Frame parent, boolean modal) {

        initComponents();
        preencherListaProfessor(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListProfessor = new javax.swing.JList();
        jtFiltrarProfessor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Professor"));

        jListProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListProfessor.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListProfessorValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jListProfessor);

        jtFiltrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFiltrarProfessorActionPerformed(evt);
            }
        });
        jtFiltrarProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltrarProfessorKeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        jLayeredPane4.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtFiltrarProfessor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtFiltrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFiltrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtFiltrarProfessorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltrarProfessorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFiltrarProfessorKeyReleased

    private void jtFiltrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFiltrarProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFiltrarProfessorActionPerformed

    private void jListProfessorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListProfessorValueChanged
        // TODO add your handling code here:
        abrirConfigProfessor();
    }//GEN-LAST:event_jListProfessorValueChanged
      
    private void abrirConfigProfessor() {

        Professor professor = new Professor();
        professor = ((Professor) jListProfessor.getSelectedValue());

        UIConfigProfessor ap = new UIConfigProfessor(null, true, professor);
        ap.setVisible(true);
        this.dispose();
    }
    private void preencherListaProfessor() {
        try {
            ArrayList<Professor> professor = new ArrayList<>();
            ProfessorServicos ss = ServicoFactory.getProfessor();

            professor = ss.buscarProfessor("professor as p inner join contato as c inner join endereco as e on "
                        + "p.idcontato = c.idcontato "
                        + "and "
                        + "p.idendereco = e.idendereco");
            
            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < professor.size(); i++) {
                dlm.addElement(professor.get(i));
            }

            jListProfessor.setModel(dlm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista de professores! " + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(UISelecionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UISelecionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UISelecionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UISelecionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UISelecionarProfessor dialog = new UISelecionarProfessor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setVisible(true);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JList jListProfessor;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jtFiltrarProfessor;
    // End of variables declaration//GEN-END:variables
}