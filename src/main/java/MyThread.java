public class MyThread extends Thread {

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2500);
                System.out.println("Я поток" + Thread.currentThread().getName() + " Всем привет!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
