package creational;

public interface Builder {
    ShapeBuilder buildForm(String form);

    ShapeBuilder buildFill(String fill);

    ShapeBuilder buildColor(String color);
}

class ShapeBuilder implements Builder {
    private String form = "square";
    private String fill = "not fill";
    private String color = "black";


    public ShapeBuilder buildForm(String form) {
        this.form = form;
        return this;
    }

    public ShapeBuilder buildFill(String fill) {
        this.fill = fill;
        return this;
    }

    public ShapeBuilder buildColor(String color) {
        this.color = color;
        return this;
    }


    public Shape build() {
        Shape shape = new Shape();
        shape.setShapeForm(this.form);
        shape.setShapeFill(this.fill);
        shape.setShapeColor(this.color);
        return shape;
    }
}


class Shape {
    private String shapeForm;
    private String shapeFill;
    private String shapeColor;

    public String getShapeForm() {
        return this.shapeForm;
    }

    public String getShapeFill() {
        return this.shapeFill;
    }

    public String getShapeColor() {
        return this.shapeColor;
    }

    public void setShapeForm(String shapeForm) {
        this.shapeForm = shapeForm;
    }

    public void setShapeFill(String shapeFill) {
        this.shapeFill = shapeFill;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String toString() {
        return "Shape created \nForm:\t" + shapeForm + "\nFill:\t" + shapeFill + "\nColor:\t" + shapeColor;
    }
}