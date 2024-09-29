package proyectoprogramacion.Marcos.MarcosAcceso;

import javax.swing.JOptionPane;
import proyectoprogramacion.Acceso;
import static proyectoprogramacion.Acceso.agregarUsuarioMap;
import proyectoprogramacion.Marcos.MarcosUbicación.HistoriaNyrheim;

public class Identificacion extends javax.swing.JFrame {

    public Identificacion() {
        initComponents();
    }
    
    public void goHistoriaNyrheim() { // Envía hacía la pantalla de juego
        HistoriaNyrheim nyrheim = new HistoriaNyrheim();
        nyrheim.cajaTextoHN(1);
        nyrheim.setVisible(true); // Abrimos ventana ya configurada
        this.dispose(); // Cerramos ventana actual
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        vuelveInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ingresaNick = new javax.swing.JTextField();
        ingresaPassword = new javax.swing.JTextField();
        inserta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lambeimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPane1);

        jPanel1.setOpaque(false);

        vuelveInicio.setBackground(new java.awt.Color(255, 204, 0));
        vuelveInicio.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        vuelveInicio.setText("Inicio");
        vuelveInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vuelveInicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nick");

        ingresaNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaNickActionPerformed(evt);
            }
        });

        inserta.setBackground(new java.awt.Color(255, 204, 0));
        inserta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        inserta.setText("log In");
        inserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inserta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vuelveInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ingresaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(ingresaNick))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresaNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vuelveInicio)
                    .addComponent(inserta))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1);

        lambeimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondopequeño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(lambeimagen)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(lambeimagen)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertaActionPerformed
        Acceso.cargarMap();
        String mensajeError = "Usuario inexistente o contraseña incorrecta";
        try {
            if (Acceso.autentica(ingresaNick.getText(), ingresaPassword.getText())) {
                //Acceso.muestraMapa();
                Acceso.guardarUsuarios();
                // Cargamos nombre jugador
                Acceso.setJugadorEnCurso(ingresaNick.getText());
                
                // Empieza el juego
                goHistoriaNyrheim();
            } else {
                JOptionPane.showMessageDialog(null, mensajeError);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, mensajeError);
        }
    }//GEN-LAST:event_insertaActionPerformed

    private void vuelveInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vuelveInicioActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vuelveInicioActionPerformed

    private void ingresaNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresaNickActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ingresaNick;
    private javax.swing.JTextField ingresaPassword;
    private javax.swing.JButton inserta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lambeimagen;
    private javax.swing.JButton vuelveInicio;
    // End of variables declaration//GEN-END:variables

}
