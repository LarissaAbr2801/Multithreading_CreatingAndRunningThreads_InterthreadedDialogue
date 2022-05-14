public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main group");
        workWithThreadInGroup(threadGroup, "поток 1");
        workWithThreadInGroup(threadGroup, "поток 2");
        workWithThreadInGroup(threadGroup, "поток 3");
        workWithThreadInGroup(threadGroup, "поток 4");

        MyThread.sleep(15000);
        System.out.println("Все потоки завершены");
    }

    public static void workWithThreadInGroup(ThreadGroup threadGroup, String name) throws InterruptedException {
        final MyThread thread = new MyThread(threadGroup, name);
        thread.setDaemon(true);
        thread.start();
    }
}
