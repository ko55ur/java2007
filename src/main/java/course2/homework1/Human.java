package course2.homework1;

public class Human implements Member {
    //@Override
    public void info() {

    }

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;


    public Human(int runDistance, int jumpHeight) {

        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
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
        System.out.println(String.format("The human ran %s meters", length));

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

        System.out.println(String.format("The human jumped %s meters", height));

    }


    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void getResult() {

        System.out.println(String.format("The human %s passed the obstacle", isOnDistance ? "" : "not"));

    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

}