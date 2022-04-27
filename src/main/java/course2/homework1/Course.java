package course2.homework1;

public class Course {

    private Obstruction[] obstructions;

    public Course(Obstruction... obstructions) {
        this.obstructions = obstructions;
    }

    public void doIt(Team team) {

        for (Member member : team.getMembers()) {
            for (Obstruction obstruction : obstructions) {
                obstruction.doIt(member);
                if (!member.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
