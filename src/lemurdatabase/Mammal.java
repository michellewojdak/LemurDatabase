package lemurdatabase;
/**
 * 
 * @author michellewojdak
 */
public class Mammal {
    private int itsAge;
    private double itsWeight;
    private boolean itsGender;

    public Mammal() {
        itsAge = (int)(Math.random() * (19+1) +1);
        itsWeight = (Math.random() * (50+10) +10);
        itsGender = (Math.random() < 0.5);
    }
    /**
     * 
     * @return 
     */
    public int getAge() {
        return itsAge;
    }
    /**
     * 
     * @return 
     */
    public double getWeight() {
        return itsWeight;
    }
    /**
     * 
     * @return 
     */
    public boolean getGender(){
        return itsGender;
    }
   /**
    * 
    * @param newAge 
    */
    public void setAge(int newAge) {
        itsAge = newAge;
    }
    /**
     * 
     * @param newWeight 
     */
    public void setWeight(double newWeight) {
        itsWeight = newWeight;
    }
    /**
     * 
     * @param newGender 
     */
    public void setGender(boolean newGender){
        itsGender = newGender;
    }
    /**
     * 
     * @return 
     */
    public String toString() {
        String output = "Age: " + itsAge + "\n";
        output += "Weight: " + itsWeight + "\n";
        if (itsGender== true) {
            output += "Gender: Male\n";
        } else {
            output += "Gender: Female\n";
        }
        //output string is complete, return it
        return output;
    }  
}