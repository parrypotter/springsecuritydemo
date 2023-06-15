package com.example.springsecuritydemo2.security.valication;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserLogin {

    @NonNull
    private String username;

    @NonNull
    private String password;

}
