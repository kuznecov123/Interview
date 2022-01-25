package potoki.second;

public class Test {
    public static void main(String[] args) {
        long end;
        long start = System.nanoTime();
        for(long i = 0;i < 10000000L;i++)
            new LockingTest().increment();
        end = System.nanoTime() - start;
        System.out.println(end +  " наносекунд");


    }
}
