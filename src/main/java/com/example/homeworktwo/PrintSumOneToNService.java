package com.example.homeworktwo;

import org.springframework.stereotype.Service;

@Service
public class PrintSumOneToNService extends NumbersService{
    public static String result(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i+1;
        }
        return String.valueOf(sum);
    }
}
