package com.leti2021_2.FieldObjects;

public class Direction {
    public enum type {
        UP, DOWN, LEFT, RIGHT
    }

    public static type parseDirection(String input) {
        switch (input) {
            case "u" -> {
                return type.UP;
            }
            case "l" -> {
                return type.LEFT;
            }
            case "d" -> {
                return type.DOWN;
            }
            case "r" -> {
                return type.RIGHT;
            }
            default ->
                throw new IllegalArgumentException("Error! Invalid direction!");
        }
    }
}
