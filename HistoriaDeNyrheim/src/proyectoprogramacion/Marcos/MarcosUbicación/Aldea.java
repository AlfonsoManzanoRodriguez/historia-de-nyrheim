package proyectoprogramacion.Marcos.MarcosUbicación;

import javax.swing.JOptionPane;
import proyectoprogramacion.Acciones;
import proyectoprogramacion.Marcos.MarcosAcceso.EligePersonaje;
import proyectoprogramacion.Marcos.MarcosDesafios.CuatroOpciones;
import proyectoprogramacion.Marcos.MarcosDesafios.DosOpciones;
import proyectoprogramacion.Marcos.MarcosDesafios.TresOpciones;
import proyectoprogramacion.Personajes.Orco;
import proyectoprogramacion.Personajes.Personaje;
import proyectoprogramacion.Personajes.Villano;
import proyectoprogramacion.TextoEImagenes;

public class Aldea extends javax.swing.JFrame {

    public Aldea() {
        initComponents();
    }

    private static boolean rDragon = false, rOnis = false, rSirena = false; //Define si el enemigo ha sido derrotado
    private static boolean trofeoDragon = false, trofeoOnis = false, trofeoSirena = false; // Define la ruta en la que estamos
    private static int dia = 0; // Define la jornada en la que estamos
    private static boolean salida = false; //determina la vuelta a la aldea
    private static int acierto, destinoAcierto, destinoFallo; // Determina respuesta correcta, destino si acertamos y si fallamos, respectivamente

    // Objetos
    Acciones acc = new Acciones();
    TextoEImagenes tim = new TextoEImagenes();
    DosOpciones eleccion2 = new DosOpciones(this);
    TresOpciones eleccion3 = new TresOpciones(this);
    CuatroOpciones eleccion4 = new CuatroOpciones(this);
    YouWin yw = new YouWin();
    GameOver gov = new GameOver();

    // Getters
    public Acciones getAcc() {
        return acc;
    }

    public TextoEImagenes getTim() {
        return tim;
    }

    public static boolean isTrofeoDragon() {
        return trofeoDragon;
    }

    public static boolean isTrofeoOnis() {
        return trofeoOnis;
    }

    public static boolean isTrofeoSirena() {
        return trofeoSirena;
    }

    public static int getDia() {
        return dia;
    }

    public static boolean isSalida() {
        return salida;
    }

    public DosOpciones getEleccion2() {
        return eleccion2;
    }

    public TresOpciones getEleccion3() {
        return eleccion3;
    }

    public CuatroOpciones getEleccion4() {
        return eleccion4;
    }

    public static int getAcierto() {
        return acierto;
    }

    public static int getDestinoAcierto() {
        return destinoAcierto;
    }

    public static int getDestinoFallo() {
        return destinoFallo;
    }

    public YouWin getYw() {
        return yw;
    }

    public GameOver getGov() {
        return gov;
    }

    // Setters
    public static void setAcierto(int acierto) {
        Aldea.acierto = acierto;
    }

    public static void setDestinoAcierto(int destinoAcierto) {
        Aldea.destinoAcierto = destinoAcierto;
    }

    // Setters
    public static void setDia(int dia) {
        Aldea.dia = dia;
    }

    public static void setSalida(boolean salida) {
        Aldea.salida = salida;
    }

    public static void setDestinoFallo(int destinoFallo) {
        Aldea.destinoFallo = destinoFallo;
    }

    public static void setTrofeoDragon(boolean trofeoDragon) {
        Aldea.trofeoDragon = trofeoDragon;
    }

    public static void setTrofeoOnis(boolean trofeoOnis) {
        Aldea.trofeoOnis = trofeoOnis;
    }

    public static void setTrofeoSirena(boolean trofeoSirena) {
        Aldea.trofeoSirena = trofeoSirena;
    }

    // Los siguientes tres métodos definen la secuencia de eventos que ocurren en la partida para cada ruta
    public void configurayLanza2Opciones() {
        eleccion2.imprimeVidaYDinero();
        eleccion2.setVisible(true);
        this.dispose();
    }

    public void configurayLanza3Opciones() {
        eleccion3.imprimeVidaYDinero();
        eleccion3.setVisible(true);
        this.dispose();
    }

    public void configurayLanza4Opciones() { // Lanza el marco de desafío y le imprime la vida y el dinero
        eleccion4.imprimeVidaYDinero();
        eleccion4.setVisible(true);
        this.dispose();
    }

    public void compruebaVictoria() { // Comprueba si hemos ganado
        if (acc.getDragon().getVidaEnemigo() <= 0) {
            trofeoDragon = true;
        }
        if (acc.getOnis().getVidaEnemigo() <= 0) {
            trofeoOnis = true;
        }
        if (acc.getSirena().getVidaEnemigo() <= 0) {
            trofeoSirena = true;
        }
    }

    // El siguiente método es muy importante. Define el camino que seguirá el juego
    public void continuaRuta() {
        dia++;
        imprimeCajaTextoAldea(1);
        compruebaVictoria(); // Comprueba si hemos ganado

        // Ruta del dragon
        if (rDragon == false) {

        }
        if (rDragon) {
            if (trofeoDragon) {
                dia=5;
                 JOptionPane.showMessageDialog(null, "Ya has matado al dragón, busca otro enemigo");
            }
            if (dia == 1) {
                eleccion4.cajaTexto4Opciones(5); // Imprime en la caja de texto del marco desafío el texto de desafío correspondiente
                // Impresión de respuestas
                eleccion4.lanzaRespuestaA("Un pequeño demonio");
                eleccion4.lanzaRespuestaB("Un cepo");
                eleccion4.lanzaRespuestaC("Un inspector de hacienda");
                eleccion4.lanzaRespuestaD("Déjate te bromas");
                eleccion4.lanzaImagen(12);
                eleccion4.modificarPropiedades(4, 6, 1);
                configurayLanza4Opciones(); // Lanza el marco de desafío con y le imprime la vida y el dinero
            } else if (dia == 2) {
                eleccion4.imprimeVidaYDinero();
                eleccion4.lanzaRespuestaA("Piedra");
                eleccion4.lanzaRespuestaB("Papel");
                eleccion4.lanzaRespuestaC("Tijeras");
                eleccion4.lanzaRespuestaD("Ignorar");
                if (Personaje.getDinero() >= 1000) {
                    eleccion4.cajaTexto4Opciones(6);
                    eleccion4.modificarPropiedades(4, 0, 8);
                    configurayLanza4Opciones();
                } else {
                    eleccion4.cajaTexto4Opciones2("Hola viajero. ¿Quieres apostar?. ¡mmmm!. Bueno, mejor no, tienes pinta de tieso");
                    eleccion4.setVisible(true);
                    this.dispose();
                }
                eleccion4.lanzaImagen(13);
            } else if (dia == 3) {
                eleccion4.cajaTexto4Opciones(7);
                eleccion4.lanzaRespuestaA("Invierno");
                eleccion4.lanzaRespuestaB("Verano");
                eleccion4.lanzaRespuestaC("Primavera");
                eleccion4.lanzaRespuestaD("Otoño");
                eleccion4.modificarPropiedades(1, 5, 0);
                eleccion4.lanzaImagen(14);
                configurayLanza4Opciones();
            } else if (dia == 4) {
                eleccion4.cajaTexto4Opciones(8);
                eleccion4.lanzaRespuestaA("Aurícula derecha");
                eleccion4.lanzaRespuestaB("Aurícula Izquierda");
                eleccion4.lanzaRespuestaC("Ventrículo derecho");
                eleccion4.lanzaRespuestaD("Ventrículo izquierdo");
                eleccion4.lanzaImagen(15);
                eleccion4.modificarPropiedades(2, 2, 1);
                configurayLanza4Opciones();
                cajaTexto.setText("Cabezon dragon:" + acc.getDragon().getVidaEnemigo());
                dia = 0;
                salida = true;
            }else if(dia==5){
                dia=0;
            }
        } else if (rOnis) {
            if (trofeoOnis) {
                dia=5;
                 JOptionPane.showMessageDialog(null, "Ya has matado al rey onis, busca otro enemigo");
            }
            // Ruta onis
            if (dia == 1) {
                eleccion2.cajaTexto2Opciones(9);
                eleccion2.lanzaRespuestaA("Salir corriendo");
                eleccion2.lanzaRespuestaB("¡Oh que amable!. Espero no molestar. Muchas gracias por su hospitalidad. * Entras");
                eleccion2.lanzaImagen(19);
                eleccion2.modificarPropiedades(2, 5, 0);
                configurayLanza2Opciones();
            } else if (dia == 2) {
                eleccion4.cajaTexto4Opciones(10);
                eleccion4.lanzaRespuestaA("Usain Bolt");
                eleccion4.lanzaRespuestaB("Guepardo");
                eleccion4.lanzaRespuestaC("Halcón peregrino");
                eleccion4.lanzaRespuestaD("Marlín azul");
                eleccion4.lanzaImagen(20);
                eleccion4.modificarPropiedades(3, 0, 1);
                configurayLanza4Opciones();
            } else if (dia == 3) {
                eleccion2.cajaTexto2Opciones(11);
                eleccion2.lanzaRespuestaA("Retar al Kappa a un combate de sumo");
                eleccion2.lanzaRespuestaB("Huir corriendo");
                if (Personaje.getDinero() >= 2000) {
                    eleccion2.cajaTexto2Opciones2("Hola viajero. ¿Un combate de sumo?. ¡mmmm!. Si tienes dinero incluso podemos apostar, si no, me bastará la satisfacción de ganrte");
                    eleccion2.modificarPropiedades(4, 0, 9);
                    configurayLanza4Opciones();
                } else {
                    eleccion2.setVisible(true);
                    this.dispose();
                }
                eleccion2.lanzaImagen(21);
                configurayLanza2Opciones();
            } else if (dia == 4) {
                eleccion4.cajaTexto4Opciones(12);
                eleccion4.lanzaRespuestaA("Un misil de largo alcance");
                eleccion4.lanzaRespuestaB("El vehículo utilizado para ubicar un artefacto lanzamisiles");
                eleccion4.lanzaRespuestaC("Un artefacto lanzamisiles");
                eleccion4.lanzaRespuestaD("El conjunto vehículo, artefacto lanzamisiles, y misiles de largo alcance");
                eleccion4.lanzaImagen(23);
                eleccion4.modificarPropiedades(3, 3, 1);
                configurayLanza4Opciones();
                cajaTexto.setText("Cabezon onis:" + acc.getOnis().getVidaEnemigo());
                dia = 0;
                salida = true;
            }else if(dia==5){
                dia=0;
            }
        } else if (rSirena) {
            if (trofeoSirena) {
                dia=5;
                 JOptionPane.showMessageDialog(null, "Ya has matado a la sirena zombie, busca otro enemigo");
            }
            // Ruta Sirena
            if (dia == 1) {
                eleccion2.cajaTexto2Opciones(13);
                eleccion2.lanzaRespuestaA("Pagar con 1000 monedas");
                eleccion2.lanzaRespuestaB("Pagar con vida");
                eleccion2.lanzaImagen(25);
                eleccion2.modificarPropiedades(1, 7, 1);
                configurayLanza2Opciones();
            } else if (dia == 2) {
                eleccion2.cajaTexto2Opciones(14);
                eleccion2.lanzaRespuestaA("Te lanzas al agua para que Hipocampo te recoja");
                eleccion2.lanzaRespuestaB("Contestas de mala manera: \"Dejame, no me fío de escamosos\"");
                eleccion2.lanzaImagen(27);
                eleccion2.modificarPropiedades(1, 0, 1);
                configurayLanza2Opciones();
            } else if (dia == 3) {
                eleccion3.cajaTexto3Opciones(15);
                eleccion3.lanzaRespuestaA("-3.6");
                eleccion3.lanzaRespuestaB("3.6");
                eleccion3.lanzaRespuestaC("6.3");
                eleccion3.lanzaImagen(28);
                eleccion3.modificarPropiedades(2, 0, 1);
                configurayLanza3Opciones();
            } else if (dia == 4) {
                eleccion4.cajaTexto4Opciones(16);
                eleccion4.lanzaRespuestaA("Cubozoo");
                eleccion4.lanzaRespuestaB("Galera");
                eleccion4.lanzaRespuestaC("Pejelagarto");
                eleccion4.lanzaRespuestaD("Ofiura");
                eleccion4.lanzaImagen(29);
                eleccion4.modificarPropiedades(1, 4, 1);
                configurayLanza4Opciones();
                cajaTexto.setText("Cabezon sirena:" + acc.getSirena().getVidaEnemigo());
                dia = 0;
                salida = true;
            }else if(dia==5){
                dia=0;
            }
        }
    }

    // Imprimen las cabezas cuando derrotas a un enemigo
    public void ImprimeCabezaDragon() {
        cabezaDragon.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(33))));
    }

    public void ImprimecabezaOnis() {
        cabezaOnis.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(34))));
    }

    public void ImprimeCabezaSirena() {
        cabezaSirena.setIcon(new javax.swing.ImageIcon(getClass().getResource(TextoEImagenes.cargaImagen(35))));
    }

    // Imprime la la caja de texto de la aldea
    public void imprimeCajaTextoAldea(int opcion) {

        String texto = null;
        switch (opcion) {
            case 1:
                Personaje p = acc.defineHeroe(Personaje.getTipo());
                texto = tim.caracteristicasAldea(p, acc);
                break;
            case 2:
                texto = "El escudo de forja élfica mejora tu defensa, multiplicando por dos su efectividad";
                break;
            case 3:
                texto = "Las flechas envenenadas mejoran tu ataque, multiplicando por dos su efectividad";
                break;
            case 4:
                texto = "El amuleto encantado mejora tu suerte, multiplicando por dos su efectividad";
                break;
            case 5:
                texto = "¡Amigo!. Soy un mercader honrado. Ya comopraste ese producto. Además no tengo más existencias. No lo habrás perdido";
                break;
            case 6:
                texto = "¿Pero que te crees?. ¡Que esto es una ONG o que nos regalan los producto!. ¿Como te atreves a intentar comprar sin dinero? ";
                break;
            default:
        }
        cajaTexto.setText(texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        contenido = new javax.swing.JPanel();
        mapa = new javax.swing.JLabel();
        cabezaDragon = new javax.swing.JLabel();
        cabezaOnis = new javax.swing.JLabel();
        cabezaSirena = new javax.swing.JLabel();
        ruta_dragon = new javax.swing.JButton();
        ruta_Onis = new javax.swing.JButton();
        ruta_sirena = new javax.swing.JButton();
        panel_texto = new javax.swing.JScrollPane();
        cajaTexto = new javax.swing.JTextArea();
        selAmuleto = new javax.swing.JButton();
        selFlechas = new javax.swing.JButton();
        selEscudo = new javax.swing.JButton();
        fondo = new javax.swing.JPanel();
        panelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1070));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        contenido.setOpaque(false);

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/11_mapa.png"))); // NOI18N
        mapa.setOpaque(true);

        ruta_dragon.setBackground(new java.awt.Color(255, 204, 0));
        ruta_dragon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ruta_dragon.setText("Hacia dragón");
        ruta_dragon.setOpaque(true);
        ruta_dragon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta_dragonActionPerformed(evt);
            }
        });

        ruta_Onis.setBackground(new java.awt.Color(255, 204, 0));
        ruta_Onis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ruta_Onis.setText("Hacia Onis");
        ruta_Onis.setOpaque(true);
        ruta_Onis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta_OnisActionPerformed(evt);
            }
        });

        ruta_sirena.setBackground(new java.awt.Color(255, 204, 0));
        ruta_sirena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ruta_sirena.setText("Hacia sirena");
        ruta_sirena.setOpaque(true);
        ruta_sirena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta_sirenaActionPerformed(evt);
            }
        });

        cajaTexto.setEditable(false);
        cajaTexto.setBackground(new java.awt.Color(255, 255, 255));
        cajaTexto.setColumns(20);
        cajaTexto.setFont(new java.awt.Font("Linux Biolinum G", 0, 28)); // NOI18N
        cajaTexto.setLineWrap(true);
        cajaTexto.setRows(5);
        cajaTexto.setWrapStyleWord(true);
        cajaTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel_texto.setViewportView(cajaTexto);

        selAmuleto.setBackground(new java.awt.Color(255, 204, 204));
        selAmuleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selAmuleto.setText("Amuleto");
        selAmuleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selAmuletoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selAmuletoMouseExited(evt);
            }
        });
        selAmuleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selAmuletoActionPerformed(evt);
            }
        });

        selFlechas.setBackground(new java.awt.Color(255, 204, 204));
        selFlechas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selFlechas.setText("Flechas envenenadas");
        selFlechas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selFlechasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selFlechasMouseExited(evt);
            }
        });
        selFlechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selFlechasActionPerformed(evt);
            }
        });

        selEscudo.setBackground(new java.awt.Color(255, 204, 204));
        selEscudo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selEscudo.setText("Escudo");
        selEscudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selEscudoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selEscudoMouseExited(evt);
            }
        });
        selEscudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selEscudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ruta_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ruta_Onis, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(mapa))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(cabezaDragon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(cabezaOnis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ruta_sirena, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(cabezaSirena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selAmuleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selFlechas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(panel_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1640, 1640, 1640))
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_texto)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addComponent(selEscudo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selFlechas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(selAmuleto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cabezaSirena, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cabezaOnis, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cabezaDragon, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruta_sirena, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruta_Onis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruta_dragon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(84, 84, 84))
        );

        getContentPane().add(contenido);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1_fondoJuego2.png"))); // NOI18N

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3112, Short.MAX_VALUE)
            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelFondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelFondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(fondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ruta_dragonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta_dragonActionPerformed
        rDragon = true;
        rOnis = false;
        rSirena = false;
        continuaRuta();
    }//GEN-LAST:event_ruta_dragonActionPerformed

    private void ruta_OnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta_OnisActionPerformed
        rDragon = false;
        rOnis = true;
        rSirena = false;
        continuaRuta();
    }//GEN-LAST:event_ruta_OnisActionPerformed

    private void ruta_sirenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta_sirenaActionPerformed
        rDragon = false;
        rOnis = false;
        rSirena = true;
        continuaRuta();
    }//GEN-LAST:event_ruta_sirenaActionPerformed

    private void selAmuletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selAmuletoActionPerformed
        if (Personaje.isMejoradoAmuleto()) {
            imprimeCajaTextoAldea(5);
        } else {
            if (Personaje.getDinero() >= 1000) {
                acc.pierdeDinero(1000);
                Personaje.setMejoradoAmuleto(true);
                System.out.println("amu");
            } else {
                imprimeCajaTextoAldea(6);
            }
        }
    }//GEN-LAST:event_selAmuletoActionPerformed

    private void selFlechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selFlechasActionPerformed

        if (Personaje.isMejoradoFlechas()) {
            imprimeCajaTextoAldea(5);
        } else {
            if (Personaje.getDinero() >= 1000) {
                acc.pierdeDinero(1000);
                Personaje.setMejoradoFlechas(true);
            } else {
                imprimeCajaTextoAldea(6);
            }
        }

    }//GEN-LAST:event_selFlechasActionPerformed

    private void selEscudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selEscudoActionPerformed
        if (Personaje.isMejoradoEscudo()) {
            imprimeCajaTextoAldea(5);
        } else {
            if (Personaje.getDinero() >= 1000) {
                acc.pierdeDinero(1000);
                Personaje.setMejoradoEscudo(true);
                System.out.println("esc");
            } else {
                imprimeCajaTextoAldea(6);
            }
        }
    }//GEN-LAST:event_selEscudoActionPerformed

    private void selEscudoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selEscudoMouseEntered
        cajaTexto.setText("El escudo mejora tu defensa un 33 %");
    }//GEN-LAST:event_selEscudoMouseEntered

    private void selEscudoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selEscudoMouseExited
        Personaje p = acc.defineHeroe(Personaje.getTipo());

        cajaTexto.setText(tim.caracteristicasAldea(p, acc));
    }//GEN-LAST:event_selEscudoMouseExited

    private void selFlechasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selFlechasMouseEntered
        cajaTexto.setText("Las flechas envenenadas mejoran tu ataque un 33 %");
    }//GEN-LAST:event_selFlechasMouseEntered

    private void selFlechasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selFlechasMouseExited
        Personaje p = acc.defineHeroe(Personaje.getTipo());

        cajaTexto.setText(tim.caracteristicasAldea(p, acc));
    }//GEN-LAST:event_selFlechasMouseExited

    private void selAmuletoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selAmuletoMouseEntered
        cajaTexto.setText("El amuleto mejoran tu suerte un 33 %");
    }//GEN-LAST:event_selAmuletoMouseEntered

    private void selAmuletoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selAmuletoMouseExited
        Personaje p = acc.defineHeroe(Personaje.getTipo());

        cajaTexto.setText(tim.caracteristicasAldea(p, acc));
    }//GEN-LAST:event_selAmuletoMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cabezaDragon;
    private javax.swing.JLabel cabezaOnis;
    private javax.swing.JLabel cabezaSirena;
    private javax.swing.JTextArea cajaTexto;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel mapa;
    private javax.swing.JLabel panelFondo;
    private javax.swing.JScrollPane panel_texto;
    private javax.swing.JButton ruta_Onis;
    private javax.swing.JButton ruta_dragon;
    private javax.swing.JButton ruta_sirena;
    private javax.swing.JButton selAmuleto;
    private javax.swing.JButton selEscudo;
    private javax.swing.JButton selFlechas;
    // End of variables declaration//GEN-END:variables
}
