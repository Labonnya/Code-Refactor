public class boost extends printMode{

    protected int threshold;
    protected int colourIntensity;

    @Override
    public void savingBoosting() {
      if(colourIntensity<threshold){
          colourIntensity++;
      }
      else{
          System.out.println("Color intensity can't be reduced.");
      }
    }
}
