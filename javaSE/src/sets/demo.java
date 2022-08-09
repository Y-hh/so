package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class demo {
    public static void main(String[] args) {
        new TreeSet<>();
        Set set1 = new HashSet();
        Teacter t1 = new Teacter();
        Teacter t2 = new Teacter();
        t1.setAge(22);
        t2.setAge(33);
        t1.setName("jian");
        t2.setName("hua");
        set1.add(t1);
        set1.add(t2);
        System.out.println(set1);

    }
}
class Teacter{
    private String name;
    private int age;
    @Override
    public String toString() {
        return "Teacter [name=" + name + ", age=" + age + "]";
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}