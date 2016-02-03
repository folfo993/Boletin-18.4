/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author FOLFO
 */
public class Metodos {
    
    private int dni;

    public Metodos() {

    }

    public Metodos(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        dni = Integer.parseInt(JOptionPane.showInputDialog("Introducir Nº D.N.I."));
        int letranum = dni % 23;
        return letranum;
    }

    public char getLetra(int letra) {
        char dni[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        JOptionPane.showMessageDialog(null, "Letra: " + dni[(int) letra]);
        return dni[(int) letra];
    }
}
