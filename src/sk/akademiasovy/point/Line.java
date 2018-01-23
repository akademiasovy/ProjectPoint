package sk.akademiasovy.point;

/**
 * Created by host on 22.1.2018.
 */
public class Line {
    private Point a ;
    private Point b;

    public Line(Point a, Point b){
        this.a=a;
        this.b=b;
    }
    public Line(int xa, int ya, int xb, int yb){
        a=new Point(xa,ya);
        this.b=new Point(xb,yb);
    }

    public double getLength(){
        return a.getDistanceFromOtherPoint(b);
    }

    public Point getMiddlePointOfLine(){
        return new Point((a.getX()+b.getX())/2,(a.getY()+b.getY())/2);
    }

    public boolean isParallelToTheAxisX(){
       return a.getY()==b.getY();
    }


    public boolean isParallelToTheAxisY(){
        return a.getX()==b.getX();
    }
}
