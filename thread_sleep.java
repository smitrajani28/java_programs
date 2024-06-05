class mythead1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
        try {
            // Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
            System.out.println("Good morning");
        }
    }
}

class mythead2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("Welcome");
        }
    }
}

public class thread_sleep {
    public static void main(String[] args) {
         mythead1 bullet1 = new mythead1();
        mythead2 bullet2 = new mythead2();
        // bullet1.setPriority(1);
        // bullet2.setPriority(0);
        bullet1.start();
        bullet2.start();
    }
}
