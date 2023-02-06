package SystemDesign.SnakeAndLadder;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        Player p1 = new Player("Sai Ram",1);
        Player p2 = new Player("Shiva",2);
        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        Jumper snake1 = new Jumper(64,25);
        Jumper snake2 = new Jumper(97,8);
        Jumper snake3 = new Jumper(54,12);
        Jumper snake4 = new Jumper(47,34);
        Jumper snake5 = new Jumper(44,28);
        List<Jumper> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        snakes.add(snake4);
        snakes.add(snake5);
        Jumper ladder1 = new Jumper(6,27);
        Jumper ladder2 = new Jumper(79,88);
        Jumper ladder3 = new Jumper(74,83);
        Jumper ladder4 = new Jumper(4,96);
        Jumper ladder5 = new Jumper(36,54);
        Jumper ladder6 = new Jumper(49,75);
        List<Jumper> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        ladders.add(ladder4);
        ladders.add(ladder5);
        ladders.add(ladder6);
        Map<String,Integer> playersCurrentPosition = new HashMap<>();
        playersCurrentPosition.put("Sai Ram",0);
        playersCurrentPosition.put("Shiva",0);
        GameBoard gb=new GameBoard(dice,allPlayers,snakes,ladders,playersCurrentPosition,100);
        gb.startGame();
    }
}
