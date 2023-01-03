public class saveMedium implements saving{
    protected String tonerSavingLevel;
    protected String colorIntensity;
    @Override
    public void tonerSaving() {
         if(tonerSavingLevel=="medium"){
            colorIntensity=" medium reduced";
        }
    }
}
