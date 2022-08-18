package map;

import java.util.Collection;
import java.util.HashMap;

public class demo2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(0001, "value");
        map.put(0002, "value");
        map.put(0003, "value");
        map.put(0004, "value");
        map.put(0005, "value");
        Collection values = map.values();
        for (Object object : values) {
            System.out.println(object);
        }
    }
}
