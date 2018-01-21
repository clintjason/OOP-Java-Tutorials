public class LineSub extends  Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end;               // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    public String toString() { return "line from point " + super.toString()  + " to point " + end;  }

    public Point getBegin() { return this; }
    public Point getEnd() { return this.end; }
    public void setBegin(Point begin) { super.setX(begin.getX()); super.setY(begin.getY()); }
    public void setEnd(Point end) {this.end = end; }

    public int getBeginX() { return super.getX(); }
    public int getBeginY() { return super.getY(); }
    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }

    public void setBeginX(int beginX) { super.setX(beginX); }
    public void setBeginY(int beginY) { super.setY(beginY); }
    public void setBeginXY(int beginX, int beginY) { super.setX(beginX); super.setY(beginY); }
    public void setEndX(int endX) { end.setX(endX); }
    public void setEndY(int endY) { end.setY(endY); }
    public void setEndXY(int x, int y) { end.setX(x); end.setY(y); }

    public int getLength() { return (int)Math.sqrt(Math.pow(end.getX() - super.getX(),2) + Math.pow(end.getY() - super.getY(),2)); } // Length of the line
    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() { return Math.atan2(Math.abs(end.getY() - super.getY()),Math.abs(end.getY() - super.getY())); } // Gradient in radians
    // Math.atan2(yDiff, xDiff)

}
