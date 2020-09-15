
/**
 * Write a description of class ObjectPropertyEx here.
 *
 * @author (2017315013 이권효)
 * @version (2020.09.09)
 */
public class ObjectPropertyEx
{
    public static void main(String[] args){
        Point p = new Point(10, 20);
        print(p);
        
        Point p2 = new Point(10, 0);
        
        System.out.println(p.equals(p2));
    }
    
    public static void print(Object obj){
        System.out.println(obj.toString());
    }
}
