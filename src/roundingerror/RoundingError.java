/*
 * The purpose is to compares the square of the square root of any number.
 */

package roundingerror;
import javax.swing.*;

/**
 *
 * @author Gloria Song
 * Date : 2018/9/7
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        double N,N1,N2;
        String NumberInt = JOptionPane.showInputDialog("Please enter a mumber");
        //Above to claim varibales of different types.
        i=Integer.parseInt(NumberInt);
        N1=(double)i;
        N1=Math.sqrt(N1);
        N2=Math.pow(N1,2);
        //The calculation.
        System.out.print("The square root of the square=" + N2);
        System.out.print("\n");
        System.out.print("The round off error=" + (N2-i));
        System.out.print("\n");
    }
    
}
