
interface A {
    default void sum() {
        System.out.println("Sum from A");
    }
}

interface B {
    default void sum() {
        System.out.println("Sum from B");
    }
}

class C implements A, B {
    
    public void sum() {
        System.out.println("rajan is good");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.sum();
    }
}

