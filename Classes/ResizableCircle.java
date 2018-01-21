public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius){
        super(radius);
      }
      
    @Override
    public void resize(int percent) {
        double r = (percent/100.0) * radius;
        if(percent < 0){
            radius -= r;
        }else{
            radius += r;
        }
    }
} 
