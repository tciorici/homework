public class TestBread {

    public static void main (String[] args) {

        Bread b1 = new Bread("Rye", 23);
        Bread b2 = new Bread("Black", 29);
        Bread b3 = new Bread("White", 26);

        System.out.println(b1.getBreadType());
        System.out.println(b1.getCaloriesPerSlice());
        System.out.println(b1.MOTTO);

        System.out.println(b2.getBreadType());
        System.out.println(b2.getCaloriesPerSlice());
        System.out.println(b2.MOTTO);

        System.out.println(b3.getBreadType());
        System.out.println(b3.getCaloriesPerSlice());
        System.out.println(b3.MOTTO);
    }

}
