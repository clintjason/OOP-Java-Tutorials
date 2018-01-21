public class TestResizableCircle {
    public static void main(String args[]){
        ResizableCircle c = new ResizableCircle(100);
        c.resize(70); //resize circle by 50%
        System.out.println("new radius is: " + c.getRadius());
    }
}

