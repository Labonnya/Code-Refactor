public class saveToner extends printMode {

    protected String tonerSavingLevel;
    protected String colorIntensity;
    @Override
    public void savingBoosting() {
       if(tonerSavingLevel == "high"){
           colorIntensity="highly reduced";
       }
       else if(tonerSavingLevel=="medium"){
           colorIntensity=" medium reduced";
       }
       else if(tonerSavingLevel=="low"){
           colorIntensity=" lowly reduced";
       }
       else{
           System.out.println("Color Intensity can't be reduced.");
       }
    }



}
