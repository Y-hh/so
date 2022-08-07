import java.util.HashSet;
import java.util.Set;

public class listdemo {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add("a");
        set1.add(1);
        set1.add(new Student("xiaoming"));
        System.out.println(set1);

    }
}
class Student{

    private  String Name;

    public Student(String name) {
        super();
        Name = name;
    }

    @Override
    public String toString() {
        return "Student [Name=" + Name + "]";
    }

 
}
