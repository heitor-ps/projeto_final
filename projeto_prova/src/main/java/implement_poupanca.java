
public class implement_poupanca extends ContaPoupança{
    @Override
    public double depositar(double valor){
         System.out.println("Insira o valor para depósito: ");
       double novoSaldo = getSaldo_poupanca() + valor;
       this.setSaldo_poupanca(novoSaldo);
       
       System.out.println("Operação Concluída com Sucesso!");
       return getSaldo_poupanca();
    }
    
    @Override
    public double sacar(double valor){
        
       if(valor<=this.getSaldo_poupanca()){
       double novoSaldo = getSaldo_poupanca() - valor;
       this.setSaldo_poupanca(novoSaldo);
       System.out.println("Operação Concluída com Sucesso!");
       }
       else
           System.out.println("Saldo insuficiente.");
       
       return 0;
   }
    }
    

