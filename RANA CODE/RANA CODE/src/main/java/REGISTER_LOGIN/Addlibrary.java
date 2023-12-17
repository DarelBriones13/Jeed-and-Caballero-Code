/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;

public class Addlibrary extends javax.swing.JFrame {

    public Addlibrary() {
        initComponents();
        setFieldListeners();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelProduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LIBRARY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCancelProduct.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelProduct.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCancelProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelProduct.setText("CANCEL");
        btnCancelProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelProductActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("ADD BOOK");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Title: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Author(s): ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("ISBN: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Category:  ");

        btnAddProduct.setBackground(new java.awt.Color(0, 204, 0));
        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setText("ADD");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Publication Year: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelProduct)
                    .addComponent(btnAddProduct))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancelProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelProductActionPerformed
        clearFields();
        LibraryManagement x = new LibraryManagement();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnCancelProductActionPerformed
    private void clearFields() {
    txtTitle.setText("");
    txtAuthor.setText("");
    txtISBN.setText("");
    txtCategory.setText("");
    txtYear.setText("");
}

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        String title = txtTitle.getText().trim();
        String author = txtAuthor.getText().trim();
        String isbn = txtISBN.getText().trim();
        String category = txtCategory.getText().trim();
        String year = txtYear.getText().trim();

        boolean errorOccurred = false;

        if (title.isEmpty() || title.equals("Please input a title.")) {
            txtTitle.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtTitle.setText("Please input a title.");
            errorOccurred = true;
        }
        if (author.isEmpty() || author.equals("Please input an author.")) {
            txtAuthor.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtAuthor.setText("Please input an author.");
            errorOccurred = true;
        }
        if (isbn.isEmpty() || isbn.equals("Please input an ISBN.")) {
            txtISBN.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtISBN.setText("Please input an ISBN.");
            errorOccurred = true;
        }
        if (category.isEmpty() || category.equals("Please input a category.")) {
            txtCategory.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtCategory.setText("Please input a category.");
            errorOccurred = true;
        }
        if (year.isEmpty() || year.equals("Please input a year.")) {
            txtYear.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtYear.setText("Please input a year.");
            errorOccurred = true;
        }

        if (!errorOccurred) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to add the book?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Darel Briones\\OneDrive\\Documents\\RANA CODE\\RANA CODE\\LIBRARY MANAGEMENT LIST\\ManagementList.txt", true));
                    writer.write("BOOK INFORMATION");
                    writer.newLine();
                    writer.write("------------------");
                    writer.newLine();
                    writer.write("Title: " + title);
                    writer.newLine();
                    writer.write("Author: " + author);
                    writer.newLine();
                    writer.write("ISBN: " + isbn);
                    writer.newLine();
                    writer.write("Category: " + category);
                    writer.newLine();
                    writer.write("Year: " + year);
                    writer.newLine();
                    writer.write("------------------");
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Book Added Successfully", "The book is successfully added!", JOptionPane.INFORMATION_MESSAGE);
                    LibraryManagement x = new LibraryManagement();
                    x.show();
                    this.hide();
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error occurred while saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            clearWarningText(txtTitle, "Please input a title.");
            clearWarningText(txtAuthor, "Please input an author.");
            clearWarningText(txtISBN, "Please input an ISBN.");
            clearWarningText(txtCategory, "Please input a category.");
            clearWarningText(txtYear, "Please input a year.");
            // Add similar code to handle warnings for other fields if needed
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void setFieldListener(JTextField textField, String warningText) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(warningText)) {
                    textField.setText("");
                    textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(warningText);
                    textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
    } 
    private void clearWarningText(javax.swing.JTextField textField, String warningText) {
        if (textField.getText().equals(warningText)) {
            textField.setText("");
            textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }
    private void setFieldListeners() {
        setFieldListener(txtTitle, "Please input a code.");
        setFieldListener(txtAuthor, "Please input a product name.");
        setFieldListener(txtISBN, "Please input a quantity.");
        setFieldListener(txtCategory, "Please input a price.");
        setFieldListener(txtYear, "Please input a year.");
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
            java.util.logging.Logger.getLogger(Addlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addlibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addlibrary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancelProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
