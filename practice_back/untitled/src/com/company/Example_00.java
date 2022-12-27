package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example_00 {

    public static  void main(String[] args) {
        Map<String, Map<String, String>>testMap1 = new LinkedHashMap<>();
        Map<String, String>testMap2 = new LinkedHashMap<>();

        testMap1.put("01", testMap2);
        testMap2.put("지우", "피카츄");
        testMap2.put("이슬이", "별가사리");
        testMap2.put("웅이", "롱스톤");


        testMap2 = new LinkedHashMap<>();
        testMap1.put("02", testMap2);
        testMap2.put("지우", "브케인");
        testMap2.put("이슬이", "리아코");
        testMap2.put("웅이", "마릴");


        testMap2 = new LinkedHashMap<>();
        testMap1.put("03", testMap2);
        testMap2.put("지우", "나무지기");
        testMap2.put("이슬이", "아차모");
        testMap2.put("웅이", "물짱이");



        System.out.println("---------------------------------------------------------");

        Map<String, String> poketMon = new HashMap<>();
        poketMon = testMap1.get("01");
        ArrayList<String> memo = new ArrayList<>();
        for( Map.Entry<String, String> entry : poketMon.entrySet()) {
            String checkPoint = "";
            checkPoint = (String)(entry.getKey() + " : " + entry.getValue());
            memo.add(checkPoint);
        }
        System.out.println(memo);
        System.out.println(memo.get(0));
        System.out.println(memo.get(1));
        System.out.println(memo.get(2));
	}
}

