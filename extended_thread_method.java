class mythead1 extends Thread{
    public mythead1(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("thread 1" + getName());
        }
    }
}

class mythead2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("thread 2");
        }
    }
}

public class extended_thread_method {
    public static void main(String[] args) {
        // mythead1 bullet1 = new mythead1();
        // mythead2 bullet2 = new mythead2();
        // bullet1.start();
        // bullet2.start();
        mythead1 t1 = new mythead1("smit1");
        mythead1 t2 = new mythead1("smit2");
        mythead1 t3 = new mythead1("smit3");
        mythead1 t4 = new mythead1("smit4");
        mythead1 t5 = new mythead1("smit5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
