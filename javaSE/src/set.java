import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        //添加元素（没有索引）
        set1.add("a");
        set1.add(1);
        set1.add("c");
        //查询元素，无索引 
        Object[] array = set1.toArray();
        System.out.println(Arrays.toString(array));
        //删除
        set1.remove("a");
        Object[] array1 = set1.toArray();
        System.out.println(Arrays.toString(array1));
    }
}
