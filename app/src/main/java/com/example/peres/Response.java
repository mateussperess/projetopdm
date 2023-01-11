package com.example.peres;

public class Response {

    private Requisition requisition;

    private User user;

    private Propertie propertie;


    public Response(Requisition requisition, User user) {
        this.requisition = requisition;
        this.user = user;
    }

    public Requisition getRequisition() {
        return requisition;
    }

    public User getUser() {
        return user;
    }
}
