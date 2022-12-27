package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example_01 {
    public static void main(String[] args) {

        boolean isNonAdult = true;

        Map<String, Map<String, String>>mainMap = new LinkedHashMap<>();
        Map<String, String> sideMap = new LinkedHashMap<>();

        if(isNonAdult) { //미성년자
            mainMap.put("01", sideMap);
            sideMap.put("지우", "피카츄");
            sideMap.put("이슬이", "별가사리");
            sideMap.put("웅이", "롱스톤");

            sideMap = new LinkedHashMap<>();
            mainMap.put("02", sideMap);
            sideMap.put("지우", "브케인");
            sideMap.put("이슬이", "리아코");
            sideMap.put("웅이", "마릴");

            sideMap = new LinkedHashMap<>();
            mainMap.put("03", sideMap);
            sideMap.put("지우", "나무지기");
            sideMap.put("이슬이", "아차모");
            sideMap.put("웅이", "물짱이");
        } else {
            mainMap.put("01", sideMap);
            sideMap.put("지우", "이상해씨");
            sideMap.put("이슬이", "꼬북이");
            sideMap.put("웅이", "디그닥");

            sideMap = new LinkedHashMap<>();
            mainMap.put("02", sideMap);
            sideMap.put("지우", "치코리타");
            sideMap.put("이슬이", "토게피");
            sideMap.put("웅이", "우파");

            sideMap = new LinkedHashMap<>();
            mainMap.put("03", sideMap);
            sideMap.put("지우", "가재군");
            sideMap.put("이슬이", "뷰티플라이");
            sideMap.put("웅이", "잠만보");
        }

        System.out.println(mainMap);
    }

}
/*
  isNonAdult 가 참일 경우, 미성년자인 경우
  {01={지우=피카츄, 이슬이=별가사리, 웅이=롱스톤}, 02={지우=브케인, 이슬이=리아코, 웅이=마릴}, 03={지우=나무지기, 이슬이=아차모, 웅이=물짱이}}

  isNonAdult 가 거짓 인경우, 성인인 경우
  {01={지우=이상해씨, 이슬이=꼬북이, 웅이=디그닥}, 02={지우=치코리타, 이슬이=토게피, 웅이=우파}, 03={지우=가재군, 이슬이=뷰티플라이, 웅이=잠만보}}
 */
