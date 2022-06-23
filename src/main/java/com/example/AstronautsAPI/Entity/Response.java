package com.example.AstronautsAPI.Entity;

public class Response {

    private String message;
    private int code;

    public Response() {
        this.message = "Error";
        this.code = 404;
    }

    public Response (String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getResponse() {
        return "Error";
    }
}
