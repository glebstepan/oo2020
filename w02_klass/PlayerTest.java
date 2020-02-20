public class PlayerTest{
    public static void main(String[] args) {
        Player player1 = new Player("Bob", 23, Position.FIRST, Team.RED);
        Player player2 = new Player("Rob", 24, Position.SECOND, Team.RED);
        Player player3 = new Player("Vob", 25, Position.THIRD, Team.RED);
        Player player4 = new Player("Oob", 26, Position.FIRST, Team.BLUE);
        Player player5 = new Player("Kob", 27, Position.SECOND, Team.BLUE);

        Player[] players = {player1, player2, player3, player4, player5};

        player1.getInfo();
        player1.changeTeam(Team.RED);
        player1.changeTeam(Team.BLUE);
        player1.gotOlder();
        player1.getInfo();

        System.out.println();

        // For tsükkel, mis kuvab teavet mängijate kohta, kes mängivad konkreetses meeskonnas.
        for(int i=0; i < players.length; i++){
            if(players[i].getTeam() == "Blue"){
                players[i].getInfo();
            }
        }
    }


}