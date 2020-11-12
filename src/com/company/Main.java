package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s="Let's take LeetCode contest";
        StringBuilder sb = new StringBuilder();
        StringBuilder r = new StringBuilder();
        char[] ss=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (ss[i] != ' ' ) {
                sb.append(ss[i]);
            } else {
                r.append(sb.reverse().toString());
                r.append(" ");
                 //r.append(reverse(sb.toString()));
                sb.setLength(0);
            }
            if (i == s.length() - 1) {
                r.append(sb.reverse().toString());
            }
        }
        System.out.println(r.toString());

    }

    public static String reverse(String s) {
        StringBuilder r = new StringBuilder();
        char [] ss=s.toCharArray();
        for (int i = s.length()-1; i>=0 ; i++) {
            r.append(ss[i]);
        }
        return r.toString();
    }
}
