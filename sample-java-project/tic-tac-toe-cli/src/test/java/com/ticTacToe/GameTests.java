package com.ticTacToe;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class GameTests {
    @Test
    void canCreateNewGame() {
        Game game = new Game("❌","⭕️");
        assertEquals("❌", game.getP1().getCharacter());
        assertEquals("⭕️", game.getP2().getCharacter());

        for (int i = 1; i < 10; i++) {
            assertNull(game.getCharInbox(i));
        }

        assertEquals(game.getP1(), game.getNextTurn());
    }

    @Test
    void canMarkBoxesViaAttempts() {
        Game game = new Game("❌","⭕️");

        game.nextAttempt(1);
        assertEquals("❌", game.getCharInbox(1));
        assertEquals(game.getP2(), game.getNextTurn());

//       check that already marked boxes are not allowed to be marked
        assertThrowsExactly(IllegalStateException.class, () -> {
            game.nextAttempt(1);
        });
    }

    @Test
    void throwsExceptionForInvalidBoxAttempt() {
        Game game = new Game("❌","⭕️");

//        check that box no. is between 1 and 9

        assertThrowsExactly(IllegalArgumentException.class, () -> {
            game.getCharInbox(10);
        });

    }
}
