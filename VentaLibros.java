public class VentaLibros extends javax.swing.JFrame {

    public VentaLibros() {
        initComponents();
        setTitle("LIBROS VENTA");
        setSize(580,600);
        setResizable(false);
        setLocationRelativeTo(null);
        llenarCateg();
    }

    public void llenarCateg(){
        jComboBox1.addItem("Aventura");
        jComboBox1.addItem("Ciencia Ficción");
        jComboBox1.addItem("Cuentos de Hadas");
        jComboBox1.addItem("Fantasía");
        jComboBox1.addItem("Gótica");
        jComboBox1.addItem("Policíaca");
        jComboBox1.addItem("Paranormal");
    }
    
    public void llenarLV(){
        VentaLibro v=new VentaLibro();
        v.setCant_a1_v("53");
        v.setCant_a2_v("45");
        v.setCant_a3_v("36");
        v.setCant_cf1_v("17");
        v.setCant_cf2_v("36");
        v.setCant_cf3_v("26");
        v.setCant_ch1_v("45");
        v.setCant_ch2_v("78");
        v.setCant_ch3_v("49");
        v.setCant_f1_v("31");
        v.setCant_f2_v("28");
        v.setCant_f3_v("47");
        v.setCant_g1_v("16");
        v.setCant_g2_v("20");
        v.setCant_g3_v("9");
        v.setCant_pl1_v("41");
        v.setCant_pl2_v("35");
        v.setCant_pl3_v("19");
        v.setCant_pa1_v("30");
        v.setCant_pa2_v("12");
        v.setCant_pa3_v("27");
    }
    
    public void buscar(){
        VentaLibro n=new VentaLibro();
        n.setCategoria(jComboBox1.getSelectedItem().toString());
        switch (n.getCategoria()) {
            case "Aventura":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("Harry Potter");
                jTextField5.setText("Hojas perdidas");
                jTextField8.setText("La Odisea");
                jTextField3.setText(n.getCant_a1_v());
                jTextField6.setText(n.getCant_a2_v());
                jTextField9.setText(n.getCant_a3_v());
                break;
            case "Ciencia Ficción":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("Guerra de los Mundos");
                jTextField5.setText("Soy Leyenda");
                jTextField8.setText("Star Wars");
                jTextField3.setText(n.getCant_cf1_v());
                jTextField6.setText(n.getCant_cf2_v());
                jTextField9.setText(n.getCant_cf3_v());
                break;
            case "Cuentos de Hadas":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("Blanca Nieves");
                jTextField5.setText("El Patito Feo");
                jTextField8.setText("Rapunzel");
                jTextField3.setText(n.getCant_ch1_v());
                jTextField6.setText(n.getCant_ch2_v());
                jTextField9.setText(n.getCant_ch3_v());
                break;
            case "Fantasía":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("Camino de Sombras");
                jTextField5.setText("Jardines de la Luna");
                jTextField8.setText("Hadas del Reino");
                jTextField3.setText(n.getCant_f1_v());
                jTextField6.setText(n.getCant_f2_v());
                jTextField9.setText(n.getCant_f3_v());
                break;
            case "Gótica":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("Fantasma de la ópera");
                jTextField5.setText("El Monje");
                jTextField8.setText("Frankenstein");
                jTextField3.setText(n.getCant_g1_v());
                jTextField6.setText(n.getCant_g2_v());
                jTextField9.setText(n.getCant_g3_v());
                break;
            case "Policíaca":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("La pareja de al lado");
                jTextField5.setText("Tristeza del Samurai");
                jTextField8.setText("No cierres los ojos");
                jTextField3.setText(n.getCant_pl1_v());
                jTextField6.setText(n.getCant_pl2_v());
                jTextField9.setText(n.getCant_pl3_v());
                break;
            case "Paranormal":
                jTextField1.setText(n.getCategoria());
                jTextField4.setText(n.getCategoria());
                jTextField7.setText(n.getCategoria());
                jTextField2.setText("Alados");
                jTextField5.setText("Pasaje al Misterio");
                jTextField8.setText("Sobrenatural");
                jTextField3.setText(n.getCant_pa1_v());
                jTextField6.setText(n.getCant_pa2_v());
                jTextField9.setText(n.getCant_pa3_v());
                break;
            default:
                break;
        }
    }
    
    public void modificar(){
        VentaLibro n=new VentaLibro();
        n.setCategoria(jComboBox1.getSelectedItem().toString());
        switch (n.getCategoria()) {
            case "Aventura":
                n.setCant_a1_v(jTextField3.getText());
                n.setCant_a2_v(jTextField6.getText());
                n.setCant_a3_v(jTextField9.getText());
                break;
            case "Ciencia Ficción":
                n.setCant_cf1_v(jTextField3.getText());
                n.setCant_cf2_v(jTextField6.getText());
                n.setCant_cf3_v(jTextField9.getText());
                break;
            case "Cuentos de Hadas":
                n.setCant_ch1_v(jTextField3.getText());
                n.setCant_ch2_v(jTextField6.getText());
                n.setCant_ch3_v(jTextField9.getText());
                break;
            case "Fantasía":
                n.setCant_f1_v(jTextField3.getText());
                n.setCant_f2_v(jTextField6.getText());
                n.setCant_f3_v(jTextField9.getText());
                break;
            case "Gótica":
                n.setCant_g1_v(jTextField3.getText());
                n.setCant_g2_v(jTextField6.getText());
                n.setCant_g3_v(jTextField9.getText());
                break;
            case "Policíaca":
                jTextField2.setText("La pareja de al lado");
                jTextField5.setText("Tristeza del Samurai");
                jTextField8.setText("No cierres los ojos");
                n.setCant_pl1_v(jTextField3.getText());
                n.setCant_pl2_v(jTextField6.getText());
                n.setCant_pl3_v(jTextField9.getText());
                break;
            case "Paranormal":                
                n.setCant_pa1_v(jTextField3.getText());
                n.setCant_pa2_v(jTextField6.getText());
                n.setCant_pa3_v(jTextField9.getText());
                break;
            default:
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Libros para Venta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione una categoría:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Categoría");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Título del Libro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4)
                            .addComponent(jTextField7)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField5)
                            .addComponent(jTextField8)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarLV();
        buscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Inventario().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
