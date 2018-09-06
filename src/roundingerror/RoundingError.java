/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror;
import javax.swing.*;
/**
 *
 * @author glSon8840
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String NumberIn = JOptionPane.showInputDialog("Please enter a mumber");
        double number = Double.parseDouble(NumberIn);
        double numbersq = Math.pow(number, 2);
        JOptionPane.showMessageDialog(null,"The Square");
    }
    
}
