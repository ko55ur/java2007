package course2.homework1;

public class Team {

    private final Member[] members;

    public Team(Member... members) {

        this.members = members;

    }

    public Member[] getMembers() {
        return members;
    }

    public void getResults() {
        for (Member part : members) {
            part.getResult();
        }
    }

}
