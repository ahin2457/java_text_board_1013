package com.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("== 텍스트 게시판 v 0.1 ==");
    System.out.println("프로그램 시작");

    while (true){
      System.out.printf("명령) ");
      String cmd = sc.nextLine();

      if(cmd.equals("/urs/article/write") ){
        System.out.print("제목 : ");
        String title =  sc.nextLine();

        System.out.print("내용 : ");
        String content = sc.nextLine();

        int id = 1;

        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);

        // break; // 반복문 빠져나오기
      }
      else if(cmd.equals("exit") ){
        System.out.println("== 자바 텍스트 게시판 종료 ==");
        break; // 반복문 빠져나오기
      }
      else{
        System.out.println("올바른 명령어가 아닙니다.");
      }

      System.out.printf("입력받은 명령어: %s\n",cmd);

    }


    sc.close();



    //System.out.println("프로그램 끝");
    //System.out.println("== 게시판을 종료합니다 ==");
  }
}