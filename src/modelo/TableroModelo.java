package modelo;

import java.awt.Color;

import javax.swing.table.AbstractTableModel;

public class TableroModelo extends AbstractTableModel {

    private int filas = 8;
    private int columnas = 8;
    private int[][] valores = new int[filas][columnas];
    private char[][] casillas = new char[filas][columnas];

    public TableroModelo() {
        // Inicializamos los valores del tablero
        setHacerTablero(valores);
    }

    public void setHacerTablero (int[][] valores) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                valores[i][j] = i * columnas + j + 1;
            }
        }
    }

    public int[][] getMostrarTablero() {
        return valores;
    }

    public void setMostrarTablero(int[][] valores) {
        this.valores = valores;
    }

    public void colocarCaracter(Jugadores jugador, int x, int y) {
        casillas[x][y] = jugador.getFicha();
        jugador.setFicha('X',Color.RED);
        fireTableCellUpdated(x, y);
        //mostrando la ficha en el tablero
        jugador.mostrarFicha();
        // mostrando ficha en un lablel dentro del tablero
        fireTableCellUpdated(x, y);
    }

    public void mostrarEscalera (int x, int y) {
        casillas[x][y] = 'E';
        fireTableCellUpdated(x, y);
    }

    public void mostrarSerpiente (int x, int y) {
        casillas[x][y] = 'S';
        fireTableCellUpdated(x, y);
    }

    public void subirEscalera(Jugadores jugador, int x, int y) {
        casillas[x][y] = jugador.getFicha();
        fireTableCellUpdated(x, y);
        jugador.setFicha('X',Color.GREEN);
    }

    public void bajarSerpiente(Jugadores jugador, int x, int y) {
        casillas[x][y] = jugador.getFicha();
        fireTableCellUpdated(x, y);
        jugador.setFicha('O',Color.RED);
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public char [][] getCasillas( ) {
        return casillas;
    }

    public void setCasillas (char [][] casillas) {
        this.casillas = casillas;
    }

    public void getFilas () {
        System.out.println("Filas: " + filas);
    }

    public void getColumnas() {
        System.out.println("Filas: " + filas);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }



    @Override
    public int getRowCount() {
        return filas;
    }

    @Override
    public int getColumnCount() {
        return columnas;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return valores[rowIndex][columnIndex];
    }
        
}
