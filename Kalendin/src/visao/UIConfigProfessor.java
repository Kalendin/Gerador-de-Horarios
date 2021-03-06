/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Controller.Abrir;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import servicos.TurmaServicos;
import servicos.ServicoFactory;
import modelo.Aluno;
import modelo.Materia;
import modelo.Professor;
import modelo.Turma;
import modelo.Horario;
import modelo.Validar;
import servicos.AlunoServicos;
import servicos.HorarioServicos;
import servicos.MateriaServicos;
import sun.misc.VM;

/**
 *
 * @author admin
 */
public class UIConfigProfessor extends javax.swing.JFrame {

    Professor professor = new Professor();

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"segunda", "terça", "quarta", "quinta", "sexta", "sabado"});

    /**
     * Creates new form UIConfigTurma
     */
    public UIConfigProfessor(java.awt.Frame parent, boolean modal, Professor professor) {

        initComponents();

        this.professor = professor;
        preencherListaMateria();
        preencherListaPeriodos();
        preencherListaTurma();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListTurmas = new javax.swing.JList();
        jtFiltrarTurma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPeriodos = new javax.swing.JTable();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListMateria = new javax.swing.JList();
        jtFiltrarAluno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtMateria = new javax.swing.JTextField();
        btAdicionarMateria = new javax.swing.JToggleButton();
        btDeletarMateria = new javax.swing.JToggleButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de turmas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jListTurmas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListTurmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListTurmasKeyPressed(evt);
            }
        });
        jListTurmas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTurmasValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jListTurmas);

        jtFiltrarTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltrarTurmaKeyReleased(evt);
            }
        });

        jLabel3.setText("Pesquisar:");

        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtFiltrarTurma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFiltrarTurma)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFiltrarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Periodos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jtPeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
            }
        ));
        jScrollPane1.setViewportView(jtPeriodos);

        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Materias"));

        jListMateria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jListMateria.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMateriaValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jListMateria);

        jtFiltrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFiltrarAlunoActionPerformed(evt);
            }
        });
        jtFiltrarAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltrarAlunoKeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        btAdicionarMateria.setText("Adicionar");
        btAdicionarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarMateriaActionPerformed(evt);
            }
        });

        btDeletarMateria.setText("Adicionar");
        btDeletarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarMateriaActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtFiltrarAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jtMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btAdicionarMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btDeletarMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdicionarMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletarMateria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFiltrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFiltrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarMateria)
                    .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeletarMateria)))
        );

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrar"));

        jToggleButton1.setText("Gerar horario de aula");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Adicionar plano de aula");

        jScrollPane2.setViewportView(jTextPane1);

        jButton1.setText("Exibir planos");

        jLabel2.setText("Nome:");

        jLayeredPane5.setLayer(jToggleButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jToggleButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane4)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtFiltrarAlunoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltrarAlunoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFiltrarAlunoKeyReleased

    private void jtFiltrarTurmaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltrarTurmaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFiltrarTurmaKeyReleased

    private void jtFiltrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFiltrarAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFiltrarAlunoActionPerformed

    private void jListTurmasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListTurmasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListTurmasKeyPressed

    private void jListTurmasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTurmasValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListTurmasValueChanged

    private void jListMateriaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMateriaValueChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jListMateriaValueChanged

    private void btAdicionarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarMateriaActionPerformed
        // TODO add your handling code here:
        cadastrar();
        preencherListaMateria();
    }//GEN-LAST:event_btAdicionarMateriaActionPerformed

    private void btDeletarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarMateriaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        UIEmbaralharPeriodos ap = new UIEmbaralharPeriodos(null,true);
        ap.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public void cadastrar() {
        try {

            Materia materia = new Materia();

            if (Validar.validarNome(jtMateria.getText())) {
                materia.setNome(jtMateria.getText());
            } else {
                throw new NumberFormatException("Digite o nome da materia!");
            }
            materia.setProfessor(professor);

            MateriaServicos m = ServicoFactory.getMateria();

            m.cadastrar(materia);

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Materia cadastrada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! " + e.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherListaMateria() {
        try {
            ArrayList<Materia> materia = new ArrayList<>();
            MateriaServicos ss = ServicoFactory.getMateria();

            materia = ss.buscarMaterias(",m.nome as nomemateria from professor as p inner join materia as m on "
                    + "m.idprofessor = p.idprofessor "
                    + "and "
                    + "p.idprofessor = " + professor.getIdProfessor());

            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < materia.size(); i++) {
                dlm.addElement(materia.get(i));
            }

            jListMateria.setModel(dlm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista de turmas! " + e.getMessage());
        }
    }

    private void preencherListaTurma() {
        try {
            ArrayList<Turma> turma = new ArrayList<>();
            TurmaServicos ss = ServicoFactory.getTurma();

            turma = ss.buscarTurmas("turma");

            if (turma != null) {
                DefaultListModel dlm = new DefaultListModel();
                for (int i = 0; i < turma.size(); i++) {
                    dlm.addElement(turma.get(i));
                }

                jListTurmas.setModel(dlm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista de turmas! " + e.getMessage());
        }
    }

    private void preencherListaPeriodos() {
        try {
            ArrayList<Horario> horario = new ArrayList<>();
            HorarioServicos ss = ServicoFactory.getHorario();

            int turma = professor.getIdProfessor();

            horario = ss.buscarHorario("aluno as a inner join horario as h inner join contato as c inner join endereco as e inner join materia as m inner join professor as p inner join turma as t on "
                    + "a.idturma = t.idturma "
                    + "and "
                    + "t.idturma = h.idturma "
                    + "and "
                    + "h.idmateria = m.idmateria "
                    + "and "
                    + "p.idendereco = e.idendereco "
                    + "and "
                    + "p.idcontato = c.idcontato "
                    + "and "
                    + "m.idprofessor = p.idprofessor "
                    + "where p.idprofessor = " + turma);

            dtm.setNumRows(0);
            if (horario.get(0) != null) {
                for (int i = 0; i < 6; i++) {
                    dtm.addRow(new String[]{});

                    String nome = String.valueOf(horario.get(i).getTurma().getNumero());

                    dtm.setValueAt(nome, i, 0);

                }//fecha for
                for (int i = 0; i < 6; i++) {

                    String nome = String.valueOf(horario.get(i + 6).getTurma().getNumero());

                    dtm.setValueAt(nome, i, 1);

                }//fecha for
                for (int i = 0; i < 6; i++) {

                    String nome = String.valueOf(horario.get(i + 6 + 6).getTurma().getNumero());

                    dtm.setValueAt(nome, i, 2);

                }//fecha for
                for (int i = 0; i < 6; i++) {

                    String nome = String.valueOf(horario.get(i + 6 + 6 + 6).getTurma().getNumero());

                    dtm.setValueAt(nome, i, 3);

                }//fecha for
                for (int i = 0; i < 6; i++) {

                    String nome = String.valueOf(horario.get(i + 6 + 6 + 6 + 6).getTurma().getNumero());

                    dtm.setValueAt(nome, i, 4);

                }//fecha for

                jtPeriodos.setModel(dtm);
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(UIConfigProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIConfigProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIConfigProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIConfigProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void removeMinMaxClose(Component comp) {
                if (comp instanceof AbstractButton) {
                    comp.getParent().remove(comp);
                }
                if (comp instanceof Container) {
                    Component[] comps = ((Container) comp).getComponents();
                    for (int x = 0, y = comps.length; x < y; x++) {
                        removeMinMaxClose(comps[x]);
                    }
                }
            }

            public void run() {
                UIConfigProfessor dialog = new UIConfigProfessor(new javax.swing.JFrame(), true, null);

                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent e) {
                        dialog.setResizable(false);
                        removeMinMaxClose(dialog);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAdicionarMateria;
    private javax.swing.JToggleButton btDeletarMateria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JList jListMateria;
    private javax.swing.JList jListTurmas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField jtFiltrarAluno;
    private javax.swing.JTextField jtFiltrarTurma;
    private javax.swing.JTextField jtMateria;
    private javax.swing.JTable jtPeriodos;
    // End of variables declaration//GEN-END:variables
}
