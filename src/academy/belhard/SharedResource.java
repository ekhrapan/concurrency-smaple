package academy.belhard;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {

    private final static List<String> elements = new ArrayList<>();

    public synchronized static void add(String element) {
        elements.add(element);
    }

    public synchronized static List<String> getElements() {
        return elements;
    }
}
