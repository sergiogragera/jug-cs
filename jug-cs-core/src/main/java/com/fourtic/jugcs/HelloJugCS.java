package com.fourtic.jugcs;

public class HelloJugCS {
  public static void main(String[] args) {
    System.out.println("¡¡Hola JUG-CS!!");

    for (String arg : args) {
      System.out.println(String.format("%s de tipo %s", arg, arg.getClass()));
    }
  }
}
