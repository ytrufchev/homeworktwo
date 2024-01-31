package com.example.homeworktwo;

public class PrintStringNTimesService extends NumbersService{
    public static String result(int n, String word){
        String res = "";
        for (int i = 0; i < n; i++) {
            res += word;
            if(i < n-1){
                res += " ";
            }
        }
        return res;
    }
}
