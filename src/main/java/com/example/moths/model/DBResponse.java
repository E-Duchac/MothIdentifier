package com.example.moths.model;

import java.util.List;

public class DBResponse {
    private String message;
    private Moth moth;
    private List<Moth> mothList;

    public DBResponse() {
        super();
    }

    public DBResponse(String message) {
        this();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Moth getMoth() {
        return moth;
    }

    public void setMoth(Moth moth) {
        this.moth = moth;
    }

    public List<Moth> getMothList() {
        return mothList;
    }

    public void setMothList(List<Moth> mothList) {
        this.mothList = mothList;
    }
}
