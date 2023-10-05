
//Access modifier
//Exception handling
//Inheritance
//Demo of single , multilevel, hierarchy level
class A {
    public void show() {
        System.out.println("Ansh");
    }
}
// Multilevel
// class B extends A{
// public void sh1(){
// System.out.println("Chauhan");
// }
// }
// class C extends B{
// public void sh2(){
// System.out.println("Vansh");
// }
// }
// Hierarchy
class C extends A {
    public void sh2() {
        System.out.println("Vansh");
    }
}
public class revision_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.sh2();
    }
}