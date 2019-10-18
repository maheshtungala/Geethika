package collections;
import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] ar) {
        List<String> itemList = new ArrayList<String>();
        itemList.add("Mahesh");
        itemList.add("Naresh");
        itemList.add("Orange");

        String[] itemsArray = new String[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);

        for(String s : itemsArray)
            System.out.println(s);
    }
}