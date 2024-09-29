package proyectoprogramacion.Marcos.MarcosAcceso;

import proyectoprogramacion.Marcos.MarcosAcceso.Inicio;
import proyectoprogramacion.Acceso;
import proyectoprogramacion.Marcos.MarcosUbicación.GameOver;
import proyectoprogramacion.Marcos.MarcosUbicación.YouWin;
import proyectoprogramacion.Puntuaciones;
import proyectoprogramacion.Marcas;

public class Estadisticas extends javax.swing.JFrame {

    public Estadisticas() {
        initComponents();
    }

    //Puntuaciones pun = new Puntuaciones();
    YouWin win = new YouWin(); // Clase de fin de juego modo ganador
    GameOver over = new GameOver(); // Clase de fin de juego modo perdedor

    public void cajaTextoPuntuaciones() { // Pasa el contenido del String a la caja de texto
        cajaTexto1.setText(Puntuaciones.leerPuntuaciones());
    }

    public void cajaTextoPuntuacionesNombre() { // Pasa el contenido del String a la caja de texto
        Puntuaciones.cargarMap();
        cajaTexto2.setText(Puntuaciones.leerPuntuacionesOrdenadasNombre());
    }

    public void cajaTextoPuntuacionesValor() { // Pasa el contenido del String a la caja de texto
        Puntuaciones.cargarMap();
        cajaTexto3.setText(Marcas.LeerPuntuacionesOrdenado());
    }

    public void cajaTextoPuntuacionMayor() { // Pasa el contenido del String a la caja de texto
        cajaTexto4.setText("" + Puntuaciones.puntuacionMasAlta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capasuperpocion = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        vuelveInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaTexto1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajaTexto2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        cajaTexto3 = new javax.swing.JTextArea();
        cajaTexto4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        laibelimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        javax.swing.GroupLayout capasuperpocionLayout = new javax.swing.GroupLayout(capasuperpocion);
        capasuperpocion.setLayout(capasuperpocionLayout);
        capasuperpocionLayout.setHorizontalGroup(
            capasuperpocionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        capasuperpocionLayout.setVerticalGroup(
            capasuperpocionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        getContentPane().add(capasuperpocion);

        jPanel1.setOpaque(false);

        botonSalir.setBackground(new java.awt.Color(255, 204, 0));
        botonSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        vuelveInicio.setBackground(new java.awt.Color(255, 204, 0));
        vuelveInicio.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        vuelveInicio.setText("Inicio");
        vuelveInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vuelveInicioActionPerformed(evt);
            }
        });

        cajaTexto1.setEditable(false);
        cajaTexto1.setBackground(new java.awt.Color(255, 255, 255));
        cajaTexto1.setColumns(20);
        cajaTexto1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cajaTexto1.setLineWrap(true);
        cajaTexto1.setRows(5);
        cajaTexto1.setWrapStyleWord(true);
        cajaTexto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane1.setViewportView(cajaTexto1);

        cajaTexto2.setEditable(false);
        cajaTexto2.setBackground(new java.awt.Color(255, 255, 255));
        cajaTexto2.setColumns(20);
        cajaTexto2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cajaTexto2.setLineWrap(true);
        cajaTexto2.setRows(5);
        cajaTexto2.setWrapStyleWord(true);
        cajaTexto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane2.setViewportView(cajaTexto2);

        cajaTexto3.setEditable(false);
        cajaTexto3.setBackground(new java.awt.Color(255, 255, 255));
        cajaTexto3.setColumns(20);
        cajaTexto3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cajaTexto3.setLineWrap(true);
        cajaTexto3.setRows(5);
        cajaTexto3.setWrapStyleWord(true);
        cajaTexto3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jScrollPane3.setViewportView(cajaTexto3);

        cajaTexto4.setBackground(new java.awt.Color(204, 255, 204));
        cajaTexto4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cajaTexto4.setForeground(new java.awt.Color(51, 51, 255));
        cajaTexto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cajaTexto4.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mejor puntuación");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Por valor");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Actuales");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(51, 153, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Por nombre");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaTexto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(vuelveInicio)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vuelveInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(cajaTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel1);

        laibelimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondopequeño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(laibelimagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(laibelimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vuelveInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vuelveInicioActionPerformed
        Inicio start = new Inicio();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vuelveInicioActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextArea cajaTexto1;
    private javax.swing.JTextArea cajaTexto2;
    private javax.swing.JTextArea cajaTexto3;
    private javax.swing.JLabel cajaTexto4;
    private javax.swing.JLayeredPane capasuperpocion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel laibelimagen;
    private javax.swing.JButton vuelveInicio;
    // End of variables declaration//GEN-END:variables
}
