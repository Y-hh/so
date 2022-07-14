
public class Demo02{
  public static void main(String[] args) {
    Anima a = new Anima();
    Anima b = new Anima();
    a.setName("xiaohua");
    b.setName("xiaohua");
    a.setAge(1);
    b.setAge(1);
    a.setId("11101");
    b.setId("11101");
    a.equals(b);
  }  
   
}
class Anima{
  private String name;
  private int age;
  private String id;
  
  public void setAge(int age) {
    this.age = age;
  }
  public void setId(String id) {
    this.id = id;
  }
  public int getAge() {
    return age;
  }
  public String getId() {
    return id;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
