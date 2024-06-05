class mythreadrunnable1 implements Runnable{
    public mythreadrunnable1(String name){
        System.out.println("i am constructor");
    }
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("thread 1");
        }
    }
}

class mythreadrunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("thread 2");
        }
    }
}

public class Runnable_thread {
    public static void main(String[] args) {
        Thread gun1 = new Thread(new mythreadrunnable1("thread1"));
        mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
