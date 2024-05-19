import java.util.ArrayList;
import java.util.List;

public class BasicList {

    public static void colors(){
        List<String> ListColors = new ArrayList<String>();
        ListColors.add("Red");
        ListColors.add("Green");
        ListColors.add("White");
        ListColors.add("Pink");
        ListColors.add("Blue");
        ListColors.add("Black");
        ListColors.add("Orange");
        System.out.println(ListColors);
    }

    public static void main(String[] args) {
            colors();
    }
}