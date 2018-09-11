//    1. Create a class for the Tip Top Bakery named Bread with data fields for bread type
//    (such as “rye”) and calories per slice. Include a constructor that takes parameters
//    for each field, and include get methods that return the values of the fields. Also
//    include a public final static String named MOTTO and initialize it to The staff of
//    life.Write an application named TestBread to instantiate three Bread objects with
//    different values, and then display all the data, including the motto, for each object.
//    Save both the Bread.java and TestBread.java files.

public class Bread {

    public static final String MOTTO = "The staff of life";
    private String breadType;
    private double caloriesPerSlice;



    public Bread (String breadType, double caloriesPerSlice){
        this.breadType = breadType;
        //getBreadType(); should be here?
        this.caloriesPerSlice = caloriesPerSlice;
        String MOTTO;
    }


    public void setBreadType(String breadType){
        this.breadType = breadType;
    }

    public String getBreadType(){
        return this.breadType;
    }

    public void setCaloriesPerSlice(double caloriesPerSlice){
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public double getCaloriesPerSlice(){
        return this.caloriesPerSlice;
    }



}

