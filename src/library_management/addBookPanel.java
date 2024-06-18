package library_management;
import library_management.menuPanel;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class addBookPanel extends javax.swing.JFrame {
    private List<menuPanel> bookList;

    class data {

        String title;
        String author;
        String isbn;
        String year;
        String language;

        data(String title, String author, String isbn, String year, String language) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.year = year;
            this.language = language;
        }
    }

    public addBookPanel() {
        bookList = new ArrayList<>();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        mainPic = new javax.swing.JLabel();
        nameTitle = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        authorInput = new javax.swing.JTextField();
        authorTitle = new javax.swing.JLabel();
        isbnInput = new javax.swing.JTextField();
        publishInput = new javax.swing.JTextField();
        publishTitle = new javax.swing.JLabel();
        isbnTitle = new javax.swing.JLabel();
        languageInput = new javax.swing.JTextField();
        languageTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        mainPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design.png"))); // NOI18N

        nameTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameTitle.setForeground(new java.awt.Color(255, 255, 255));
        nameTitle.setText("Enter Title Name :");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        authorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorInputActionPerformed(evt);
            }
        });

        authorTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        authorTitle.setForeground(new java.awt.Color(255, 255, 255));
        authorTitle.setText("Enter Author Name :");

        isbnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnInputActionPerformed(evt);
            }
        });

        publishInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishInputActionPerformed(evt);
            }
        });

        publishTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        publishTitle.setForeground(new java.awt.Color(255, 255, 255));
        publishTitle.setText("Enter Publishing Year :");

        isbnTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        isbnTitle.setForeground(new java.awt.Color(255, 255, 255));
        isbnTitle.setText("Enter ISBN Number :");

        languageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageInputActionPerformed(evt);
            }
        });

        languageTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        languageTitle.setForeground(new java.awt.Color(255, 255, 255));
        languageTitle.setText("Enter Language :");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD A BOOK");

        add.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 102));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

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
                                .addComponent(publishTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(publishInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(isbnTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isbnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nameTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(languageTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(languageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(authorTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(message))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTitle)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorTitle)
                    .addComponent(authorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnTitle)
                    .addComponent(isbnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publishTitle)
                    .addComponent(publishInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(languageTitle)
                    .addComponent(languageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(message)
                .addGap(21, 21, 21)
                .addComponent(add)
                .addGap(14, 14, 14))
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

    private void authorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorInputActionPerformed

    private void isbnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnInputActionPerformed

    private void publishInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publishInputActionPerformed

    private void languageInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageInputActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (nameInput.getText().equals("")) {
            message.setText("Title Required !!");
            message.setForeground(Color.white);
        } else if (authorInput.getText().equals("")) {
            message.setText("Author Name Required !!");
            message.setForeground(Color.white);
        } else if (isbnInput.getText().equals("")) {
            message.setText("ISBN Number Required !!");
            message.setForeground(Color.white);
        } else if (publishInput.getText().equals("")) {
            message.setText("Publishing Year Required !!");
            message.setForeground(Color.white);
        } else if (languageInput.getText().equals("")) {
            message.setText("Language Required !!");
            message.setForeground(Color.white);
        }  else {
            data newbook = new data(nameInput.getText(), authorInput.getText(), isbnInput.getText(), publishInput.getText(), languageInput.getText());

            message.setForeground(Color.yellow);
            message.setText("Success");
            FileWriter importWriter = null;

            try {
                importWriter = new FileWriter("showBooks.txt", true);
                importWriter.write(nameInput.getText() + ",");
                importWriter.write(authorInput.getText()+ ",");
                importWriter.write(isbnInput.getText()+ ",");
                importWriter.write(publishInput.getText()+ ",");
                importWriter.write(languageInput.getText()+ "\n");
                importWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            nameInput.setText("");
            authorInput.setText("");
            isbnInput.setText("");
            publishInput.setText("");
            languageInput.setText("");
        }

    }//GEN-LAST:event_addActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new menuPanel().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(addBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBookPanel().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField authorInput;
    private javax.swing.JLabel authorTitle;
    private javax.swing.JButton back;
    private javax.swing.JTextField isbnInput;
    private javax.swing.JLabel isbnTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField languageInput;
    private javax.swing.JLabel languageTitle;
    private javax.swing.JLabel mainPic;
    private javax.swing.JLabel message;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameTitle;
    private javax.swing.JTextField publishInput;
    private javax.swing.JLabel publishTitle;
    // End of variables declaration//GEN-END:variables
}
