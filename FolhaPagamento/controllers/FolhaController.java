
package controllers;
import java.util.ArrayList;

import models.Folha;

public class FolhaController {

    
    private static ArrayList<Folha> folha = new ArrayList<Folha>();

    public void cadastrar(Folha folha) {
        folha.add(folha);
    }

    public ArrayList<Folha> list() {
        return folha;
    }
    
    public Folha buscarCpf(String cpf){
        for (Folha folhaCadastrada : folha) {
            
            if(folhaCadastrada.getCpf().equals(cpf)){
                return folhaCadastrada;
            }
        }
        return null;  
      }
        public Folha Mes(int mes){
            for (Folha folhaCadastrada : folha) {
                if(folhaCadastrada.getMes() == (mes)){
                    return folhaCadastrada;
                    }
                }
            
            return null;    }
            public Folha Ano(int ano){
                for (Folha folhaCadastrada : folha) {
                    if(folhaCadastrada.getAno() == (ano)){
                        return folhaCadastrada;
                    }   
                }
                return null; 
               }
               public Folha Valor(int valor){
                for (Folha folhaCadastrada : folha) {
                    if(folhaCadastrada.isValor() == (valor)){
                        return folhaCadastrada;
                    }   
                }
                return null;
            } 

                public Folha Horas(int horas){
                    for (Folha folhaCadastrada : folha) {
                        if(folhaCadastrada.getHoras() == (horas)){
                            return folhaCadastrada;
                        }   
                    }
                        return null;   
            }

        public static void getCpf(String readString) {
    }

    public Folha[] listar() {
        return null;
    }

    
    

    
}