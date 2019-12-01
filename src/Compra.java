
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melissa
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    public Compra() {
        initComponents();
        setTitle("COMPRA");
        setSize(580,600);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void comprar(){
       if(jTextField1.getText().equals("Harry Potter")){
           jTextField2.setText(String.valueOf(12500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(12500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Hojas perdidas")){
           jTextField2.setText(String.valueOf(6500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(6500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("La Odisea")){
           jTextField2.setText(String.valueOf(5900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(5900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Guerra de los Mundos")){
           jTextField2.setText(String.valueOf(8900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Soy Leyenda")){
           jTextField2.setText(String.valueOf(6900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(6900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       }else if(jTextField1.getText().equals("Star Wars")){
           jTextField2.setText(String.valueOf(12500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(12500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Blanca Nieves")){
           jTextField2.setText(String.valueOf(8900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("El Patito Feo")){
           jTextField2.setText(String.valueOf(5000));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(5000+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Rapunzel")){
           jTextField2.setText(String.valueOf(4500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(4500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Camino de Sombras")){
           jTextField2.setText(String.valueOf(6900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(6900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Jardines de la Luna")){
           jTextField2.setText(String.valueOf(8500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Hadas del Reino")){
           jTextField2.setText(String.valueOf(8900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Fantasma de la ópera")){
           jTextField2.setText(String.valueOf(6900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(6900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
       
    }else if(jTextField1.getText().equals("El Monje")){
           jTextField2.setText(String.valueOf(8900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Frankenstein")){
           jTextField2.setText(String.valueOf(12500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(12500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("La pareja de al lado")){
           jTextField2.setText(String.valueOf(8900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Tristeza del Samurai")){
           jTextField2.setText(String.valueOf(6900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(6900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("No cierres los ojos")){
           jTextField2.setText(String.valueOf(8500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Alados")){
           jTextField2.setText(String.valueOf(8500));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(8500+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Pasaje al Misterio")){
           jTextField2.setText(String.valueOf(5900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(5900+950));
           }else if(jRadioButton2.isSelected()){
               jTextField3.setText(" ");
           }
    }else if(jTextField1.getText().equals("Sobrenatural")){
           jTextField2.setText(String.valueOf(5900));
           if(jRadioButton1.isSelected()){
               jTextField3.setText(String.valueOf(5900+950));
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Comprar");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Escriba el nombre del libro que desea comprar:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Selecionar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("¿Necesita Envío?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sí");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Precio+Envío:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new VentaLibrosUsuarios().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        comprar();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        comprar();
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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
