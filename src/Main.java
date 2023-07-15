import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it

        List<String> names = new ArrayList<>();
        names.add("pranay");
        names.add("kumar");
        names.add("reddy");
        names.add("mettu");
        System.out.println(names);
        names.remove(0);
        for (String s : names) {
            System.out.println(s);
        }

        names.add(3,"hello");
        for(int i=names.size()-1;i>-1;i--) {
            System.out.println(names.get(i));
        }

    }
    }