package prototype.shapes;

public class Rectangle extends Shape {
    public int length;
    public int breadth;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);

        if (target != null) {
            this.length = target.length;
            this.breadth = target.breadth;
        }
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;

        Rectangle shape2 = (Rectangle) object2;

        return shape2.length == length && shape2.breadth == breadth;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    
}
