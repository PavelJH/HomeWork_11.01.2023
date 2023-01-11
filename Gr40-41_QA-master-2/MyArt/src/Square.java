public class Square extends Figure{

    private int side;

    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        //TODO Написать метод
    }

    @Override
    public void drawFigure() {
        //TODO Реализовать метод
        //   # # #
        //   # # #
        //   # # #
    }

    @Override
    public void paintFigure() {
        //TODO Поменять цвет фигуры
    }
}
