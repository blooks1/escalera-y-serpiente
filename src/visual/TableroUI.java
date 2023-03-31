package visual;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import modelo.Jugadores;
import modelo.TableroModelo;

public class TableroUI extends JFrame {

    private JPanel panel;
    private JTable tabla;
    private Jugadores ficha;
    private JScrollPane scrollPane;
    private JButton botonLanzarDados;

    public TableroUI() {

        super("Tablero de serpientes y escaleras"); // Titulo de la ventana
        
        panel = new JPanel(); // Creamos un panel
        panel.setLayout(new BorderLayout()); // Establecemos el layout del panel
        add(panel); // Añadimos el panel a la ventana


        TableroModelo modeloTabla = new TableroModelo(); // Creamos el modelo de la tabla
        tabla = new JTable(modeloTabla); // Creamos la tabla
        tabla.setDefaultRenderer(Object.class, new TableroRenderer()); // Establecemos el renderizador de la tabla
        tabla.setRowHeight(80); // Establecemos el alto de las filas
        
        tabla.setShowGrid(false); // Ocultamos las lineas de la tabla
        
        scrollPane = new JScrollPane(tabla); // Creamos el scrollpane
        tabla.setTableHeader(null); // Ocultamos la cabecera de la tabla
        panel.add(scrollPane, BorderLayout.CENTER); // Añadimos el scrollpane al panel

        botonLanzarDados = new JButton("Lanzar dados"); // Creamos el boton de lanzar dados
        panel.add(botonLanzarDados, BorderLayout.SOUTH); // Añadimos el boton al panel

        ficha = new Jugadores(); // Creamos la ficha
        modeloTabla.colocarCaracter(ficha, 1, 1);
        tabla.setValueAt(ficha, 0, 0); // Establecemos la ficha en la casilla inicial
        

        setSize(800, 800); // Establecemos el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecemos la operación por defecto al cerrar la ventana
        setLocationRelativeTo(null); // Centramos la ventana en la pantalla
        setVisible(true);// Hacemos visible la ventana

    }

    // Crear panel adicional para mostrar información del jugador
    JFrame frame = new JFrame(" Ventana principal");
    JPanel infoPanel = new JPanel(new BorderLayout());
    JLabel infoLabel = new JLabel(" Información del jugador");

    public void mostrarInfoJugador() {
        frame.add(infoPanel);
        infoPanel.add(infoLabel, BorderLayout.SOUTH);
        frame.setSize(400, 400);
        frame.setVisible(true);
        //mostrando informacion del jugador en el panel
        infoLabel.setText("Informacion del jugador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // colocar la ficha en la posicion inicial
    public void colocarFicha() {
        ficha.colocarFicha(0, 0);
        ficha.mostrarFicha();
    }
        
    // colocar jugador en la casilla inicial
    public void colocarJugador(Jugadores jugador) {
        tabla.setValueAt(jugador, 0, 0);
    }

    // Actualizar el turno del jugador
    public void setTurno(int turno) {
        // Actualizar el valor de la celda correspondiente
        tabla.setValueAt(turno, 0, 1);
    }

}
