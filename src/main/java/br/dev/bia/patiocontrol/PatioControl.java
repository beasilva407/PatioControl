import br.dev.bia.patiocontrol.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatioControl {

    public static List<Veiculo> veiculos;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            veiculos = new ArrayList<>();
            
            int opcao;
            
            do {
                System.out.println("------------------------------------------");
                System.out.println("          Controle de Veículos");
                System.out.println("------------------------------------------");
                System.out.println("10 - Incluir veículo");
                System.out.println("11 - Listar veículos");
                System.out.println("20 - Saída de veículo");
                System.out.println("21 - Relatório de veículos em Linha");
                System.out.println("30 - Entrada de veículo");
                System.out.println("31 - Relatório de veículos no pátio");
                System.out.println("99 - Sair");
                System.out.println("------------------------------------------");
                System.out.print("Digite a opção: ");
                
                opcao = Integer.parseInt(scanner.nextLine());
                
                switch (opcao) {
                    
                    case 10 -> incluirVeiculo(scanner);
                        
                    case 11 -> listarVeiculos();
                        
                    case 20 -> saidaVeiculo(scanner);
                        
                    case 21 -> relatorioLinha();
                        
                    case 30 -> entradaVeiculo(scanner);
                        
                    case 31 -> relatorioPatio();
                        
                    case 99 -> System.out.println("Sistema encerrado.");
                        
                    default -> System.out.println("Opção inválida!");
                }
                
            } while (opcao != 99);
        }
    }
    // O restante dos métodos entra aqui:
    // incluirVeiculo
    // listarVeiculos
    // buscarVeiculo
    // saidaVeiculo
    // entradaVeiculo
    // relatorioLinha
    // relatorioPatio
    // O restante dos métodos entra aqui:
    // incluirVeiculo
    // listarVeiculos
    // buscarVeiculo
    // saidaVeiculo
    // entradaVeiculo
    // relatorioLinha
    // relatorioPatio


    private static void listarVeiculos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private static void relatorioLinha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private static void relatorioPatio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}