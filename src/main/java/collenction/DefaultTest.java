package main.java.collenction;

public interface DefaultTest {
    void doPrint1(String name);

    /**
     * default 为接口实现类 可以不在子类中实现而直接用
     * @param name
     */
    default  void doPrint2(String name){
        System.out.println("hello " + name);
    }

}
