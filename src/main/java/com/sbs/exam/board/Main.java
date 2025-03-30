package com.sbs.exam.board;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("=== 텍스트 게시판 v 0.1==");
    System.out.println("프로그램 시작");

    System.out.printf("명령) ");
    String cmd = sc.nextLine();

    System.out.printf("입력받은 명령어 : %s\n", cmd);


    System.out.println("프로그램 끝");
    System.out.println("=== 게시판을 종료합나디 ===");
    }

}