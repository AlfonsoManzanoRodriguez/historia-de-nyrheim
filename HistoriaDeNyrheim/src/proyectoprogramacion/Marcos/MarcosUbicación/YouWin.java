package proyectoprogramacion.Marcos.MarcosUbicación;

import proyectoprogramacion.Acceso;
import proyectoprogramacion.Enumerados.Dificultad;
import proyectoprogramacion.Enumerados.Tipo;
import proyectoprogramacion.Marcos.MarcosAcceso.Estadisticas;
import proyectoprogramacion.Marcos.MarcosAcceso.Identificacion;
import proyectoprogramacion.Personajes.Personaje;
import proyectoprogramacion.Puntuaciones;

public class YouWin extends javax.swing.JFrame {

    private Estadisticas est;

    public YouWin() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelContenido = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        panelFondo = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1070));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));
        getContentPane().add(jLayeredPane1);

        panelContenido.setOpaque(false);

        botonSalir.setBackground(new java.awt.Color(255, 204, 0));
        botonSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botonSalir.setText("Salir del juego");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(botonSalir)
                .addContainerGap(1351, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap(961, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(71, 71, 71))
        );

        getContentPane().add(panelContenido);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/34_youWin.png"))); // NOI18N

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1592, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1592, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelFondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        Puntuaciones.cargarMap();
        Puntuaciones.agregarElemento(Acceso.getJugadorEnCurso(), Personaje.getVidaHeroe());
        Puntuaciones.guardarPuntuaciones();
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
