/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cumepassa.exdefixacao;

/**
 *
 * @author otavio.almeida
 */
public class OrderItem {
    private Integer quantidade;
    private Double price;
    
    
    public OrderItem(){
    }
    
    public OrderItem(Integer quantidade, Double price,String item, Double preco){
        this.quantidade = quantidade;
        this.price =  price;
        var produto = new Product(item,preco);
    }
    /*Nesse caso aqui, Métodos estáticos pertencem à classe, 
    não a uma instância específica da classe2. 
    Isso significa que eles podem ser chamados sem criar uma instância da classe. 
    No entanto, as variáveis de instância (quantidade e price neste caso) 
    pertencem a uma instância específica da classe.
    Portanto, elas não estão disponíveis 
    diretamente dentro de um método estático1*/
    public static Double subTotal(Integer quantidade, Double price){
        Double conta = quantidade * price;
    return conta;
    }
}
