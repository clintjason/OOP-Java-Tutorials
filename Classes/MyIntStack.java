public class MyIntStack {
    private int[] contents;
    private int tos;  // Top of the stack

    // constructors
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if(tos == contents.length){
            //throw new IllegalStateException("Stack is full");
            realloc();
        }
        contents[++tos] = element;
        return true;
    }

    public int pop() {
        return contents[tos--];
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    private void realloc(){
        int[] data = new int[contents.length + 10];
        for(int i = 0; i < contents.length; i++){
            data[i]  = contents[i];
        }
        contents = data;
    }
}
