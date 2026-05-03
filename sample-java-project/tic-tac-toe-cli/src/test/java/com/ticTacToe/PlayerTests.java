package com.ticTacToe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {
    @Test
    void constructPlayerWithCharacter() {
        Player player = new Player("❌");
        assertEquals("❌",  player.getCharacter());
    }
}
