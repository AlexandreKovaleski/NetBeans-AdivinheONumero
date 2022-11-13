package com.atitus.poo.adivinhaonumero;

import java.util.Random;

public class JogoAdivinhacao extends javax.swing.JFrame {

    public JogoAdivinhacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtTitle = new javax.swing.JLabel();
        BtnSortear = new javax.swing.JButton();
        UserInput = new javax.swing.JTextField();
        BtnTentar = new javax.swing.JButton();
        TxtDica = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        TxtTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TxtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtTitle.setText("ADIVINHE QUAL O NÚMERO QUE ESTOU PENSANDO");

        BtnSortear.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnSortear.setText("SORTEAR");
        BtnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSortearActionPerformed(evt);
            }
        });

        UserInput.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        UserInput.setForeground(new java.awt.Color(0, 0, 255));
        UserInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInputActionPerformed(evt);
            }
        });

        BtnTentar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnTentar.setText("TENTAR");
        BtnTentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTentarActionPerformed(evt);
            }
        });

        TxtDica.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        TxtDica.setForeground(new java.awt.Color(255, 0, 0));
        TxtDica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtDica.setText("SORTEIE O NÚMERO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BtnSortear, javax.swing.GroupLayout.DEFAULT_SIZE, 157,
                                                Short.MAX_VALUE)
                                        .addComponent(UserInput)
                                        .addComponent(BtnTentar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(340, 340, 340))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(TxtDica, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(BtnSortear, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(UserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnTentar, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TxtDica, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random random = new Random();
    int numeroSorteado = random.nextInt(1000) + 1;

    Boolean palpite = true;

    private void BtnSortearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnSortearActionPerformed
        numeroSorteado = random.nextInt(1000) + 1;
        palpite = true;
        TxtDica.setText("NÚMERO ENTRE 1 E 1000 FOI SORTEADO, BOA SORTE!");
    }// GEN-LAST:event_BtnSortearActionPerformed

    private void BtnTentarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnTentarActionPerformed
        if (palpite) {
            int tentativa = Integer.parseInt(UserInput.getText());

            if (tentativa == numeroSorteado) {
                TxtDica.setText("PARABÉNS, VOCÊ ACERTOU!!!");
                palpite = false;
            } else if (tentativa > numeroSorteado) {
                TxtDica.setText("É UM NÚMERO MENOR");
            } else if (tentativa < numeroSorteado) {
                TxtDica.setText("É UM NÚMERO MAIOR");
            }
        }
    }// GEN-LAST:event_BtnTentarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhacao.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhacao.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhacao.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinhacao.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoAdivinhacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSortear;
    private javax.swing.JButton BtnTentar;
    private javax.swing.JLabel TxtDica;
    private javax.swing.JLabel TxtTitle;
    private javax.swing.JTextField UserInput;
    // End of variables declaration//GEN-END:variables
}
