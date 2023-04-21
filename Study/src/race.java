import java.util.HashMap;
import java.util.Map;

public class race {
    public String[] solution(String[] players, String[] callings) {

        // HashMap?
        HashMap<String, Integer> table = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            table.put(players[i], i);
        }

        // 이름 불리면 값 바꿔주기
        for (String player : callings) {
            int rank = table.get(player);

            String beforePlayer = players[rank - 1];

            players[rank - 1] = player;
            players[rank] = beforePlayer;

            table.put(player, rank - 1);
            table.put(beforePlayer, rank);
        }

        return players;
    }

    public static void main(String[] args) {
        race sol = new race();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"mumu", "kai", "mine", "soe", "poe"};
        sol.solution(players, callings);
    }
}
