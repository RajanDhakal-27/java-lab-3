class Animal{
    public void eat(){
        System.out.println("eating");
    }
}
class Cat extends Animal{
    public void meow()
    {
        System.out.println("cat meows meows");
    }
}

class Main {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.meow();
    }
}
