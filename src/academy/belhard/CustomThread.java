package academy.belhard;

public class CustomThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            SharedResource.add(i + "(" + Thread.currentThread().getName() + ")");
        }
    }
}
