package com.company;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte[] arrayByte = {
                123, 34, 104, 111, 98, 98, 105, 101, 115, 34, 58, 91, 34, 112, 114, 111, 103, 114, 97, 109, 109, 105, 110, 103, 34, 44, 34, 102, 111, 111, 116, 98, 97, 108, 108, 34, 93, 44, 34, 110, 97, 109, 101, 34, 58, 34, 105, 115, 104, 105, 107, 97, 119, 97, 34, 44, 34, 97, 103, 101, 34, 58, 51, 52, 125
        };
        String message =  new String(arrayByte);
        System.out.println(message);

        HashMap map = new HashMap();
        map.put("name", "ishikawa");
        map.put("age", 34);
        map.put("hobbies", List.of("programming", "baseball"));
        Gson gson = new Gson();
        String s = gson.toJson(map);
        System.out.println(s);
    }
}
