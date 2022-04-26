package course2.homework1;

public class Wall extends Obstruction {

    private int height;

    public Wall(int height) {

        this.height = height;
    }


    @Override
    public void doIt(Member member) {

        member.jump(this.height);

    }
}
