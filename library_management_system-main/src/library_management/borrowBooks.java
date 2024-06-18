package library_management;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class borrowBooks extends javax.swing.JFrame {
    public borrowBooks() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPic = new javax.swing.JLabel();
        nameTitle = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        authorTitle = new javax.swing.JLabel();
        isbnInput = new javax.swing.JTextField();
        isbnTitle = new javax.swing.JLabel();
        borrowInput = new javax.swing.JLabel();
        Borrow = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        mainPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design.png"))); // NOI18N

        nameTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameTitle.setForeground(new java.awt.Color(153, 0, 0));
        nameTitle.setText("Enter Title Name :");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        authorTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        authorTitle.setForeground(new java.awt.Color(153, 0, 0));

        isbnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnInputActionPerformed(evt);
            }
        });

        isbnTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isbnTitle.setForeground(new java.awt.Color(153, 0, 0));
        isbnTitle.setText("Enter ISBN Number :");

        borrowInput.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        borrowInput.setText("Borrow Book");

        Borrow.setBackground(new java.awt.Color(255, 255, 255));
        Borrow.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Borrow.setForeground(new java.awt.Color(153, 0, 0));
        Borrow.setText("Borrow");
        Borrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowMouseClicked(evt);
            }
        });
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(153, 0, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previous.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mainPic, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(isbnTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isbnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nameTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(authorTitle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(message))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(borrowInput))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(30, 30, 30)
                .addComponent(borrowInput)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTitle)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(authorTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnTitle)
                    .addComponent(isbnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Borrow)
                .addGap(41, 41, 41)
                .addComponent(message)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void isbnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnInputActionPerformed

    private void BorrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowMouseClicked

    }//GEN-LAST:event_BorrowMouseClicked

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        if (nameInput.getText().equals("")) {
            message.setText("Title Required !!");
            message.setForeground(Color.red);
        } else if (isbnInput.getText().equals("")) {
            message.setText("ISBN Number Required !!");
            message.setForeground(Color.red);            message.setForeground(Color.red);    }//GEN-LAST:event_BorrowActionPerformed
         else {

            try {
                File myObj = new File("showBooks.txt");
                Scanner myReader = new Scanner(myObj);

                int srNo = 1;
                while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    String[] data = line.split(",");

                    if (nameInput.getText().equals(data[0]) && isbnInput.getText().equals(data[2])) {
                        message.setText("Book is Borrowed");
                        message.setForeground(Color.black);
                        FileWriter importWriter = null;

                        try {
                            importWriter = new FileWriter("borrowBooks.txt", true);
                            importWriter.write(nameInput.getText() + ",");
                            importWriter.write(isbnInput.getText() + "\n");
                            importWriter.close();
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                        break;
                    } else {
                        message.setText("Book doesnot exists");
                        message.setForeground(Color.red);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            nameInput.setText("");
            isbnInput.setText("");
        }

    }
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new menuPanel().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(borrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrowBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrow;
    private javax.swing.JLabel authorTitle;
    private javax.swing.JButton back;
    private javax.swing.JLabel borrowInput;
    private javax.swing.JTextField isbnInput;
    private javax.swing.JLabel isbnTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainPic;
    private javax.swing.JLabel message;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameTitle;
    // End of variables declaration//GEN-END:variables
}
