package Encapsulation;

public class MyClass {
    public static void main(String[] args) {
        Person myObj = new Person();
        //can't acess must change value my method
        // myObj.name = "John";
        // System.out.println(myObj.name);
        System.out.println(myObj.getName());
      }
}
