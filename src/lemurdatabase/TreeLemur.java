/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemurdatabase;

/**
 *
 * @author michellewojdak
 */
public class TreeLemur extends Lemur {
    private String itsFood;
    private String itsColour;
    private String itsPackSize;

    public TreeLemur() {
        //Call the default constructor from Lemur
        super();
        itsFood = "Fruit";
        itsColour= "Red";
        itsPackSize= "Large Groups";
    }
    
     public String toString() {
        String output = "";
        output += super.toString();
        output += "Food: " + itsFood + "\n";
        output += "Colour: " + itsColour + "\n";
        output += "Pack Size: " + itsPackSize + "\n";
        return output;
    }
}
