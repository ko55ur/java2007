package course2.homework1;

public class Treadmill extends Obstruction {

    private final int length;

    public Treadmill(int length) {

        this.length = length;
    }

    @Override
    public void doIt(Member member) {

        member.run(this.length);

    }
}
