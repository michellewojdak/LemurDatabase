package lemurdatabase;

/**
 *
 * @author michellewojdak
 */
public class DesertLemur extends Lemur {
    private String itsFood;
    private String itsColour;
    private double itsDeathRate;

    public DesertLemur() {
        //Call the default constructor from Lemur
        super();
        itsFood = "Cacti";
        itsColour= "White";
        itsDeathRate= 0.66;
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
        output += "Baby Death Rate: " + itsDeathRate + "\n";
        return output;
    }
}
  
