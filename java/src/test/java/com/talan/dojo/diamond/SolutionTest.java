package com.talan.dojo.diamond;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("test letter A")
    void testA() {
        String[] expected = new String[]{"A"};
        Assertions.assertArrayEquals(expected, Solution.drawDiamond('A'));
    }


    @Test
    @DisplayName("test letter B")
    void testB() {
        String[] expected = new String[]{
                " A ",
                "B B",
                " A ",
        };
        Assertions.assertArrayEquals(expected, Solution.drawDiamond('B'));
    }

    @Test
    @DisplayName("test letter C")
    void testC() {
        String[] expected = new String[]{
                "  A  ",
                " B B ",
                "C   C",
                " B B ",
                "  A  ",
        };
        Assertions.assertArrayEquals(expected, Solution.drawDiamond('C'));
    }


    @Test
    @DisplayName("test letter D")
    void testD() {
        String[] expected = new String[]{
                "   A   ",
                "  B B  ",
                " C   C ",
                "D     D",
                " C   C ",
                "  B B  ",
                "   A   ",
        };
        Assertions.assertArrayEquals(expected, Solution.drawDiamond('D'));
    }

    @Test
    @DisplayName("test letter Z")
    void testZ() {
        String[] expected = new String[]{
                "                         A                         ",
                "                        B B                        ",
                "                       C   C                       ",
                "                      D     D                      ",
                "                     E       E                     ",
                "                    F         F                    ",
                "                   G           G                   ",
                "                  H             H                  ",
                "                 I               I                 ",
                "                J                 J                ",
                "               K                   K               ",
                "              L                     L              ",
                "             M                       M             ",
                "            N                         N            ",
                "           O                           O           ",
                "          P                             P          ",
                "         Q                               Q         ",
                "        R                                 R        ",
                "       S                                   S       ",
                "      T                                     T      ",
                "     U                                       U     ",
                "    V                                         V    ",
                "   W                                           W   ",
                "  X                                             X  ",
                " Y                                               Y ",
                "Z                                                 Z",
                " Y                                               Y ",
                "  X                                             X  ",
                "   W                                           W   ",
                "    V                                         V    ",
                "     U                                       U     ",
                "      T                                     T      ",
                "       S                                   S       ",
                "        R                                 R        ",
                "         Q                               Q         ",
                "          P                             P          ",
                "           O                           O           ",
                "            N                         N            ",
                "             M                       M             ",
                "              L                     L              ",
                "               K                   K               ",
                "                J                 J                ",
                "                 I               I                 ",
                "                  H             H                  ",
                "                   G           G                   ",
                "                    F         F                    ",
                "                     E       E                     ",
                "                      D     D                      ",
                "                       C   C                       ",
                "                        B B                        ",
                "                         A                         "
        };
        Assertions.assertArrayEquals(expected, Solution.drawDiamond('Z'));
    }



}
