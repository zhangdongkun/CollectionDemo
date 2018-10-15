package main.java.collenction.stack;

public class ArrayStack<T> implements IStack<T> {
    /**
     * 初始化栈空间
     */
    private T [] t = (T[])new Object[16];
    private int size = 0;

    @Override
    public boolean isEmpety() {
        return this.size == 0;
    }

    @Override
    public void push(T data) {
         if (t.length >= size ){
         }
        t[size++] = data;
    }

    @Override
    public T pop() {
        T temp  = t[size-1];
        if (size > 0) {
            size--;
        }
        return temp;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int search(T t) {
        return 0;
    }

    /**
     * 扩容
     */
    public  void resize(){
       T [] temp = (T[])new Object[t.length*2];


       for (int i = 0 ; i < t.length; i++) {
           temp[i] = t[i];
           t[i] = null;

       }
       t =  temp;

       temp = null;

    }
}
