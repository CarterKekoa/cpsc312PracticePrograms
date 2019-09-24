public class PointOld{
    private int xPoint;
    private int yPoint;

    public PointOld(int x, int y){
        this.xPoint = x;
        this.yPoint = y;
    }

    public PointOld(){
        this.xPoint = 0;
        this.yPoint = 0;
    }

    @Override
    public String toString(){
        String pointStr = "";
        pointStr += "(" + xPoint + ", " + yPoint + ")";
        return pointStr;
    }

    public int getxPoint() {
        return xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }
}
