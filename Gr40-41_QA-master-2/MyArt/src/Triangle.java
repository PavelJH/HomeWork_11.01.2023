public class Triangle extends Figure {

    private int base;
    private int height;

    public Triangle(char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        //TODO Написать метод
    }

    @Override
    public void drawFigure() {

    }

    @Override
    public void paintFigure() {
        //TODO Поменять цвет фигуры
    }
}
