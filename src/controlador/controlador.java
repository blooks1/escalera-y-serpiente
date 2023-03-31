package controlador;
import modelo.*;
import visual.*;

public class controlador {

    public Menu menu;
    public TableroUI tablero;
    public TableroModelo casillasNum;

    public controlador() {
        menu = new Menu();
    }

    public void iniciarJuego() {
        casillasNum = new TableroModelo();
        tablero = new TableroUI();
        tablero.setVisible(true);


        // colocando los jugadores en el tablero
        tablero.colocarJugador(new Jugadores());
        tablero.colocarFicha();
        casillasNum.colocarCaracter(new Jugadores(), 1, 1);
        casillasNum.colocarCaracter(new Jugadores(), 2, 1);


    }

    public void inicio() {

        menu.setVisible(true);
   
    }
    
}
