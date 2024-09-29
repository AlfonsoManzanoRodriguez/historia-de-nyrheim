package proyectoprogramacion.Marcos.MarcosDesafios;

import proyectoprogramacion.Acciones;
import proyectoprogramacion.Marcos.MarcosUbicación.Aldea;
import proyectoprogramacion.Marcos.MarcosUbicación.GameOver;
import proyectoprogramacion.Marcos.MarcosUbicación.YouWin;
import proyectoprogramacion.Personajes.Personaje;
import proyectoprogramacion.TextoEImagenes;

public class CuatroOpciones extends javax.swing.JFrame {

    private Aldea aldea; // Marco de la aldea

    public CuatroOpciones(Aldea aldea) {
        this.aldea = aldea;
        initComponents();
    }

    private int respuestaCorrecta, destinoAcierto, destinoFallo;
    private int respuestaElegida = 1; // Es la respuesta elegida ( 1 por defecto)

    // impresión de imagen en la caja
    public void lanzaImagen(int numImagen) {
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(numImagen))));
    }

    // Impresión de propiedades en curso:
    public void imprimeVidaYDinero() {

        cajaVida.setText(aldea.getTim().caracteristicasVida());
        cajaDinero.setText(aldea.getTim().caracteristicasDinero());
    }

    // Impresión de la caja de texto 
    public void cajaTexto4Opciones(int numTexto) { // Pasas un numero de texto por parámetro y lo imprime en la caja de textos
        cajaTexto.setText(TextoEImagenes.cargaTexto(numTexto));
    }

    public void cajaTexto4Opciones2(String texto) { // Pasas un texto por parámetro y lo imprime en la caja de textos
        cajaTexto.setText(texto);
    }

    // Impresión de selector de opciones RadioButton
    public void lanzaRespuestaA(String respuestaA) { // Pasas un numero de texto por parámetro y lo imprime en la caja de textos
        A.setText(respuestaA);
    }

    public void lanzaRespuestaB(String respuestaB) { // Pasas un numero de texto por parámetro y lo imprime en la caja de textos
        B.setText(respuestaB);
    }

    public void lanzaRespuestaC(String respuestaC) { // Pasas un numero de texto por parámetro y lo imprime en la caja de textos
        C.setText(respuestaC);
    }

    public void lanzaRespuestaD(String respuestaD) { // Pasas un numero de texto por parámetro y lo imprime en la caja de textos
        D.setText(respuestaD);
    }

    // Modificador de propiedades
    public void modificarPropiedades(int acier, int dAcierto, int dFallo) {
        this.respuestaCorrecta = acier; // Respuesta correcta
        this.destinoAcierto = dAcierto; // Destino si aciertas
        this.destinoFallo = dFallo; // Destino si falla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panel_contenido = new javax.swing.JPanel();
        cajaImagen = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        siguiente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajaTexto = new javax.swing.JTextArea();
        cajaVida = new javax.swing.JTextField();
        cajaDinero = new javax.swing.JTextField();
        panel_fondo = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(1920, 1070));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1920, 1070));
        jLayeredPane1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );

        jLayeredPane1.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1070));
        setMinimumSize(new java.awt.Dimension(1920, 1070));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1070));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        panel_contenido.setMaximumSize(new java.awt.Dimension(1920, 1070));
        panel_contenido.setOpaque(false);
        panel_contenido.setPreferredSize(new java.awt.Dimension(1920, 1070));

        cajaImagen.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N

        A.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(A);
        A.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        A.setText("Opcion primera");
        A.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(B);
        B.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B.setText("Opcion segunda");
        B.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(C);
        C.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        C.setText("Opcion tercera");
        C.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(D);
        D.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        D.setText("Opcion cuarta");
        D.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        siguiente.setBackground(new java.awt.Color(255, 204, 0));
        siguiente.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        siguiente.setText("Next");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        cajaTexto.setEditable(false);
        cajaTexto.setColumns(20);
        cajaTexto.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        cajaTexto.setForeground(new java.awt.Color(51, 51, 51));
        cajaTexto.setLineWrap(true);
        cajaTexto.setRows(5);
        cajaTexto.setWrapStyleWord(true);
        cajaTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jScrollPane2.setViewportView(cajaTexto);

        cajaVida.setEditable(false);
        cajaVida.setBackground(new java.awt.Color(255, 255, 204));
        cajaVida.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cajaVida.setForeground(new java.awt.Color(102, 102, 0));
        cajaVida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaVida.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        cajaVida.setOpaque(true);

        cajaDinero.setEditable(false);
        cajaDinero.setBackground(new java.awt.Color(255, 255, 204));
        cajaDinero.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cajaDinero.setForeground(new java.awt.Color(102, 102, 0));
        cajaDinero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaDinero.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        cajaDinero.setOpaque(true);

        javax.swing.GroupLayout panel_contenidoLayout = new javax.swing.GroupLayout(panel_contenido);
        panel_contenido.setLayout(panel_contenidoLayout);
        panel_contenidoLayout.setHorizontalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenidoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaImagen))
                .addGap(84, 84, 84)
                .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(panel_contenidoLayout.createSequentialGroup()
                        .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                        .addGap(79, 79, 79)
                        .addComponent(siguiente))
                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_contenidoLayout.createSequentialGroup()
                        .addComponent(cajaVida, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        panel_contenidoLayout.setVerticalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenidoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_contenidoLayout.createSequentialGroup()
                        .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaVida, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajaImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenidoLayout.createSequentialGroup()
                        .addComponent(A)
                        .addGap(43, 43, 43)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenidoLayout.createSequentialGroup()
                        .addComponent(B)
                        .addGap(43, 43, 43)
                        .addGroup(panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );

        getContentPane().add(panel_contenido);

        panel_fondo.setMaximumSize(new java.awt.Dimension(1920, 1070));
        panel_fondo.setMinimumSize(new java.awt.Dimension(1920, 1070));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_fondoJuego2.png"))); // NOI18N

        javax.swing.GroupLayout panel_fondoLayout = new javax.swing.GroupLayout(panel_fondo);
        panel_fondo.setLayout(panel_fondoLayout);
        panel_fondoLayout.setHorizontalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE))
        );
        panel_fondoLayout.setVerticalGroup(
            panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
            .addGroup(panel_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
        );

        getContentPane().add(panel_fondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        respuestaElegida = 2;
    }//GEN-LAST:event_BActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        if (aldea.isSalida() == false) {
            aldea.getAcc().compruebaAcierto(respuestaElegida, respuestaCorrecta, destinoAcierto, destinoFallo);
            aldea.continuaRuta();
        } else {

            aldea.getAcc().compruebaAcierto(respuestaElegida, respuestaCorrecta, destinoAcierto, destinoFallo);
            aldea.imprimeCajaTextoAldea(1);
            aldea.setSalida(false);

            if (aldea.getAcc().getDragon().getVidaEnemigo() <= 0) {
                aldea.ImprimeCabezaDragon();
                aldea.setTrofeoDragon(true);
            }

            if (aldea.getAcc().getOnis().getVidaEnemigo() <= 0) {
                aldea.ImprimecabezaOnis();
                aldea.setTrofeoOnis(true);
            }

            if (aldea.getAcc().getSirena().getVidaEnemigo() <= 0) {
                aldea.ImprimeCabezaSirena();
                aldea.setTrofeoSirena(true);
            }

            if (aldea.isTrofeoDragon() == true && aldea.isTrofeoOnis() == true && aldea.isTrofeoSirena() == true) { // Este condicional define si ocurre final de partida y si ganamos
                aldea.getYw().setVisible(true); // Lanza el fin de juego en modo ganador
                this.dispose();
            } else {
                aldea.setVisible(true);
                this.dispose();
            }

        }

        if (Personaje.getVidaHeroe() <= 0) {
            aldea.getGov().setVisible(true); // Lanza el fin de juego en modo perderdor
            this.dispose();
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        respuestaElegida = 4;
    }//GEN-LAST:event_DActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        respuestaElegida = 1;
    }//GEN-LAST:event_AActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        respuestaElegida = 3;
    }//GEN-LAST:event_CActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cajaDinero;
    private javax.swing.JLabel cajaImagen;
    private javax.swing.JTextArea cajaTexto;
    private javax.swing.JTextField cajaVida;
    private javax.swing.JLabel fondo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_contenido;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables

}
