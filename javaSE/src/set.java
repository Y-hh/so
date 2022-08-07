import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set st = new HashSet();
        //添加元素（没有索引）
        st.add("a");
        st.add(1);
        st.add("c");
        //查询元素，无索引 
        Object[] array = st.toArray();
        System.out.println(Arrays.toString(array));
        //删除
        st.remove("a");
        Object[] array1 = st.toArray();
        System.out.println(Arrays.toString(array1));
    }
}
