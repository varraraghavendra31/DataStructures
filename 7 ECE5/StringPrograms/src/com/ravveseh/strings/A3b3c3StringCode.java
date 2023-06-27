package com.ravveseh.strings;

public class A3b3c3StringCode {
public static void main(String[] args) {
	String s="rrraaaggghhhavvv";
	System.out.println(compress(s));
}
public static String compress(String str){
    int cnt = 0;
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i <= str.length() - 1;i++){
        if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
            cnt++;
        }
        else{
            sb.append(str.charAt(i));
            if(cnt + 1 > 1){
                sb.append(cnt+1);
            }
            cnt = 0;
        }
    }

    return sb.toString();
}
}
