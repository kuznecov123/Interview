package potoki.first;

public class PingPong {

    public static void main(String[] args) {
        Runnable ping = () -> {

                for (int i = 0;i < 5;i++) {
                    System.out.println("ping");
                   Thread.yield();
                }

        };
        Runnable pong = () -> {

                for (int j = 0;j < 5;j++) {
                    System.out.println("pong");
                    Thread.yield();
                }

        };


        Thread thread1 = new Thread(ping);
        Thread thread2 = new Thread(pong);

        thread1.start();
        thread2.start();




    }
}
