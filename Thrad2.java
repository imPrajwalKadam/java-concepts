class Demo extends Thread// implements Runnable
{
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Inside thread:" + Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException obj) {
            }
        }
    }
}

class Thrad2 {
    public static void main(String arg[]) {
        System.out.println("Inside main thread");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("Loading..");
        t2.setName("Processing");

        try {
            t1.start();
            t2.start();
            t1.join();// main wait till t1 terminates
            t2.join();// main wait till t2 terminates
        } catch (Exception obj) {
        }
        System.out.println("End of main thread");
    }

}
