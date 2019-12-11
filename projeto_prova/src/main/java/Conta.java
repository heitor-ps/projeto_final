

import java.util.Date;

public class  Conta {
    
    //variáveis
    
   private String titular;
   private double saldo = 0;
   private String agencia;
   private String numero;
 
   //Gets e Sets
   
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
   public double getSaldo(){
       return saldo;
   }
   public void setNumero(String numero){
       this.numero = numero;
     
   }
   public String getNumero(){
       return numero;
   }
   public void setAgencia(String agencia){
       this.agencia=agencia;
   }
   public String getAgencia(){
       return agencia;
   }
   public void setTitular(String titular){
         this.titular = titular;
     }
   public String getTitular(){
       return titular;
   }
   
      
   //Métodos
   
   public void mostraSaldo(){
       System.out.println("Saldo atual da conta: $"+this.saldo);
   }
   
   public void mostraAgencia(){
       System.out.println("Agencia atual: "+this.getAgencia());
       
}
   public void mostraNumero(){
       System.out.println("Conta atual: "+this.getNumero());
   }
   public void mostraTitular(){
       System.out.println("Titular da conta: "+this.getTitular());
   }
   public double depositar(double valor){
       System.out.println("Insira o valor para depósito: ");
       double novoSaldo = this.saldo + valor;
       this.setSaldo(novoSaldo);
       this.saldo = novoSaldo;
       System.out.println("Operação Concluída com Sucesso!");
       return novoSaldo;
   }
   public double sacar(double valor){
       
       
       if(valor<=this.saldo){
       double novoSaldo = this.saldo - valor;
       this.saldo = novoSaldo;
       System.out.println("Operação Concluída com Sucesso!");
       }
       else
           System.out.println("Saldo insuficiente.");
       
       return 0;
   }
  
   public void recuperaDadosParaImpressao(){
       this.mostraSaldo();
       this.mostraTitular();
       this.mostraAgencia();
       this.mostraNumero();
   }
 

   
 
}
