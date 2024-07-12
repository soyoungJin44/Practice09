package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       ArrayList<Goods> GoodsList = new ArrayList<Goods>();
       
       Scanner sc = new Scanner(System.in);
       
       int sum = 0;
       
       
       System.out.println("상품을 입력해주세요(종료:q)");
       
       while(true) {
    	  
           String g1 = sc.nextLine();
           
           if(g1.equals("q")) {
    		   System.out.println("[입력완료]");
    		   System.out.println("============");
    		   break;
    	   }
           
           String[] sArray = g1.split(",");
           String name = sArray[0];
           int price = Integer.parseInt(sArray[1]);
           int count = Integer.parseInt(sArray[2]);
           
           Goods result = new Goods(name, price, count);
           GoodsList.add(result);
           
           sum += count;
           
       }
       for(int i=0; i<GoodsList.size();i++) {
    	   GoodsList.get(i).draw();
       }
       System.out.println("모든 상품의 갯수는 " + sum + "개 입니다!");
       
    	
    }

}
