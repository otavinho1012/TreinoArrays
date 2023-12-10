/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cumepassa.exdefixacao;

import static com.cumepassa.exdefixacao.Order.AddItem;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author otavio.almeida
 */
public class ExDeFixacao {

    public static void main(String[] args) throws ParseException {
        List<Client> cliente = new ArrayList<>(1);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        var input = new Scanner(System.in);
        Date birth = null;
        
        
        // Size é tipo um lenght para o Array só que serve para o array list 
        for(int i = 0; i < cliente.size(); i++){
            
            System.out.println("Olá Digite seu nome");
            String nome = input.nextLine();

            System.out.println("Digite seu email");
            String email = input.nextLine();
            
            System.out.println("Digite a data do seu aniversário");
            birth = format.parse(input.nextLine());
            
            var clientes = new Client(nome, email, birth);
        }
        
        System.out.println("Digite o estado do pedido");
        
        int status = input.nextInt();
        
        if(status == 1){
        }else{
            System.out.println("Burro");
            return;
        }
        
        System.out.println("Voce deseja comprar quantos produtos ?");
        
        int qtd = input.nextInt();
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o nome do produto");
            String nome = input.nextLine();
            
            System.out.println("Digite o preco");
            Double preco = input.nextDouble();
            
            System.out.println("Digite a quantidade");
            Integer qtdProd = input.nextInt();
            
            AddItem(nome, preco, qtdProd);
        }

    }
}
