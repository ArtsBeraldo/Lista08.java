package PooAtividade;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	static Scanner ler = new Scanner(System.in);
	static ArrayList<Empregado> empregados = new ArrayList<Empregado>();
	
	public static void main(String[] args) {
        boolean sair = false;
        
        while(! sair){
            System.out.println("Menu:");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = ler.nextInt();
            
            switch(opcao){
                case 1:
                	Empregado novoEmpregado = new Empregado();
                    System.out.println();     
                    System.out.print("Digite o nome do empregado: ");
                    ler.nextLine();
    	            String nome = ler.nextLine();
    	               
    	            System.out.print("Digite a idade do empregado: ");
    	            int idade = ler.nextInt();
    	                
    	            System.out.print("Digite o salário do empregado: ");
    	            double salario = ler.nextDouble();
    	                
    	            novoEmpregado.setNome(nome);
    	            novoEmpregado.setIdade(idade);
    	            novoEmpregado.setSalario(salario);
                    empregados.add(novoEmpregado);
                    System.out.println();
                     break;
                case 2:
                	System.out.println();
                    System.out.print("Digite o ID: ");
                    int idcase1 = ler.nextInt();
                    empregados.get(idcase1 - 1).promover();
                    System.out.println("Empregado " + empregados.get(idcase1 - 1).getNome() + " foi promovido!");
                    System.out.println();
                    break;
                case 3:
                	System.out.println();
                    System.out.print("Digite o ID: ");
                    int idcase2 = ler.nextInt();
                    System.out.println();
                    System.out.print("Digite a porcentagem do aumento: ");
                    double aumento = ler.nextDouble();
                    System.out.println();
                    empregados.get(idcase2 - 1).aumentarSalario(aumento);
                    System.out.println("Salário atual: R$" + empregados.get(idcase2 - 1).getSalario());
                    System.out.println();
                    break;
                case 4:
                	System.out.println();
                    System.out.print("Digite o ID: ");
                    int idcase4 = ler.nextInt();
                    System.out.println("Digite número correspondente o motivo: ");
                    System.out.println("1: Justa causa.");
                    System.out.println("2: Decisão do empregador.");
                    System.out.println("3: Aposentadoria.");
                    int motivo = ler.nextInt();
                    empregados.get(idcase4 - 1).demitir(motivo);
                    System.out.println();
                    break;
                case 5: 
                	System.out.println();
                    System.out.print("Digite o ID: ");
                    int idcase5 = ler.nextInt();
                    
                    empregados.get(idcase5 - 1).fazerAniversario();
                    System.out.println(empregados.get(idcase5 - 1).getNome() + " tem " + empregados.get(idcase5 - 1).getIdade() + " anos");
                    System.out.println();
                    break;
                case 6:
                	System.out.println();
                    listaEmpregados();
                    System.out.println();
                    break;
                case 7:
                    sair = true;
                    break;
            }
        }
    }
    public static void listaEmpregados(){
        for(int i = 0; i < empregados.size(); i++){
            System.out.println("Empregado: ID - " + (i+1));
            empregados.get(i).status();
        }
    }
}