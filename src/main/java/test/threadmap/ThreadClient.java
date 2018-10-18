package main.java.test.threadmap;

public class ThreadClient extends Thread {
    Sequence sequence ;
    public ThreadClient(Sequence sq){
        this.sequence = sq;

    }
    @Override
    public void run() {
        for (int i = 0 ; i < 3; i++ ) {
            System.out.println(Thread.currentThread().getName() +"^" + this.sequence.getNumber());

        }

    }
}
