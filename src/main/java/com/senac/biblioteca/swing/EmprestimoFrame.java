/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.senac.biblioteca.swing;

import com.senac.biblioteca.DadosService;
import com.senac.biblioteca.model.Emprestimo;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

/**
 *
 * @author correa_rafael
 */
public class EmprestimoFrame extends javax.swing.JFrame {
    private final DadosService service;
    private BuscaLivroDialog buscaLivroDialog;

    /**
     * Creates new form EmprestimoDialog
     */
    public EmprestimoFrame(java.awt.Frame parent, DadosService service) {
        super();
        this.setLocationRelativeTo(parent);
        this.service = service;
        initComponents();
        
        this.jTableCatalogo.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = jTableCatalogo.getSelectedRow();
                if(index >= 0){
                    Emprestimo emprestimo = service.getBiblioteca().getEmprestimos().get(index);
                    jTextFieldId.setText(String.valueOf(emprestimo.getId()));
                    jTextFieldLeitor.setText(emprestimo.getLeitor());
                    jTextFieldLivro.setText(emprestimo.getLivro());
                    jCheckBoxDevolvido.setSelected(emprestimo.isDevolvido());
                }
            }
        });
    }
    
    public TableModel initTable(){
        return new EmprestimoTableModel(service.getBiblioteca().getEmprestimos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCatalogo = new javax.swing.JTable();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelLivro = new javax.swing.JLabel();
        jLabelLeitor = new javax.swing.JLabel();
        jTextFieldLeitor = new javax.swing.JTextField();
        jTextFieldLivro = new javax.swing.JTextField();
        jCheckBoxDevolvido = new javax.swing.JCheckBox();
        jLabelData = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimos");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jTableCatalogo.setModel(initTable());
        jTableCatalogo.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTableCatalogo);
        jTableCatalogo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabelId.setText("Código");

        jTextFieldId.setEditable(false);

        jLabelLivro.setText("Livro");

        jLabelLeitor.setText("Leitor");

        jCheckBoxDevolvido.setText("Devolvido");

        jLabelData.setText("Data");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelData)
                .addContainerGap(420, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLivro)
                            .addComponent(jLabelLeitor)
                            .addComponent(jLabelId))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jCheckBoxDevolvido)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar))
                            .addComponent(jTextFieldLeitor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLivro)
                    .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLeitor)
                    .addComponent(jTextFieldLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxDevolvido)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSalvar))
                    .addComponent(jLabelData))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Emprestimo emprestimo = montaEmprestimo();
        this.service.getBiblioteca().editEmprestimo(emprestimo);
        this.limpaTela();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(this.buscaLivroDialog != null) this.buscaLivroDialog.setVisible(false);
        this.buscaLivroDialog = new BuscaLivroDialog(this,this.service);
        this.buscaLivroDialog.setVisible(true);
        this.buscaLivroDialog.addWindowListener(new BuscarWindowListener());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private Emprestimo montaEmprestimo(){
        Emprestimo emprestimo = new Emprestimo(this.jTextFieldLeitor.getText(), this.jTextFieldLivro.getText(),(String) this.jTextFieldData.getText());
        emprestimo.setDevolvido(this.jCheckBoxDevolvido.isSelected());
        if(!this.jTextFieldId.getText().isEmpty())
            emprestimo.setId(Integer.parseInt(this.jTextFieldId.getText()));
        return emprestimo;
    }
    
    public void limpaTela() {
        this.jTextFieldId.setText("");
        this.jTextFieldLivro.setText("");
        this.jTextFieldLeitor.setText("");
        this.jTextFieldData.setText("");
        this.jCheckBoxDevolvido.setSelected(false);
        this.jTableCatalogo.setModel(initTable());
        this.jTableCatalogo.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxDevolvido;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLeitor;
    private javax.swing.JLabel jLabelLivro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCatalogo;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLeitor;
    private javax.swing.JTextField jTextFieldLivro;
    // End of variables declaration//GEN-END:variables

    public class BuscarWindowListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowClosed(WindowEvent e) {
            jTextFieldLivro.setText(buscaLivroDialog.getSelecionado().getTitulo());
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
