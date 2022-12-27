package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example_03 {
    public static void main(String[] args) {
        Map<String, String> basicMap = new HashMap<>();

        basicMap.put("지우", "피카츄");
        basicMap.put("이슬이", "꼬북이");
        basicMap.put("웅이", "롱스톤");

        System.out.println(basicMap);

    /*
        {웅이=롱스톤, 지우=피카츄, 이슬이=꼬북이}
     */

        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("지우", "피카츄");
        linkedMap.put("이슬이", "꼬북이");
        linkedMap.put("웅이", "롱스톤");

        System.out.println(linkedMap);

        /*
             {지우=피카츄, 이슬이=꼬북이, 웅이=롱스톤}
         */
    }
}
