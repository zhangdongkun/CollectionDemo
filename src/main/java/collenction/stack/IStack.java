package main.java.collenction.stack;

public interface IStack<T>  {

    /**
     * 判断栈是否为空
     * @return
     */
    boolean isEmpety();

    /**
     * 入栈
     * @param data
     */
    void push(T data);


    /**
     * 出栈
     * @return
     */
    T pop();

    /**
     * 返回栈首元素
     * @return
     */

    T peek();

    /**
     * 清空栈
     */
    void clear();

    /**
     * 返回元素在栈中的位置
     */
    int search(T t);



}
