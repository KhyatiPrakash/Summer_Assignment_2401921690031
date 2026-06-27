class Box {

    double length;
    double breadth;
    double height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double area() {
        return 2 * (length * breadth + breadth * height + length * height);
    }

    double volume() {
        return length * breadth * height;
    }
}

class Box3D extends Box {

    Box3D(double length, double breadth, double height) {
        super(length, breadth, height);
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        Box3D box = new Box3D(5, 4, 3);

        System.out.println("Area = " + box.area());
        System.out.println("Volume = " + box.volume());
    }
}
