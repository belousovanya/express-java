package homework_2;

public class Point {
    int x;
    int y;

    Point(int x) {
        this.x = x;
    }

    int getX() {
        return this.x;
    }

    void setX(int newX) {
        this.x = newX;
    }

    void setY(int newY) {
        this.y = newY;
    }

    void print() {
        System.out.println("Координаты x = " + this.x + ", y = " + this.y);
    }
}
