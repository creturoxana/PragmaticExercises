package org.example;

public class ForExercises {

  void exercise1(int nr) {
    for (int i = nr; i <= 100; i++) {
      System.out.println(i + " ");
    }
  }

  public void exercise2(int nr) {
    for (int i = nr; i >= -100; i--) {
      System.out.println(i);
    }
  }

  public void exercise3(int x, int y) {
    for (int i = x; i <= y; i++) {
      System.out.println(i);
    }
  }

  public void exercise4(int x, int y) {
    if (x > y) {
      for (int i = y; i <= x; i++) {
        System.out.println(i);
      }
    } else {
      for (int i = x; i <= y; i++) {
        System.out.println(i);
      }
    }
  }

  public void exercise5() {
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  public void exercise6() {
    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }

  public void exercise7(int nr) {
    int sum = 0;
    for (int i = nr; i <= 100; i++) {
      sum += i;
    }
    System.out.println("Suma numerelor de la " + nr + " la 100 = " + sum);
  }

  public void exercise8(int nr) {
    int sum = 0;
    int j = 0;
    for (int i = nr; i <= 100; i++) {
      sum += i;
      j++;
    }
    System.out.println("Media aritmetica a numerelor de la " + nr + " la 100 = " + sum/j);
  }

  public void exercise9 () {
    for (int i = 1; i <= 7; i++){
      for( int j = i; j <= 7; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void geometricShape(){
    for (int i = 1; i <= 7; i++) {
      for (int j=1; j <=7-i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}
