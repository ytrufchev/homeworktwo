package com.example.homeworktwo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrintOneToNService extends NumbersService{

    public static String result(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += i+1;
            if(i < n-1){
                result += ", ";
            }
        }
        return result;
    }
}
