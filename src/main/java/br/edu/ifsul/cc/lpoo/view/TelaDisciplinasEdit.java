/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.view;

import br.edu.ifsul.cc.lpoo.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.model.Alunos;
import br.edu.ifsul.cc.lpoo.model.Disciplinas;
import br.edu.ifsul.cc.lpoo.model.Professores;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 20221PF.CC0003
 */
public class TelaDisciplinasEdit extends java.awt.Dialog {
    
    DefaultListModel<Alunos> listModel = new DefaultListModel<>();
    private Disciplinas disc;
    /**
     * Creates new form TelaDisciplinasEdit
     */
    public TelaDisciplinasEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lstAlunosDisciplina.setModel(listModel);
        
        
        
        
    }
    
    public void SetDisciplina(Disciplinas disc){
        this.disc = disc;
        txtIDDisciplina.setText(disc.getId() != null ? disc.getId().toString() : "");
        txtNomeDisciplina.setText(disc.getNomeDisciplina()); 
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        jpa.conexaoAberta();
        
        List<Alunos> alunos = jpa.getAlunosDISC(disc);
        listModel.clear();
        
        
        for(Alunos aluno : alunos){
            listModel.addElement(aluno);      
        }
        jpa.fecharConexao();
   
        mostraProf();
    }
    
    public void mostraProf() {
        cmbProfessores.removeAllItems();
        PersistenciaJPA jpa = new PersistenciaJPA();
        jpa.conexaoAberta();
        List<Professores> lista = jpa.getProfessores();

        for (Professores o : lista) {
            cmbProfessores.addItem(o);
        }

        jpa.fecharConexao();
    }
    
     
        
   
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDDisciplina = new javax.swing.JTextField();
        txtNomeDisciplina = new javax.swing.JTextField();
        cmbProfessores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAlunosDisciplina = new javax.swing.JList<>();
        btnCancela = new javax.swing.JButton();

        setBackground(java.awt.Color.white);

        jLabel1.setText("ID Disciplina");

        jLabel2.setText("Nome Disciplina");

        jLabel3.setText("Alunos");

        txtIDDisciplina.setEditable(false);

        jLabel4.setText("Professores");

        btnSalvar.setText("Salvar Alteração");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lstAlunosDisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(lstAlunosDisciplina);

        btnCancela.setText("Cancelar");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtIDDisciplina, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txtIDDisciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        SalvaDisc();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDisciplinasEdit dialog = new TelaDisciplinasEdit(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Professores> cmbProfessores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Alunos> lstAlunosDisciplina;
    private javax.swing.JTextField txtIDDisciplina;
    private javax.swing.JTextField txtNomeDisciplina;
    // End of variables declaration//GEN-END:variables

    private void SalvaDisc() {
 PersistenciaJPA jpa = new PersistenciaJPA();
            try {
                jpa.conexaoAberta();
                Disciplinas disc1 = (Disciplinas) jpa.find(Disciplinas.class, disc.getId());
                disc1.setNomeDisciplina(txtNomeDisciplina.getText());

                Professores p1 = (Professores) cmbProfessores.getSelectedItem();
                disc1.setProfessor(p1);
                

                jpa.persist(disc1);
                jpa.fecharConexao();
                dispose();
            } catch (Exception e) {
                System.err.println("Erro ao salvar disciplina!");
                
            }    }
}
