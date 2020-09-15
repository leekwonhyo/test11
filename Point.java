
/**
 * 점을 나타내는 클래스
 *
 * @author (2017315013 이권효)
 * @version (2020.09.09)
 */
public class Point
{
    // 점의 좌표값
    private int x;
    private int y;

    /**
     * Constructor for objects of class Point
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "Point(" + this.x + "," + this.y + ")";
    }
    
    public boolean equals(Object obj){
        Point p = (Point)obj;
        if(this.x == p.x && this.y == p.y){
            return true;
        }
        else{
            return false;
        }
    }
}
