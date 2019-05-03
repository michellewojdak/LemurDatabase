package lemurdatabase;
/**
 *
 * @author michellewojdak
 */
public class JungleLemur extends Lemur {
    private String itsFood;
    private String itsColour;
    private String itsPackSize;

    public JungleLemur() {
        //Call the default constructor from Lemur
        super();
        itsFood = "Mice, Snails, and Insects";
        itsColour= "Black or Blue";
        itsPackSize= "Small Groups";
    }
    /**
     * 
     * @return 
     */
    public String toString() {
        String output = "";
        output += super.toString();
        output += "Food: " + itsFood + "\n";
        output += "Colour: " + itsColour + "\n";
        output += "Pack Size: " + itsPackSize + "\n";
        return output;
    }
}
  
