/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_08_jdbc.exemplu.view;

import java.awt.event.MouseEvent;
import java.util.List;
import java_1_professional.chapter_08_jdbc.exemplu.controller.MainController;
import java_1_professional.chapter_08_jdbc.exemplu.model.Angajat;
import java_1_professional.chapter_08_jdbc.exemplu.model.Departament;
import javax.swing.DefaultListModel;

/**
 *
 * @author Robert
 */
public class AngajatiFrame extends javax.swing.JFrame {

    private DefaultListModel< Angajat> model;
    private Departament departament;

    /**
     * Creates new form AngajatiFrame
     */
    public AngajatiFrame(Departament departament) {
        initComponents();
        this.departament = departament;
        model = new DefaultListModel<>();
        jList1.setModel(model);
        refresh();
        setLocationRelativeTo(null);
    }

    private void refresh() {
        model.clear();
        List< Angajat> list = MainController.getInstance().getAngajatiByDepartamanetId(departament.getId());
        list.forEach(angajat -> model.addElement(angajat));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Adauga");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nume = jTextField1.getText();
        int varsta = Integer.parseInt(jTextField2.getText());

        Angajat a = new Angajat(0, nume, varsta, departament.getId());
        boolean rez = MainController.getInstance().adaugaAngajat(a);
        if (rez) {
            refresh();
            jTextField1.setText("");
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1
            && jList1.getSelectedValue() != null) {
            boolean rez = MainController.getInstance().removeAngajat(jList1.getSelectedValue());
            if (rez) {
                refresh();
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<Angajat> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
