package course2.lesson5;

/*
1. Необходимо написать два метода, которые делают следующее:

1) Создают одномерный длинный массив, например:

static final int size = 10000000;
static final int h = size / 2;
float[] arr = new float[size];

2) Заполняют этот массив единицами;
3) Засекают время выполнения: long a = System.currentTimeMillis();
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis();
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

Пример деления одного массива на два:

System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);

Пример обратной склейки:

System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);

Примечание:
System.arraycopy() – копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:

for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}

Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

 */

public class MultithreadingApplication {
    static final int size = 230000000;

    public static void main(String[] args) {

        System.out.println(String.format("Single thread running from %d ms", singleThread()));
        for (int i = 2; i <= 32; i *= 2) {
            System.out.println(String.format("%d threads running from %d ms", i, multiThreads(i)));
        }
    }

    private static float[] prepArr() {

        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    private static long singleThread() {

        float[] arr = prepArr();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = calc(arr[i], i);
        }
        long end = System.currentTimeMillis();
        return end - begin;

    }

    private static float calc(float val, int index) {

        return (float) (val * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));

    }

    private static long multiThreads(int threadCount) {

        float[] arr = prepArr();
        long begin = System.currentTimeMillis();

        float[][] parts = split(arr, threadCount);
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            final float[] part = parts[i];
            threads[i] = new Thread(() -> {
                for (int j = 0; j < part.length; j++) {
                    part[j] = calc(part[j], j);
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < threadCount; i++) {

            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        merge(arr, parts);
        long end = System.currentTimeMillis();
        return end - begin;
    }

    private static float[][] split(float[] arr, int count) {
        if (arr.length % count != 0) {
            throw new RuntimeException("Unable to split an array.");
        }
        int partSize = arr.length / count;
        float[][] parts = new float[count][];
        for (int i = 0; i < count; i++) {
            parts[i] = new float[partSize];
            System.arraycopy(arr, partSize * i, parts[i], 0, partSize);
        }
        return parts;
    }

    private static void merge(float[] arr, float[][] parts) {

        int currentPosition = 0;
        for (int i = 0; i < parts.length; i++) {

            System.arraycopy(parts[i], 0, arr, currentPosition, parts[i].length);
            currentPosition += parts[i].length;

        }
    }
}
