package course2.homewrok5;

public class HomeWorkApp5 {

    static final int SIZE = 230000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {

        System.out.println(String.format("First method running from %d ms", singleThread()));
        System.out.println(String.format("Second method running from %d ms", multiThread()));
        for (int i = 2; i <= 32; i *= 2) {
            System.out.println(String.format("%d threads running from %d ms", i, multiThread()));
        }
    }

    private static long singleThread() {

        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {

            array[i] = 1;

        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {

            array[i] = (float) (array[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));

        }
        return System.currentTimeMillis() - a;

    }

    private static long multiThread() {

        float[] array = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = 1;
        }

        float[] firstArray = new float[H];
        float[] secondArray = new float[H];
        long a = System.currentTimeMillis();
        System.arraycopy(array, 0, firstArray, 0, H);
        System.arraycopy(array, H, secondArray, 0, H);
        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                firstArray[i] = (float) (array[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            }
        });
        firstThread.start();
        Thread secondThread = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                secondArray[i] = (float) (array[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));

            }
        });
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(firstArray, 0, array, 0, H);
        System.arraycopy(secondArray, 0, array, H, H);
        return System.currentTimeMillis() - a;


    }


}
