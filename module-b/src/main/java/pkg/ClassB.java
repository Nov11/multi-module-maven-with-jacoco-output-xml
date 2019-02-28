package pkg;

public class ClassB {
    public void foo() {
        ClassC c = new ClassC();
        c.foo();
    }

    public void bar() {
        ClassC c = new ClassC();
        c.bar();
    }
}
