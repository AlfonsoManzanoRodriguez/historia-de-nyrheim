package proyectoprogramacion.Marcos.MarcosAcceso;

import proyectoprogramacion.Marcos.MarcosAcceso.Inserta;
import proyectoprogramacion.Acceso;
import proyectoprogramacion.Marcos.MarcosUbicación.HistoriaNyrheim;
import proyectoprogramacion.Puntuaciones;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    Estadisticas est = new Estadisticas();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        irinsert = new javax.swing.JButton();
        irelimina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        identificarse = new javax.swing.JButton();
        irEstadisticas = new javax.swing.JButton();
        fondo = new javax.swing.JPanel();
        labelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 200));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        Contenido.setMaximumSize(new java.awt.Dimension(500, 500));
        Contenido.setOpaque(false);
        Contenido.setPreferredSize(new java.awt.Dimension(400, 472));

        irinsert.setBackground(new java.awt.Color(255, 204, 0));
        irinsert.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        irinsert.setText("Insertar");
        irinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irinsertActionPerformed(evt);
            }
        });

        irelimina.setBackground(new java.awt.Color(255, 204, 0));
        irelimina.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        irelimina.setText("Eliminar");
        irelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ireliminaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nyrheim Defense");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        identificarse.setBackground(new java.awt.Color(255, 204, 0));
        identificarse.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        identificarse.setText("Identificacion");
        identificarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificarseActionPerformed(evt);
            }
        });

        irEstadisticas.setBackground(new java.awt.Color(255, 204, 0));
        irEstadisticas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        irEstadisticas.setText("Estadísticas");
        irEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addComponent(identificarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(irinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContenidoLayout.createSequentialGroup()
                        .addComponent(irelimina, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(irEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificarse, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(irinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(irelimina, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(irEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenidoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        getContentPane().add(Contenido);

        labelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondopequeño.png"))); // NOI18N

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(labelImagen)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(fondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irinsertActionPerformed
        Inserta insert = new Inserta();
        insert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_irinsertActionPerformed

    private void ireliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ireliminaActionPerformed
        Elimina elimina = new Elimina();
        elimina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ireliminaActionPerformed

    private void identificarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificarseActionPerformed
        Identificacion iden = new Identificacion();
        iden.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_identificarseActionPerformed

    private void irEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irEstadisticasActionPerformed
        est.cajaTextoPuntuaciones();
        est.cajaTextoPuntuacionesNombre();
        est.cajaTextoPuntuacionesValor();
        est.cajaTextoPuntuacionMayor();
        est.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_irEstadisticasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton identificarse;
    private javax.swing.JButton irEstadisticas;
    private javax.swing.JButton irelimina;
    private javax.swing.JButton irinsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelImagen;
    // End of variables declaration//GEN-END:variables
}
