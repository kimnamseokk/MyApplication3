package com.example.user.myapplication3;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2017-11-30.
 */

public class RegisterRequester extends StringRequest{

    final static private String URL = "http://34.209.150.15:3000/Register.php";
    private Map<String, String> parameters;

    public RegisterRequester(String userID, String userPassword, String userName, int userPhone, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userPhone", userPhone + "");
    }
    @Override
    public  Map<String, String> getParams(){
        return parameters;
    }
}
