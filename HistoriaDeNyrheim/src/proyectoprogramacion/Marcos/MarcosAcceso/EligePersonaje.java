package proyectoprogramacion.Marcos.MarcosAcceso;

import proyectoprogramacion.Acciones;
import proyectoprogramacion.Enumerados.Dificultad;
import proyectoprogramacion.Enumerados.Tipo;
import proyectoprogramacion.Marcos.MarcosUbicación.Aldea;
import proyectoprogramacion.TextoEImagenes;
import proyectoprogramacion.Personajes.Orco;
import proyectoprogramacion.Personajes.Personaje;

public class EligePersonaje extends javax.swing.JFrame {

    public EligePersonaje() {
        initComponents();
    }

    private static String personaje = "orco";

    Aldea aldea = new Aldea();

    //public void CajaTextoHeroe() {
    public void CajaTextoHeroe() {
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        Acciones a = aldea.getAcc();
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Difucultad = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelContenido = new javax.swing.JPanel();
        cajaImagen = new javax.swing.JLabel();
        botonOrco = new javax.swing.JButton();
        botonelfo = new javax.swing.JButton();
        botonespectro = new javax.swing.JButton();
        botonComenzar = new javax.swing.JButton();
        textoDificultad = new javax.swing.JLabel();
        sel_facil = new javax.swing.JRadioButton();
        sel_medio = new javax.swing.JRadioButton();
        sel_dificil = new javax.swing.JRadioButton();
        panel_texto = new javax.swing.JScrollPane();
        cajaTexto = new javax.swing.JTextArea();
        panelFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1070));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));
        getContentPane().add(jLayeredPane1);

        panelContenido.setOpaque(false);

        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6_cuerpoOrco.png"))); // NOI18N

        botonOrco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5_cara_orco.png"))); // NOI18N
        botonOrco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonOrcoMouseEntered(evt);
            }
        });
        botonOrco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrcoActionPerformed(evt);
            }
        });

        botonelfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7_cara_elfo.png"))); // NOI18N
        botonelfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonelfoMouseEntered(evt);
            }
        });
        botonelfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonelfoActionPerformed(evt);
            }
        });

        botonespectro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9_cara_espectro.png"))); // NOI18N
        botonespectro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonespectroMouseEntered(evt);
            }
        });
        botonespectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonespectroActionPerformed(evt);
            }
        });

        botonComenzar.setBackground(new java.awt.Color(255, 204, 0));
        botonComenzar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botonComenzar.setText("Comenzar");
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });

        textoDificultad.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        textoDificultad.setForeground(new java.awt.Color(255, 255, 255));
        textoDificultad.setText("Dificultad");

        sel_facil.setBackground(new java.awt.Color(204, 255, 204));
        Difucultad.add(sel_facil);
        sel_facil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sel_facil.setForeground(new java.awt.Color(255, 255, 255));
        sel_facil.setText("Fácil");
        sel_facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel_facilActionPerformed(evt);
            }
        });

        sel_medio.setBackground(new java.awt.Color(204, 255, 204));
        Difucultad.add(sel_medio);
        sel_medio.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        sel_medio.setForeground(new java.awt.Color(255, 255, 255));
        sel_medio.setText("Medio");
        sel_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel_medioActionPerformed(evt);
            }
        });

        sel_dificil.setBackground(new java.awt.Color(204, 255, 204));
        Difucultad.add(sel_dificil);
        sel_dificil.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        sel_dificil.setForeground(new java.awt.Color(255, 255, 255));
        sel_dificil.setText("Dificil");
        sel_dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel_dificilActionPerformed(evt);
            }
        });

        cajaTexto.setEditable(false);
        cajaTexto.setBackground(new java.awt.Color(255, 255, 255));
        cajaTexto.setColumns(20);
        cajaTexto.setFont(new java.awt.Font("Linux Biolinum G", 1, 22)); // NOI18N
        cajaTexto.setForeground(new java.awt.Color(102, 51, 0));
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
                .addGap(100, 100, 100)
                .addComponent(cajaImagen)
                .addGap(61, 61, 61)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonelfo)
                    .addComponent(botonOrco)
                    .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonespectro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1056, Short.MAX_VALUE)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addComponent(sel_facil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sel_medio)
                                .addGap(156, 156, 156)
                                .addComponent(sel_dificil)))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                        .addComponent(textoDificultad)
                        .addGap(289, 289, 289))))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaImagen)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonOrco)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addComponent(textoDificultad)
                                .addGap(71, 71, 71)
                                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sel_medio)
                                    .addComponent(sel_facil)
                                    .addComponent(sel_dificil))))
                        .addGap(50, 50, 50)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_texto)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addComponent(botonelfo)
                                .addGap(54, 54, 54)
                                .addComponent(botonespectro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonComenzar)))))
                .addContainerGap(678, Short.MAX_VALUE))
        );

        getContentPane().add(panelContenido);

        panelFondo.setBackground(new java.awt.Color(51, 51, 51));
        panelFondo.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2533, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1448, Short.MAX_VALUE)
        );

        getContentPane().add(panelFondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOrcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrcoActionPerformed

        // Elegimos al elfo 
        Personaje.setTipo(Tipo.ORCO);
        // Colocamos imagen al contenedor 
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(6))));

        // Colocamos texto al contenedor
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));

    }//GEN-LAST:event_botonOrcoActionPerformed

    private void botonelfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonelfoActionPerformed

        // Elegimos al elfo 
        Personaje.setTipo(Tipo.ELFO);

        // Colocamos imagen al contenedor 
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(8))));

        // Colocamos texto al contenedor
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));

    }//GEN-LAST:event_botonelfoActionPerformed

    private void botonespectroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonespectroActionPerformed

        // Elegimos al espectro 
        Personaje.setTipo(Tipo.ESPECTRO);

        // Colocamos imagen al contenedor
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(10))));

        // Colocamos texto al contenedor
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));

    }//GEN-LAST:event_botonespectroActionPerformed

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        Aldea aldea = new Aldea();
        aldea.imprimeCajaTextoAldea(1);
        aldea.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonComenzarActionPerformed

    private void sel_facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel_facilActionPerformed
        Personaje.setDificultad(Dificultad.DIFICIL);
    }//GEN-LAST:event_sel_facilActionPerformed

    private void sel_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel_medioActionPerformed
        Personaje.setDificultad(Dificultad.MEDIA);
    }//GEN-LAST:event_sel_medioActionPerformed

    private void sel_dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel_dificilActionPerformed
        Personaje.setDificultad(Dificultad.FACIL);
    }//GEN-LAST:event_sel_dificilActionPerformed

    private void botonOrcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOrcoMouseEntered
        // Elegimos al elfo 
        Personaje.setTipo(Tipo.ORCO);

        // Colocamos imagen al contenedor 
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(8))));

        // Colocamos texto al contenedor
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));

    }//GEN-LAST:event_botonOrcoMouseEntered

    private void botonelfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonelfoMouseEntered

        // Elegimos al elfo 
        Personaje.setTipo(Tipo.ELFO);

        // Colocamos imagen al contenedor 
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(8))));

        // Colocamos texto al contenedor
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));

    }//GEN-LAST:event_botonelfoMouseEntered

    private void botonespectroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonespectroMouseEntered

        // Elegimos al espectro 
        Personaje.setTipo(Tipo.ESPECTRO);

        // Colocamos imagen al contenedor
        cajaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(10))));

        // Colocamos texto al contenedor
        Personaje p = aldea.getAcc().defineHeroe(Personaje.getTipo());
        cajaTexto.setText(aldea.getTim().caracteristicasHeroe(p, aldea.getAcc()));
    }//GEN-LAST:event_botonespectroMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Difucultad;
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonOrco;
    private javax.swing.JButton botonelfo;
    private javax.swing.JButton botonespectro;
    private javax.swing.JLabel cajaImagen;
    private javax.swing.JTextArea cajaTexto;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JScrollPane panel_texto;
    private javax.swing.JRadioButton sel_dificil;
    private javax.swing.JRadioButton sel_facil;
    private javax.swing.JRadioButton sel_medio;
    private javax.swing.JLabel textoDificultad;
    // End of variables declaration//GEN-END:variables

}
