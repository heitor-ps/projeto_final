
import java.util.Scanner;
import java.util.Date;
public class TestaConta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int operation=0;
        int i=0;
        Scanner input = new Scanner(System.in);
              Conta teste = new Conta();
              Pile historico = new Pile();
             
       
        //Setando as informações e imprimindo o teste null
              
        System.out.println("Saldo atual da conta $"+teste.getSaldo());
        System.out.println("Conta atual: "+teste.getAgencia());
        System.out.println("Usuario atual: "+teste.getTitular());
        System.out.println("Insira os dados para continuar: ");
        
        System.out.println("Titular: ");
        String titular = input.nextLine();
        teste.setTitular(titular);
        System.out.println("Agência: ");
        String agencia = input.nextLine();
        teste.setAgencia(agencia);
        System.out.println("Conta: ");
        String numero = input.next();
        teste.setNumero(numero);
        System.out.println("Dados recebidos com sucesso!");
        
        
       //Menu de operações
       //While i<=15 define um limite de operações para o programa
       //Os if são as opções do menu em si
        while(i<=15){
          
            System.out.println("CC - Selecione a operação: "
                    + "1.Depósito  2.Saque  3.Extrato(Completo) 4.Ultimas Transações  5.Sair");
           int operacao = input.nextInt();
           
           if(numero != null){
           if(operacao==1){
               System.out.println("Insira o valor a ser depositado: ");
               double valor = input.nextDouble();
               if(valor>0){
               teste.depositar(valor);
               i++;
               }
               else System.out.println("Insira um valor válido.");
           }
           if(operacao==2){
               System.out.println("Insira o valor a ser sacado: ");
               double valor = input.nextDouble();
               if (valor > 0){
               teste.sacar(valor);
               i++;
               }
               else
               System.out.println("Insira um valor válido.");
              
           }
           if(operacao==3){
               teste.recuperaDadosParaImpressao();
               i++;
       
               }
           if(operacao==4){
               
           }
      
           if(operacao==5){
               System.out.println("Obrigado!");
              i = i + 999;
           }
        }
           else System.out.println("Operação inválida");        
            
            
}
}
}


