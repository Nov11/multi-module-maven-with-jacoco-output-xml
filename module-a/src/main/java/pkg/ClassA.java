package pkg;

public class ClassA {
    public void foo() {
        ClassB b = new ClassB();
        b.foo();
    }

    public void bar() {
        ClassB b = new ClassB();
        b.bar();
    }
}
