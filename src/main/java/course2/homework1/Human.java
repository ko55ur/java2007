package course2.homework1;

public class Human implements Member {

    private boolean isOnDistance;
    private int runDistance;
    private final int jumpHeight;


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
        System.out.println(String.format("Human run %s", length));

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

        System.out.println(String.format("Human jump %s", height));

    }


    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void getResult() {


        if (isOnDistance = true) {

            System.out.println("Human %s make course");

        }
    }

        public void setRunDistance ( int runDistance){
            this.runDistance = runDistance;
        }

    }
