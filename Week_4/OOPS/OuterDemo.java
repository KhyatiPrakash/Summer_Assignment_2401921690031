class Outer {

    void display() {
        System.out.println("Outer class display");
    }

    class Inner {

        void display() {
            System.out.println("Inner class display");
        }
    }
}

public class OuterDemo {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.display();

        Outer.Inner in = obj.new Inner();
        in.display();
    }
}
