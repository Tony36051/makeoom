package wjs.jvm;

public class OnlySleep {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
        }
    }
}
