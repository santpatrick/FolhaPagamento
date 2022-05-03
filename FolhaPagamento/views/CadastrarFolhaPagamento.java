package views;

import controllers.FolhaController;

import models.Folha;

import utils.Console;

public class CadastrarFolhaPagamento {

    public void renderizar(){
        Folha folha = new Folha();   
        FolhaController folhaController = new FolhaController();
        System.out.println("\n Folha de Pagamentos \n");
        folha.setCpf(Console.readString("Digite o CPF do funcionário: "));        
        folhaController.cadastrar(folha);
        folha.setMes(Console.readInt("Digite o Mes da Folha de Pagamento: "));        
        folhaController.cadastrar(folha);
        folha.setAno(Console.readInt("Digite o Ano da Folha de Pagamento:  "));        
        folhaController.cadastrar(folha);
        folha.setHoras(Console.readInt("Digite a Quantidade de Horas Trabalhadas"));
        folhaController.cadastrar(folha);        
        folha.ValorH(Console.readDouble("Digite o valor: "));        
        folhaController.cadastrar(folha);
        System.out.println("Folha da Pagamentos Cadastrada");
    }

}
