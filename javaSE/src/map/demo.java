package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class demo {
    public static void main(String[] args) {
        Map map = new HashMap();
        //添加元素
        map.put(1001, "value1");
        map.put(1002, "value2");
        System.out.println(map);
        //查询数据
        Object sum = map.get(1002);
        System.out.println(sum);
        //得到map中所有的entry
        System.out.println("----------------------------");
        Set entrySet = map.entrySet();
        //遍历map1
        for (Object obj : entrySet) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                System.out.println(key+"="+value);
            }
        }
        System.out.println("----------------------------");
        //遍历map2
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
