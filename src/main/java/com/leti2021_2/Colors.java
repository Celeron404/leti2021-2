package com.leti2021_2;

import com.diogonunes.jcolor.Attribute;

import java.lang.reflect.Field;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Colors {
    public static void main(String[] args) {
        System.out.println("This text will be default color");
        System.out.println(colorize("This text will be default color"));
        System.out.println(colorize("This text will be black", BLACK_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright black", BRIGHT_BLACK_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be blue", BLUE_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright blue", BRIGHT_BLUE_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be cyan", CYAN_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright cyan", BRIGHT_CYAN_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be green", GREEN_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright green", BRIGHT_GREEN_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be magenta", MAGENTA_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright magenta", BRIGHT_MAGENTA_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be red", RED_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright red", BRIGHT_RED_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be white", WHITE_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be bright white", BRIGHT_WHITE_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be yellow", YELLOW_TEXT(), BLACK_BACK()));
        System.out.println(colorize("This text will be yellow black", BRIGHT_YELLOW_TEXT(), BLACK_BACK()));

        /*
        System.out.println(colorize("This text will be ", ));
        System.out.println(colorize("This text will be bright ", BRIGHT_));
        */

         /*
         Class[] allClasses = Attribute.class.getClass();

         for (Class clazz : allClasses) {
             Field[] allFields = clazz.getFields();
             for (Field field : allFields) {
                 String fieldName = field.getName();
                 *//*
                 Здесь не вышло - надо делать обёртку для класса Attribute,
                 и писать в нём приведение Field или как-то иначе переопределить методы.
                  *//*
                 System.out.println(colorize(fieldName, field));
             }
         }
         */
    }
}
