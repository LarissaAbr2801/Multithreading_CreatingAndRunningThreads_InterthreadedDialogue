public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main group");
        for (int i = 0; i < 4; i++) {
            workWithThreadInGroup(threadGroup, " " + (i + 1) + "");
        }
        Thread.sleep(15000);
        System.out.println("Все потоки завершены");
    }

    public static void workWithThreadInGroup(ThreadGroup threadGroup, String name) {
        final MyThread thread = new MyThread(threadGroup, name);
        thread.setDaemon(true);
        thread.start();
    }
}
