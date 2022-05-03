package views;


import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- Folha de Pagamento -- \n");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Cadastrar Folha de Pagamento");
            System.out.println("3 - Consultar Folha de Pagamento");
            System.out.println("4 - Consultar Todas as Folhas de Pagamento");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                    break;
                case 2:
                    CadastrarFolhaPagamento cadastrarFolhaPagamento = new CadastrarFolhaPagamento();
                    cadastrarFolhaPagamento.renderizar();
                break;
                case 3:
                    ListarFolha listarFolha = new ListarFolha();
                    listarFolha.renderizar(listarFolha);
                break;
                case 4:
                    
                    break;                
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}
