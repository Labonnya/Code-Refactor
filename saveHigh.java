public class saveHigh implements saving{
    protected String tonerSavingLevel;
    protected String colorIntensity;
    @Override
    public void tonerSaving() {

        if(tonerSavingLevel == "high"){
            colorIntensity="highly reduced";
        }
    }
}
