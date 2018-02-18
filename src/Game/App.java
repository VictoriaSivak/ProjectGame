package Game;

import java.io.IOException;
public class App{

    private static Player gamePlayer;

    public static void main(String[] args) {
        Manager manager = new Manager();
        Player player = new Player();
        try {
            gamePlayer = manager.setPlayer(player);
        } catch (IOException e) {
            System.out.printf("IO Exception occured");
        }
        System.out.println(player);
        setGamePlayer(gamePlayer);

        Player secondPlayer = new Player();
        try{
            gamePlayer = manager.setSecondPlayer(secondPlayer);
        }catch (IOException e) {
            System.out.println("IO Exception occured");
        }
        System.out.println(secondPlayer);
        setGamePlayer(gamePlayer);


        Enigma[] enigma = manager.prepareData();
        for (int i=0;i<1;i++){
            Enigma randomEnigma = manager.getRandomEnigma(enigma);
            System.out.println(randomEnigma.getQuestion());
        }
    }


    public static Player getGamePlayer() {
        return gamePlayer;
    }
    public static void setGamePlayer(Player gamePlayer) {
        App.gamePlayer = gamePlayer;
    }

}