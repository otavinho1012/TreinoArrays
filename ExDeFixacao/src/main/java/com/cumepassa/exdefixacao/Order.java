/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.exdefixacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author otavio.almeida
 */
public class Order {
    private Date moment = new Date();
    /* Pensamento errado, Geralmente quando eu tenho uma classe(objeto), tudo pode ser um tipo dela
    variavel, parametro, função, Arrays e entre outros
    */
    private OrderStatus status;
    
    List<Product> produto = new ArrayList<>();
    
    public Order(){
    }
    
    public static void AddItem(String nome,Double preco, Integer qtd){
         var itemPedido = new OrderItem(qtd,preco,nome,preco);
    }
    
    
     public void RemoveItem(){
         
    }
     
      public Double Total(){
          return 0.0;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    
} 
