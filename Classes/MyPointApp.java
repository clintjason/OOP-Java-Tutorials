public class MyPointApp{
	public static void main(String[] args){
		MyPoint[] points = new MyPoint[11];
		
		for(int i=1;i<points.length;i++){
			points[i] = new MyPoint(i,i);
			System.out.println(points[i]);
			}
		}
	}
