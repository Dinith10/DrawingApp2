package mainPackage;

public class Triangle implements Shape {

    private Point PointA;
    private Point PointB;
    private Point PointC;


    public Point getPointA() {
        return PointA;
    }

    public void setPointA(Point pointA) {
        PointA = pointA;
    }

    public Point getPointB() {
        return PointB;
    }

    public void setPointB(Point pointB) {
        PointB = pointB;
    }

    public Point getPointC() {
        return PointC;
    }

    public void setPointC(Point pointC) {
        PointC = pointC;
    }

    public void draw(){


        System.out.println( "Triangle Point A = ( " + getPointA().getX() + ", " + getPointA().getY() + " )");
        System.out.println( "Triangle Point B = ( " + getPointB().getX() + ", " + getPointB().getY() + " )");
        System.out.println( "Triangle Point C = ( " + getPointC().getX() + ", " + getPointC().getY() + " )");



    }




}
