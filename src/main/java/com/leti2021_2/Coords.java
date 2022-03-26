package com.leti2021_2;

import com.leti2021_2.PlayingField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coords {
    private int x;
    private int y;

    Coords() {}
    public Coords(int x, int y) {
        setX(x);
        setY(y);
    }

    public Coords(Coords coords) {
        setX(coords.getX());
        setY(coords.getY());
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int input) {
        if ((input >= 0) && (input <= PlayingField.getSideSize()))
            x = input;
    }

    public void setY(int input) {
        if ((input >= 0) && (input <= PlayingField.getSideSize()))
            y = input;
    }

    @Override
    public String toString() {
        return "x " + x + " y " + y;
    }

    public static Coords parseCoords(String input) {
        Pattern regexPattern = Pattern.compile("(^\\d+,\\d+$)|(^\\d+ \\d+$)"); // (^\d+,\d+$)|(^\d+ \d+$) - pair of numbers with separator " " or ",", for example: 13 14 or 0,25
        Matcher regexMatcher = regexPattern.matcher(input);
        if (!regexMatcher.find())
            throw new IllegalArgumentException("Error! Coordinates only can be pair of number with separator \" \" or \",\", for example\"13 14\" or \"0,25\"");
        // if input is correct then parse

        Pattern firstNumberPattern = Pattern.compile("(^\\d+)"); // ^\d+ - first number
        Matcher firstNumberMatcher = firstNumberPattern.matcher(input);
        if (!firstNumberMatcher.find())
            throw new IllegalArgumentException("Error! Coordinates only can be pair of number with separator \" \" or \",\", for example\"13 14\" or \"0,25\"");
        String xStr = input.substring(firstNumberMatcher.start(), firstNumberMatcher.end());
        int x = Integer.parseInt(xStr);

        Pattern secondNumberPattern = Pattern.compile("(\\d+$)"); // \d+$ - second number
        Matcher secondNumberMatcher = secondNumberPattern.matcher(input);
        if (!secondNumberMatcher.find())
            throw new IllegalArgumentException("Error! Coordinates only can be pair of number with separator \" \" or \",\", for example\"13 14\" or \"0,25\"");
        String yStr = input.substring(secondNumberMatcher.start(), secondNumberMatcher.end());
        int y = Integer.parseInt(yStr);

        return new Coords(x, y);
    }

    public static boolean isEqual(Coords coordsA, Coords coordsB) {
        return (coordsA.x == coordsB.x)
                && (coordsA.y == coordsB.y);
    }
}
