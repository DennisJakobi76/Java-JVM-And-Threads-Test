public class ThreadPriorityExample {

    public static void main(String[] args) {

        Thread highPriorityThread = new Thread(() ->{
           for (int i = 0; i < 5; i++) {
               System.out.println("High Priority Thread - Count: " + i);
           }
        }, "HighPriorityThread");

        Thread mediumPriorityThread = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Medium Priority Thread - Count: " + i);
            }
        }, "MediumPriorityThread");

        Thread lowPriorityThread = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Low Priority Thread - Count: " + i);
            }
        }, "LowPriorityThread");

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        mediumPriorityThread.setPriority(Thread.NORM_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();
    }
}
