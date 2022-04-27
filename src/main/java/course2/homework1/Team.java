package course2.homework1;

public class Team {

    private Member[] members;

    public Team(Member... members) {

        this.members = members;

    }

    public Member[] getMembers() {
        return members;
    }

    public void getResults() {
        for (Member c : members) {
            c.getResult();
        }
    }

}
