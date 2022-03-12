package com.example.SpringInit.DataBase;

import com.example.SpringInit.Model.User;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static final Map <String, User> userMap = new HashMap<>();

    private DataBase() {
    }

    public static  Map <String, User>  getInstance () {
      return userMap;
    }
}
