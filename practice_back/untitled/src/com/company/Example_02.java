package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example_02 {
     public static void main(String[] args) {
         Map<String, ArrayList<String>> mainMap = new LinkedHashMap<>();
         ArrayList<String>sideArr = new ArrayList<>();


         sideArr.add("지우");
         sideArr.add("이슬이");
         sideArr.add("웅이");
         mainMap.put("트레이너", sideArr);

         sideArr =new ArrayList<>();
         sideArr.add("피카츄");
         sideArr.add("별가사리");
         sideArr.add("롱스톤");
         mainMap.put("01", sideArr);

         sideArr =new ArrayList<>();
         sideArr.add("브케인");
         sideArr.add("리아코");
         sideArr.add("마릴");
         mainMap.put("02", sideArr);

         sideArr =new ArrayList<>();
         sideArr.add("나무지기");
         sideArr.add("아차모");
         sideArr.add("물짱이");
         mainMap.put("03", sideArr);

         sideArr =new ArrayList<>();
         sideArr.add("이상해씨");
         sideArr.add("꼬북이");
         sideArr.add("잠맘보");
         mainMap.put("04", sideArr);

         sideArr =new ArrayList<>();
         sideArr.add("치코리타");
         sideArr.add("토게피");
         sideArr.add("우파");
         mainMap.put("05", sideArr);

         sideArr =new ArrayList<>();
         sideArr.add("가재군");
         sideArr.add("뷰티플라이");
         sideArr.add("코코파스");
         mainMap.put("06", sideArr);

         System.out.println(mainMap);

/*
  {트레이너=[지우, 이슬이, 웅이], 01=[피카츄, 별가사리, 롱스톤], 02=[브케인, 리아코, 마릴],
    03=[나무지기, 아차모, 물짱이], 04=[이상해씨, 꼬북이, 잠맘보], 05=[치코리타, 토게피, 우파], 06=[가재군, 뷰티플라이, 코코파스]}

 */
     }
}
