package bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameTest {

    private Game game;

    @Test
    public void oneSpare(){
        spare();
        manyRolls(17,0);
        assertEquals(18,game.score());
    }

    @Test
    public void oneStrike(){
        strike();
        manyRolls(16,0);
        assertEquals(22,game.score());
    }

    private void manyRolls(int noOfRolls, int pins) {
        for(int i = 0; i< noOfRolls; i++){
            game.roll(pins);
        }
    }

    @BeforeEach
    public void setUp(){
        game = new Game();
    }

    @Test
    public void nothing(){}

    @Test
    public void canRoll(){
        game.roll(1);
    }

    @Test
    public void gutterGame(){
        manyRolls(20, 0);
        assertEquals(0,game.score());
    }

    @Test
    public void allOnes(){
        manyRolls(20, 1);
        assertEquals(20,game.score());
    }

    private void spare() {
        game.roll(5);
        game.roll(5);
        game.roll(4);
    }

    private void strike() {
        game.roll(10);
        game.roll(4);
        game.roll(2);
    }

    @Test
    public void scoreBoard(){
        game.roll(7);
        game.roll(2);
        game.roll(10);
        game.roll(6);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(8);
        game.roll(1);
        game.roll(2);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(3);
        game.roll(3);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        assertEquals(98, game.score());


    }
}
