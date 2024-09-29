package proyectoprogramacion.Marcos.MarcosUbicación;

import proyectoprogramacion.Marcos.MarcosAcceso.EligePersonaje;
import proyectoprogramacion.TextoEImagenes;
import proyectoprogramacion.Acciones;

public class HistoriaNyrheim extends javax.swing.JFrame {

    public HistoriaNyrheim() {
        initComponents();
    }

    private static int numTexto = 1;

    public void cajaTextoHN(int numTexto) { // Pasas un numero de texto por parámetro y lo imprime en la caja de textos
        cajaTexto.setText(TextoEImagenes.cargaTexto(numTexto));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelContenido = new javax.swing.JPanel();
        botonSalto = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();
        areaImagen = new javax.swing.JLabel();
        panel_texto = new javax.swing.JScrollPane();
        cajaTexto = new javax.swing.JTextArea();
        panelFondo = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1070));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));
        getContentPane().add(jLayeredPane1);

        panelContenido.setOpaque(false);

        botonSalto.setBackground(new java.awt.Color(255, 204, 0));
        botonSalto.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botonSalto.setText("Saltar");
        botonSalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaltoActionPerformed(evt);
            }
        });

        botonContinuar.setBackground(new java.awt.Color(255, 204, 0));
        botonContinuar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        areaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4_aldea.png"))); // NOI18N

        cajaTexto.setEditable(false);
        cajaTexto.setBackground(new java.awt.Color(255, 255, 255));
        cajaTexto.setColumns(20);
        cajaTexto.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        cajaTexto.setLineWrap(true);
        cajaTexto.setRows(5);
        cajaTexto.setWrapStyleWord(true);
        cajaTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel_texto.setViewportView(cajaTexto);

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(botonContinuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1226, Short.MAX_VALUE)
                        .addComponent(botonSalto))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(areaImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areaImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_texto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonContinuar)
                    .addComponent(botonSalto))
                .addGap(71, 71, 71))
        );

        getContentPane().add(panelContenido);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_fondoJuego2.png"))); // NOI18N

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1592, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1571, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(fondo)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );

        getContentPane().add(panelFondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaltoActionPerformed
        EligePersonaje eleccion = new EligePersonaje();
        eleccion.CajaTextoHeroe();
        eleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonSaltoActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        numTexto++;
        if (numTexto <= 4) {
            cajaTextoHN(numTexto);
        } else {
            botonSaltoActionPerformed(evt);
        }
    }//GEN-LAST:event_botonContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaImagen;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonSalto;
    private javax.swing.JTextArea cajaTexto;
    private javax.swing.JLabel fondo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JScrollPane panel_texto;
    // End of variables declaration//GEN-END:variables


}
