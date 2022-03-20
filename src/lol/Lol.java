package lol;

public class Lol {

    public static void main(String[] args) {
        Helper helper = new Helper();

        int party = helper.selectParty();

        int answer = helper.printGameMode();

        helper.getGameMode(answer);

        helper.printTeam();

        int[] peopleArr = helper.getPosition();

        helper.printPosition(peopleArr, party);

        helper.rematch(party);

        helper.playGame();
    }
}