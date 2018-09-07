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
        double N,N1,N2;
        String NumberInt = JOptionPane.showInputDialog("Please enter a mumber");
        N=Double.valueOf(NumberInt);
        N1=Math.sqrt(N*N);
        N2=(N1-N);
        System.out.print("The square root of the square=" + N1);
        System.out.print("\n");
        System.out.print("The round off error=" + N2);
    }
    
}
