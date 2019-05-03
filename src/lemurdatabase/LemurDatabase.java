/*
 * Michelle Wojdak
 * To display lemurs types with characteristics
 * 02/05/2019
 */
package lemurdatabase;

import javax.swing.*;
/**
 * 
 * @author michellewojdak
 */
public class LemurDatabase {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       String a, b;
       a = JOptionPane.showInputDialog("How many Lemurs do you want to add to the list?");
       int numLemurs = Integer.parseInt(a);
       
       Lemur lemurs[] = new Lemur[numLemurs];
       for(int i= 0; i< numLemurs; i++) {
       b = JOptionPane.showInputDialog("Please enter the type of Lemur to add: \n"
               + "1- Tree Lemur \n"
               + "2- Desert Lemur \n"
               + "3- Jungle Lemur");
       int breedLemur = Integer.parseInt(b);      
 
       if (breedLemur == 1) {
           lemurs [i] = new TreeLemur();
           System.out.println("Tree Lemur: \n");       
           
       } else if(breedLemur == 2) {
           lemurs [i] = new DesertLemur(); 
           System.out.println("Desert Lemur: \n");
        
       } else if(breedLemur == 3) { 
           lemurs[i] = new JungleLemur();
           System.out.println("Jungle Lemur: \n");
           
       } else{
           JOptionPane.showMessageDialog(null, "INPUT ERROR");
       }      
        System.out.print(lemurs[i]);
        System.out.println("------------------------------------\n"
                + " ");
       }
    }
}
   
      
   

