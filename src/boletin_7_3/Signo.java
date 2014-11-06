/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_3;
import javax.swing.JOptionPane;
public class Signo {
    private int numero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void sign (){
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "+");
        }
        else{
            if (numero == 0){
                JOptionPane.showMessageDialog(null, "0");
            }
            else
                JOptionPane.showMessageDialog(null, "-");
        }
    }
}
