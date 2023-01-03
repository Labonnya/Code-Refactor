public class savePage extends printMode{

    protected String numberOfPages, pageSize, orientation, colorIntensity, costPerPage;

    @Override
    public void savingBoosting() {
        if(pageSize=="large" && orientation=="portrayed"){
            numberOfPages="reduced";
        }
        else if(pageSize=="medium" && orientation=="portrayed"){
            numberOfPages="reduced";
        }
        else if(pageSize=="large" && orientation=="landscape"){
            numberOfPages="reduced";
        }
        else if(pageSize=="medium" && orientation=="landscape"){
            numberOfPages="reduced";
        }
        else{
            System.out.println("Number of pages can't be reduced.");
        }
    }
//    public void renderPreview()
//    {
//        System.out.println("Document updated");
//    }
}
