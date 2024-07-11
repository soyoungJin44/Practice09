package com.javaex.ex02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	//String[] sArray = a.split(" ");
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> friendsList = new  ArrayList<Friend>();
    
    	System.out.println("친구 3명을 등록해 주세요!");
    	
    	for(int i=0; i<3;i++) {
    	String max = sc.nextLine();
    	String[] sArray = max.split(" ");
    	
    	Friend f01  = new Friend(sArray[0],sArray[1],sArray[2]);
    	friendsList.add(f01);
    
    	}
    	for(int i=0;i<friendsList.size();i++) {
    		friendsList.get(i).draw();
    	}
    }

}
