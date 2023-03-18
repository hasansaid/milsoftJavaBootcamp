package homework1A;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Team team1= new Team(901,"Godoro Spor");
        team1.setPlayerList(new ArrayList<Player>());

        Player player1 = new Player(301,"Neşet Ertaş",45.2);
        team1.getPlayerList().add(player1);
        Player player2 = new Player(302,"Mahsuni Şerif",36.5);
        team1.getPlayerList().add(player2);
        Player player3 = new Player(303,"Erkan Ocaklı",71.3);
        team1.getPlayerList().add(player3);

        System.out.println(team1.getTeamId()+" "+team1.getTeamName());
        for(Player player:team1.getPlayerList()){
            System.out.println("\t"+player.getPlayerId()+" "+
                    player.getPlayerName()+" "+
                    player.getAverageScore());
        }

    }
}
