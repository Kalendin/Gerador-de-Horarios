/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;
import modelo.Contato;
import modelo.Endereco;
import modelo.Horario;
import modelo.Professor;
import modelo.Turma;
import servicos.AlunoServicos;
import servicos.HorarioServicos;
import servicos.ProfessorServicos;
import servicos.ServicoFactory;

/**
 *
 * @author admin
 */
public class UIConfigAluno extends javax.swing.JFrame {

    Aluno aluno = new Aluno();

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"segunda", "terça", "quarta", "quinta", "sexta", "sabado"});

    /**
     * Creates new form UIConfigAlun
     */
    public UIConfigAluno(java.awt.Frame parent, boolean modal, Aluno aluno) {
        initComponents();
        this.aluno = aluno;
        System.out.println(aluno.turma);
        carregarDados();
        preencherListaPeriodos();
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jtCep = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtEmail = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlCor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlClasseSocial = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlNascimento = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListProfessor = new javax.swing.JList<>();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPeriodos = new javax.swing.JTable();

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jButton2.setText("confirmar alteração");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLayeredPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCepActionPerformed(evt);
            }
        });

        jLabel26.setText("CEP:");

        jtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRuaActionPerformed(evt);
            }
        });

        jLabel27.setText("Rua");

        jtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBairroActionPerformed(evt);
            }
        });

        jLabel28.setText("Bairro");

        jLabel29.setText("Cidade:");

        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });

        jLabel30.setText("Numero");

        jLayeredPane6.setLayer(jtCep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jtRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jtBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jtNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtBairro))
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtRua))
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCep))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNumero)))
                .addContainerGap())
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(93, 93, 93))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        jtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefoneActionPerformed(evt);
            }
        });

        jtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCelularActionPerformed(evt);
            }
        });

        jLabel31.setText("Celular:");

        jLabel32.setText("E-mail:");

        jLabel33.setText("Telefone:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCelular))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEmail)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cor");

        jlCor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Classe Social");

        jlClasseSocial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Sexo");

        jlSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Data de Nascimento");

        jlNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlCor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlClasseSocial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlNascimento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlNome))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCor))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlSexo))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlClasseSocial))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlNascimento)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jlCor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jlSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jlClasseSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNascimento)
                            .addComponent(jLabel11)))))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Professores"));

        jListProfessor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(jListProfessor);

        jLayeredPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Periodos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        jtPeriodos.setAutoCreateRowSorter(true);
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
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        confirmarAlteracao();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCepActionPerformed

    private void jtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRuaActionPerformed

    private void jtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBairroActionPerformed

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefoneActionPerformed

    private void jtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCelularActionPerformed

    private void confirmarAlteracao() {
        try {
            Endereco endereco = new Endereco();
            Contato contato = new Contato();

            endereco.setCidade(jtCidade.getText());
            endereco.setBairro(jtBairro.getText());
            endereco.setRua(jtRua.getText());
            endereco.setNumeroCasa(Integer.parseInt(jtNumero.getText()));
            endereco.setCep(jtCep.getText());

            contato.setCelular(jtCelular.getText());
            contato.setTelefone(jtTelefone.getText());
            contato.setEmail(jtEmail.getText());

            AlunoServicos ps = ServicoFactory.getAluno();
            //Enviando o objeto para ser alterado

            String query = "aluno as a inner join contato as c inner join endereco as e on "
                    + "a.idcontato = c.idcontato "
                    + "and "
                    + "a.idendereco = e.idendereco "
                    + "set e.cidade = '" + jtCidade.getText() + "', "
                    + "e.bairro = '" + jtBairro.getText() + "', "
                    + "e.rua = '" + jtRua.getText() + "', "
                    + "e.numerocasa = '" + jtNumero.getText() + "', "
                    + "e.cep = '" + jtCep.getText() + "', "
                    + "c.celular = '" + jtCelular.getText() + "', "
                    + "c.telefone = '" + jtTelefone.getText() + "', "
                    + "c.email = '" + jtEmail.getText() + "' "
                    + "where a.idaluno = " + aluno.getIdAluno();

            ps.AlterarAluno(query);

            JOptionPane.showMessageDialog(
                    this,
                    "Aluno Alterado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha método confirmarAlteração

    private void preencherListaPeriodos() {
        try {
            ArrayList<Horario> horario = new ArrayList<>();
            HorarioServicos ss = ServicoFactory.getHorario();

            int turma = aluno.getTurma().getNumero();

            horario = ss.buscarHorario("horario as h inner join materia as m inner join turma as t on "
                    + "h.idmateria = m.idmateria "
                    + "and "
                    + "h.idturma = t.idturma "
                    + "where t.numero = " + turma);

            dtm.setNumRows(0);

            for (int i = 0; i < 6; i++) {
                dtm.addRow(new String[]{});

                String nome = horario.get(i).getMateria().getNome();

                dtm.setValueAt(nome, i, 0);

            }//fecha for
            for (int i = 0; i < 6; i++) {

                String nome = horario.get(i + 6).getMateria().getNome();

                dtm.setValueAt(nome, i, 1);

            }//fecha for
            for (int i = 0; i < 6; i++) {

                String nome = horario.get(i + 6 + 6).getMateria().getNome();

                dtm.setValueAt(nome, i, 2);

            }//fecha for
            for (int i = 0; i < 6; i++) {

                String nome = horario.get(i + 6 + 6 + 6).getMateria().getNome();

                dtm.setValueAt(nome, i, 3);

            }//fecha for
            for (int i = 0; i < 6; i++) {

                String nome = horario.get(i + 6 + 6 + 6 + 6).getMateria().getNome();

                dtm.setValueAt(nome, i, 4);

            }//fecha for

            jtPeriodos.setModel(dtm);

        } catch (Exception e) {
        }
    }

    private void preencherListaProfessor() {
        try {
            ArrayList<Professor> professor = new ArrayList<>();
            ProfessorServicos ss = ServicoFactory.getProfessor();

            professor = ss.buscarProfessor("aluno as a inner join horario as h inner join contato as c inner join endereco as e inner join materia as m inner join professor as p inner join turma as t on "
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
                    + "where t.numero = " + aluno.getTurma().getNumero());

            DefaultListModel dlm = new DefaultListModel();
            for (int i = 0; i < professor.size(); i++) {
                dlm.addElement(professor.get(i).getNome());
            }

            jListProfessor.setModel(dlm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao preencher lista de professores! " + e.getMessage());
        }
    }

    private void carregarDados() {
        try {
            jtBairro.setText(aluno.getEndereco().getBairro());
            jtCep.setText(aluno.getEndereco().getCep());
            jtCidade.setText(aluno.getEndereco().getCidade());
            jtRua.setText(aluno.getEndereco().getRua());
            jtNumero.setText(String.valueOf(aluno.getEndereco().getNumeroCasa()));

            jtCelular.setText(String.valueOf(aluno.getContato().getCelular()));
            jtTelefone.setText(String.valueOf(aluno.getContato().getTelefone()));
            jtEmail.setText(aluno.getContato().getEmail());

            jlNome.setText(aluno.getNome());
            jlClasseSocial.setText(aluno.getClasseSocial());
            jlCor.setText(aluno.getCor());
            jlSexo.setText(aluno.getSexo());
            jlNascimento.setText(aluno.getNascionalidade());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao receber usuario! " + e.getMessage());
        }//fecha catch
    }//fecha método confirmarAlteração

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
            java.util.logging.Logger.getLogger(UIConfigAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIConfigAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIConfigAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIConfigAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UIConfigAluno dialog = new UIConfigAluno(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setVisible(false);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JList<String> jListProfessor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlClasseSocial;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlNascimento;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCep;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTable jtPeriodos;
    private javax.swing.JTextField jtRua;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}