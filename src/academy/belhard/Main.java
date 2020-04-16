package academy.belhard;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        CustomThread customThread1 = new CustomThread();
//        CustomThread customThread2 = new CustomThread();
//
//        customThread1.start();
//        customThread2.start();
//
//        customThread1.join();
//        customThread2.join();
//
//        System.out.println("Size: " + SharedResource.getElements().size());
//        System.out.println("Elements: " + SharedResource.getElements());

        List<Integer> source = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        source
                .parallelStream()
                .forEach(item -> SharedResource.add(item + " - " + Thread.currentThread().getName()));

        System.out.println("Size: " + SharedResource.getElements().size());
        System.out.println("Elements: " + SharedResource.getElements());
    }
}
