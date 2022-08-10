package course3.homework4;

public class HomeworkApp4 {

    private static final Object monitor = new Object();
    private static char letter = 'A';

    public static void main(String[] args) throws InterruptedException {
        new Thread(HomeworkApp4::printA).start();
        new Thread(HomeworkApp4::printB).start();
        new Thread(HomeworkApp4::printC).start();
        Thread.sleep(2000);
        System.out.println();
        new Thread(() -> printAll('A')).start();
        new Thread(() -> printAll('B')).start();
        new Thread(() -> printAll('C')).start();
    }

    private static void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'A') {
                        monitor.wait();
                    }
                    System.out.print(letter);
                    letter = 'B';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'B') {
                        monitor.wait();
                    }
                    System.out.print(letter);
                    letter = 'C';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter != 'C') {
                        monitor.wait();
                    }
                    System.out.print(letter + "  ");
                    letter = 'A';
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printAll (char symbol){
        synchronized (monitor){
            try{
                for (int i = 0; i < 10; i++) {
                    while (letter != symbol){
                        monitor.wait();
                    }
                    System.out.print(symbol);
                    switch (symbol){
                        case 'A':
                            letter ='B';
                            monitor.notifyAll();
                            break;
                        case 'B':
                            letter = 'C';
                            monitor.notifyAll();
                            break;
                        case 'C':
                            System.out.print("  ");
                            letter = 'A';
                            monitor.notifyAll();
                            break;
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
