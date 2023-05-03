/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.senac.biblioteca.swing;

import com.senac.biblioteca.DadosService;

/**
 *
 * @author correa_rafael
 */
public class HomeFrame extends javax.swing.JFrame {
    private final DadosService service = new DadosService();

    private CatalogoDialog catalogo;
    private EmprestimoFrame emprestimos;

    /**
     * Creates new form Home
     */
    public HomeFrame() {
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

        jButtonCatalogo = new javax.swing.JButton();
        jButtonEmprestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");

        jButtonCatalogo.setText("Catálogo");
        jButtonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCatalogoActionPerformed(evt);
            }
        });

        jButtonEmprestar.setText("Emprestar");
        jButtonEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEmprestar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCatalogo)
                    .addComponent(jButtonEmprestar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestarActionPerformed
        if(this.emprestimos != null) this.emprestimos.setVisible(false);
        this.emprestimos = new EmprestimoFrame(this,this.service);
        this.emprestimos.setVisible(true);
    }//GEN-LAST:event_jButtonEmprestarActionPerformed

    private void jButtonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCatalogoActionPerformed
        if(this.catalogo != null) this.catalogo.setVisible(false);
        this.catalogo = new CatalogoDialog(this,this.service);
        this.catalogo.setVisible(true);
    }//GEN-LAST:event_jButtonCatalogoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCatalogo;
    private javax.swing.JButton jButtonEmprestar;
    // End of variables declaration//GEN-END:variables
}
