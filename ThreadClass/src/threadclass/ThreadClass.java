/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclass;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chayan_pc
 */
public class ThreadClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ErrorDetect e=new ErrorDetect(50,100);
        ErrorDetect e1=new ErrorDetect(150, 50);
        try {
            e.lencal();
             e.print();
        } catch (NegetiveIndecat ex) {
            System.out.println(ex.NegetiveValue());
        }
        try {
            e1.lencal();
             e1.print();
        } catch (NegetiveIndecat ex) {
            System.out.println(ex.NegetiveValue());
           
           
        }
    }
}
