package Builder.example2;

import java.util.List;
import java.util.ArrayList;

public class Computer {
    private List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        parts.add(part);
    }

    public void Show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i)+" complete");
        }
        System.out.println("complete");
    }
}
