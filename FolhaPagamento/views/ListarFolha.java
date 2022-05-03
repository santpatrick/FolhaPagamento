package views;

import controllers.FolhaController;
import models.Folha;


public class ListarFolha {
    

    public void renderizar(){
        FolhaController folhaController = new FolhaController();      
        System.out.println("\n Lista Folha de Pagamentos \n");
        for (Folha folhaCadastrada : folhaController.listar()) {
            System.out.println(folhaCadastrada);
        }
        
    }
}

   

