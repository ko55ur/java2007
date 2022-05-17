package course2.homework1;

public class Cat implements Member {


    private boolean isOnDistance;
    private int runDistance;
    private final int jumpHeight;


    public Cat(int runDistance, int jumpHeight) {

        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override

    public boolean isOnDistance() {

        return isOnDistance;
    }

    @Override
    public void run(int length) {

        if (!isOnDistance) {
            return;
        }
        if (length > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.printf("Cat run %s%n", length);

    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }

        System.out.printf("Cat jump %s%n", height);

    }


    @Override
    public void getResult() {

        System.out.printf("Cat %s make course%n", isOnDistance ? "" : " not");

    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

}
