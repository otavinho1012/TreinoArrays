/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.exdefixacao;

import java.util.Date;

/**
 *
 * @author otavio.almeida
 */
public class Client {
    private String client;
    private String email;
    private Date birth;
    
    public Client(){
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    
    public Client(String client, String email,Date birth){
        this.client = client;
        this.email = email.concat(".com");
        this.birth = birth;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
