public class saveLow implements saving{
    protected String tonerSavingLevel;
    protected String colorIntensity;
    @Override
    public void tonerSaving() {
        if(tonerSavingLevel=="low"){
            colorIntensity=" lowly reduced";
        }
    }
}
