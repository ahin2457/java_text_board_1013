package com.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int articleLastId = 0;

    System.out.println("== 텍스트 게시판 v 0.1 ==");

    while (true){
      System.out.printf("명령) ");
      String cmd = sc.nextLine();

      if(cmd.equals("/urs/article/write") ){
        System.out.print("제목 : ");
        String title =  sc.nextLine();

        System.out.print("내용 : ");
        String content = sc.nextLine();

        /*
        int id = articleLastId + 1;
        articleLastId = id; // articleLastId는 초기값 0이기 떄문에 id 값으로 갱신시켜줌
         */
        // 위 코드를 한줄로 줄이기

        // 전이증감 연산?
        //  선 증가시킨 값을 변수에다가 집어 넣은 다음에 그 값을 사용
        int id = ++articleLastId;

        Article article = new Article();
        article.id = id;
        article.title = title;
        article.content = content;

        System.out.println("생성된 게시물 객체 : " + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", article.id);

      }
      else if(cmd.equals("exit") ){
        System.out.println("== 자바 텍스트 게시판 종료 ==");
        break; // 반복문 빠져나오기
      }
      else if(cmd.equals("")){
        System.out.println("명령어를 입력해주세요.");
      }
      else{
        System.out.println("올바른 명령어가 아닙니다.");
      }

      System.out.printf("입력받은 명령어: %s\n",cmd);

    }


    sc.close();

  }
}

class Article {
  int id;
  String title;
  String content;

}
