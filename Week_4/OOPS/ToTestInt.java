interface test {
    int square(int n);
}

class Arithmetic implements test {

    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {

        Arithmetic a = new Arithmetic();

        System.out.println(a.square(5));
    }
}
