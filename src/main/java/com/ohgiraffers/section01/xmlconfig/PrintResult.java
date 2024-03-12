package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {

    /* 필기.
        사용자-> 인포직원 -> 청소업체
        요청의 결과 <-   <-
     */


    public void printMenuList(List<MenuDTO> menuList) {

        System.out.println("전체 메뉴 조회의 결과는!!!");
        for(MenuDTO menu : menuList) {

            System.out.println(menu);
        }

    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴조회를 실패했습니다..."; break;
            case "selectOne" : errorMessage = "메뉴 코드로 메뉴 조회를 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }

    public void printMenu(MenuDTO menu) {

        System.out.println(menu);
    }



}
