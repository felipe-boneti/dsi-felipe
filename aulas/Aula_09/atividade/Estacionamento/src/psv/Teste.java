/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class Teste {
    public static void main(String[] args) {
        //ABRINDO A CONEXÃO
        Connection con = Conexao.abrirConexao();
        
        //CRIANDO OS OBJETOS
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        //MÉTODO DE INSERIR REGISTROS NO BANCO
//        cb.setPlaca("FZL2022");
//        cb.setCor("Preto");
//        cb.setDescricao("Carro 2");
//        
//        System.out.println(cd.Inserir(cb));
        
        //MÉTODO DE EDITAR REGISTROS NO BANCO
        /*cb.setPlaca("JKK1900");
        cb.setCor("Roxo");
        cb.setDescricao("Carro 5");
        System.out.println(cd.alterar(cb));*/
        
        //MÉTODO DE EXCLUIR REGISTROS NO BANCO
        /*cb.setPlaca("JKK1900");
        System.out.println(cd.excluir(cb));*/
        
        //MÉTODO DE LISTAR REGISTROS NO BANCO
        /*List<CarroBean> lista = cd.listarTodos();
        
        if(lista != null){
            for(CarroBean carro : lista){
                System.out.println("Placa: "+carro.getPlaca());
                System.out.println("Cor: "+carro.getCor());
                System.out.println("Descrição:"+carro.getDescricao());
            }
        }*/
    }
   
}
