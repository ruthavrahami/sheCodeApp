package com.example.sheCodeApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class User {

    private final UUID id;

    @NotBlank
    private final String username;
    private final String password;
    private final String email;
    private final String YouthMovement;
    private final String place;
    private final String status;

    public User(@JsonProperty("id") UUID id,
                @JsonProperty("username") String username,
                @JsonProperty("password") String password,
                @JsonProperty("email") String email,
                @JsonProperty("youthMovement") String youthMovement,
                @JsonProperty("place") String place,
                @JsonProperty("status") String status){
        this.email = email;
        this.id = id;
        this.password = password;
        this.place = place;
        this.username = username;
        this.YouthMovement = youthMovement;
        this.status = status;
    }

    public UUID getId(){
        return id;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getYouthMovement() {
        return YouthMovement;
    }

    public String getPlace() {
        return place;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status + '\'' +
                ", place =" + place + '\'' +
                ", youthMovement= " + YouthMovement + '\'' +
                '}';
    }
}
