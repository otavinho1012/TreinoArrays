/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.exdefixacao;

/**
 *
 * @author otavio.almeida
 */

public class Product {
        public String name;
        public Double price;
        
        
  public Product(){
  }
  
  public Product(String name,Double price){
      this.name = name;
      this.price = price;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
  

  
}
