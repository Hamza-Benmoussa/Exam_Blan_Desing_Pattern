package ma.dev7hd.figure.figuresGeometriques;

public class Point {
    private int x;
    private int y;

    // Constructeur avec paramettres
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }

    // Getters et Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
