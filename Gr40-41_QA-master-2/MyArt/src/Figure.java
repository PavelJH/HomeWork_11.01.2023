public class Figure implements Artist,Painter {

    private char symbol;
    Color color;

    public Figure(char symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    public void calculateArea(){
        System.out.println( "Считаю площадь");
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void drawFigure() {

    }

    @Override
    public void paintFigure() {

    }
}
