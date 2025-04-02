package com.sbs.exam.board;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int lastArticleId = 0;
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("=== 텍스트 게시판 v 0.1==");
    System.out.println("프로그램 시작");


    while (true) {
      System.out.printf("명령) ");
      String cmd = sc.nextLine();

      if (cmd.equals("/usr/article/write")){
        System.out.println("=== 게시물 작성 ===");
        System.out.printf("제목) ");
        String title = sc.nextLine();

        System.out.printf("내용) ");
        String body = sc.next();

        int id = ++lastArticleId;
        System.out.printf("%s번 게시물이 생성 되었습니다.\n", id);

      }else if (cmd.equals("exit")) {
        System.out.println("=== 게시판을 종료합나디 ===");
        break;
      }
    }
   sc.close();
  }
}