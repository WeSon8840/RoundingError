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
        int i;
        double N,N1,N2;
        String NumberInt = JOptionPane.showInputDialog("Please enter a mumber");
        i=Integer.parseInt(NumberInt);
        N1=(double)i;
        N1=Math.sqrt(N1);
        N2=Math.pow(N1,2);
        System.out.print("The square root of the square=" + N2);
        System.out.print("\n");
        System.out.print("The round off error=" + (N2-i));
    }
    
}
