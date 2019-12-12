/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melissa
 */
public class PrestamoLibrosUsuario extends javax.swing.JFrame {

    /**
     * Creates new form PrestamoLibrosUsuario
     */
    public PrestamoLibrosUsuario() {
        initComponents();
        setTitle("PRÉSTAMO DE LIBROS");
        setSize(580,600);
        setResizable(false);
        setLocationRelativeTo(null);
    }
     public void prestar(){
       if(jTextField1.getText().equals("Harry Potter")){
           jTextField2.setText("8 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Hojas perdidas")){
           jTextField2.setText("8 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("La Odisea")){
           jTextField2.setText("12 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Guerra de los Mundos")){
          jTextField2.setText("10 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Soy Leyenda")){
          jTextField2.setText("9 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Star Wars")){
          jTextField2.setText("10 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Blanca Nieves")){
           jTextField2.setText("6 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("El Patito Feo")){
           jTextField2.setText("6 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Rapunzel")){
           jTextField2.setText("7 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Camino de Sombras")){
           jTextField2.setText("10 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Jardines de la Luna")){
           jTextField2.setText("11 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Hadas del Reino")){
           jTextField2.setText("8 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Fantasma de la ópera")){
           jTextField2.setText("10 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       
    }else if(jTextField1.getText().equals("El Monje")){
           jTextField2.setText("12 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Frankenstein")){
           jTextField2.setText("15 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("La pareja de al lado")){
           jTextField2.setText("9 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Tristeza del Samurai")){
           jTextField2.setText("10 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("No cierres los ojos")){
           jTextField2.setText("9 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Alados")){
           jTextField2.setText("12 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Pasaje al Misterio")){
           jTextField2.setText("14 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Sobrenatural")){
           jTextField2.setText("10 días");
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(605, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Préstamo de Libros");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Escriba el nombre del libro que desea:");

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Debe devolver el libro a la librería en: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("¿Necesita envío?");

        jRadioButton1.setText("Sí");

        jRadioButton2.setText("No");

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio de Envío:");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))
                                    .addComponent(jButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new VentaLibrosUsuarios().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new Inicio().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       prestar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prestar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrestamoLibrosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoLibrosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoLibrosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoLibrosUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrestamoLibrosUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
