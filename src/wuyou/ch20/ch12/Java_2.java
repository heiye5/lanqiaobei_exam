package wuyou.ch20.ch12;

public class Java_2 {
    public static void main(String[ ] args) {
        //*********Found**********
        Point[] pt = new Point[2];
        pt[0] = new Point();
        pt[1] = new Point(2, 3);
        //*********Found**********
        for (int i=0; i < pt.length; i++) {
            System.out.print( pt[i] );
        }
    }
}

class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    //*********Found**********
    public Point (int a, int b) {
        x = a;
        y = b;
    }

    int getX( ) {
        return x;
    }

    int getY( ) {
        //*********Found**********
        return y;
    }

    void setX(int a) {
        x = a;
    }

    void setY(int b) {
        y = b;
    }

    public String toString ( ) {
        return "  ( " + x + "," + y + " ) ";
    }
}
