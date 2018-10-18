package main.java.test.threadmap;

public class TestClient  {

    public static void main(String[] args) {
        Sequence sequenceA =  new SequenceA();
        Sequence sequenceB =  new SequenceB();
        /*
        ThreadClient threadClient1 = new ThreadClient(sequenceA);
        ThreadClient threadClient2 = new ThreadClient(sequenceA);
        ThreadClient threadClient3 = new ThreadClient(sequenceA);
        threadClient1.start();
        threadClient2.start();
        threadClient3.start();
        */

        ThreadClient threadClient4 = new ThreadClient(sequenceB);
        ThreadClient threadClient5 = new ThreadClient(sequenceB);
        ThreadClient threadClient6 = new ThreadClient(sequenceB);
        threadClient4.start();
        threadClient5.start();
        threadClient6.start();

    }
    }



/*threadlocal 为每个线程保留一份 变量*/
class SequenceA implements  Sequence{
    private static  int number = 0;
    @Override
    public int getNumber() {
        return  number = number + 1;
    }
}

/*静态变量会被线程共享*/
class SequenceB implements  Sequence{
    private static  ThreadLocal<Integer> numberContainer = new ThreadLocal(){
        @Override
        protected Object initialValue() {

            return 0;
        }
    };
    @Override
    public int getNumber() {
        //先放进去
        numberContainer.set(numberContainer.get()+ 1);
        //拿出来
        return  numberContainer.get();
    }
}