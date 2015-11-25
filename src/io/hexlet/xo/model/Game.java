package io.hexlet.xo.model;

/**
 * Created by peter on 2015-11-25.
 */
public class Game {
    private final Player[] players;

    private final Field field;

    private final String name;

    public Game(final Player[] players, final Field field, final String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }
}
