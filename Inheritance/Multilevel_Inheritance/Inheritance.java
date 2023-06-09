
public class Inheritance {
    public static void main(String[] args) {

        // boxPrice box = new boxPrice(10, 30, 200);
        // System.out.println(box.l);
        // System.out.println(box.h);
        // System.out.println(box.w);
        // System.out.println(box.weight);
        // System.out.println(box.cost);

        // 1:
        // Box box = new Box();
        // System.out.println(box.h);

        // 2: passing object
        // Box b = new Box();
        // b.h = 20;
        // b.l = 25;
        // b.w = 34;
        // Box box = new Box(b);
        // System.out.println(box.h);
        // System.out.println(b.h);

        // boxWeight w = new boxWeight(1, 2, 3, 4);
        // boxPrice price = new boxPrice(1, 2, 3, 4, 5);
        // System.out.println(price.w);

        // boxWeight b = new boxWeight(1, 2, 3, 4);

    }
}

class Box {
    double l, w, h;
    // double weight = 99;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
        System.out.println("Inside Box");
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void info() {
        System.out.println("Box Model");
    }
}

class boxWeight extends Box {
    double weight;

    public boxWeight() {
        this.weight = -1;
    }

    public boxWeight(double l, double w, double h, double weight) {
        super(l, h, w);
        this.weight = weight;
        System.out.println("Inside Box weight");
        // System.out.println(super.weight);
        // System.out.println(weight);
    }

    public boxWeight(boxPrice other) {
        // super
    }

    public boxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}

class boxPrice extends boxWeight {

    double cost;

    boxPrice() {
        super();
        this.cost = -1;
    }

    boxPrice(boxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    boxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
        System.out.println("Inside boxPrice");
    }

    boxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}