
import java.util.ArrayList;
import java.util.Collection;



public class Demo02{
  public static void main(String[] args) {
    Collection col1 = new ArrayList();
    Collection col2 = new ArrayList();
    col2.addAll(col1);
    col1.add(12);
    System.out.println(col1);//打印集合中的所有元素
    col1.remove(10);//直接删除某个元素
    col1.removeAll(col2);//删除与col2中相同的元素
    boolean ant1 = col1.retainAll(col2);//删除与col2中不同的元素，如果有删除返回ture
    int size =  col1.size();//查询集合中元素的个数
    boolean contains = col1.contains("12");//当前集合是否包含某个元素
    boolean containsAll= col1.containsAll(col2);//是否包含某个集合的所有元素
  }  
   
}  
