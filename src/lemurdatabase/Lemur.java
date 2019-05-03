package lemurdatabase;
/**
 * 
 * @author michellewojdak
 */
public class Lemur extends Mammal{
    private String itsLocation;
    private String itsClassification;
    private String itsCoat;

    public Lemur() {
        //Call the default constructor from Mammal
        super();
        itsLocation = "Madagascar";
        itsClassification= "Prosimian";
        itsCoat= "Fur";
    }
    /**
     * 
     * @return 
     */
    public String toString() {
        String output = "";
        output += super.toString();
        output += "Food: " + itsLocation + "\n";
        output += "Colour: " + itsCoat + "\n";
        output += "Pack Size: " + itsClassification + "\n";
        return output;
    }
}
