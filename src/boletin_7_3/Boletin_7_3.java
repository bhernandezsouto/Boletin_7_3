/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_3;
import javax.swing.JOptionPane;
public class Boletin_7_3 {
    public static void main(String[] args) {
        Signo obj = new Signo();
        String respuesta = JOptionPane.showInputDialog("Introduce un numero");
        int a = Integer.parseInt(respuesta);
        obj.setNumero(a);
        obj.sign();
    }
    
}
