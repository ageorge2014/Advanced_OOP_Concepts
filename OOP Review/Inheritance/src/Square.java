public class Square extends Shape {
    double side;

    public Square (double side, String name) {
        super(name);
        this.side = side;

    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public boolean equals(Object other) {
       if (!(other instanceof Square))
           return false;

       Square s2 = (Square)other;

       return (s2.name.equals(this.name) && s2.side == (this.side));
    }

    @Override
    public String toString() {
        return this.name + ":" + this.side;
    }
}
