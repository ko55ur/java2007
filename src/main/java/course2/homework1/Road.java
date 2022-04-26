package course2.homework1;

public class Road extends Obstruction {

    private int length;

    public Road(int length) {

        this.length = length;
    }

    @Override
    public void doIt(Member member) {

        member.run(this.length);

    }
}
