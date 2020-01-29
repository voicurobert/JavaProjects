/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_08_jdbc.exemplu.view;

import java.awt.event.MouseEvent;
import java.util.List;
import java_1_professional.chapter_08_jdbc.exemplu.controller.MainController;
import java_1_professional.chapter_08_jdbc.exemplu.model.Departament;
import javax.swing.DefaultListModel;

/**
 *
 * @author Robert
 */
public class DepartamanteFrame extends javax.swing.JFrame {

    private DefaultListModel< Departament> model;

    public DepartamanteFrame() {
        initComponents();

        model = new DefaultListModel<>();
        jList1.setModel(model);
        refresh();

        setLocationRelativeTo(null);

    }

    private void refresh() {
        model.clear();
        List< Departament> list = MainController.getInstance().getDepartamente();
        list.forEach(departament -> model.addElement(departament));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        departamentNameTextField = new javax.swing.JTextField();
        adaugaDepartamentButtonId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        adaugaDepartamentButtonId.setText("Adauga");
        adaugaDepartamentButtonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaugaDepartamentButtonIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(departamentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(adaugaDepartamentButtonId)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adaugaDepartamentButtonId))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adaugaDepartamentButtonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaugaDepartamentButtonIdActionPerformed
        // TODO add your handling code here:
        String nume = departamentNameTextField.getText();
        Departament d = new Departament(0, nume);
        boolean rez = MainController.getInstance().adaugaDepartament(d);
        if (rez) {
            refresh();
            departamentNameTextField.setText("");
        }
    }//GEN-LAST:event_adaugaDepartamentButtonIdActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2
            && evt.getButton() == MouseEvent.BUTTON1
            && jList1.getSelectedValue() != null) {

            final Departament d = jList1.getSelectedValue();
            new AngajatiFrame(d).setVisible(true);
        }
    }//GEN-LAST:event_jList1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adaugaDepartamentButtonId;
    private javax.swing.JTextField departamentNameTextField;
    private javax.swing.JList<Departament> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
