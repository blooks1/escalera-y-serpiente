/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;

import modelo.*;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import controlador.controlador;

import javax.swing.JOptionPane;


/**
 *
 * @author juanpbaucl514
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/serpiente.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 510, 510));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido/a, Configura aspectos generales del juego ");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 570, 50));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        jLabel3.setText("Juego Serpientes y escaleras :D");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Background.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Jugadores");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 120, 30));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Roboto Light", 1, 30)); // NOI18N
        jButton3.setText("Empieza a jugar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Background.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        // Creando el jugador
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                agregarJugador();
                break;
            case 1:
                agregarJugador();
                agregarJugador();// Creando el jugador
                break;
            case 2:
                agregarJugador();
                agregarJugador();
                agregarJugador();
                break;
            case 3:
                agregarJugador();
                agregarJugador();// Creando el jugador
                agregarJugador();
                agregarJugador();
                break;
            default:
                break;
        }

         // Iniciando el Tablero de juego
        controlador juego = new controlador();
        juego.iniciarJuego();

        // Cerrando la ventana de configuracion
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed



    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Opciones de jugadores

    }

    public void agregarJugador() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        TableroModelo tablero = new TableroModelo();
        Jugadores jugador = new Jugadores(nombre);
        tablero.colocarCaracter(jugador,1,1);
        jugador.mostrarInfoJugadorLabel();  
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
