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

    System.out.println(a.toString());
    System.out.println(a.equals(b));
    System.out.println(b.equals(a));
  }  
   
}
