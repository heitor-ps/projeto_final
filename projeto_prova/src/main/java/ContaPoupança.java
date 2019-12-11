
public abstract class ContaPoupança{

    /**
     * @return the titular_poupanca
     */
    private String titular_poupanca;
    private double saldo_poupanca = 0;
    private String agencia_poupanca;
    private String numero_poupanca;
    
    public String getTitular_poupanca() {
        return titular_poupanca;
    }

    /**
     * @param titular_poupanca the titular_poupanca to set
     */
    public void setTitular_poupanca(String titular_poupanca) {
        this.titular_poupanca = titular_poupanca;
    }

    /**
     * @return the saldo_poupanca
     */
    public double getSaldo_poupanca() {
        return saldo_poupanca;
    }

    /**
     * @param saldo_poupanca the saldo_poupanca to set
     */
    public void setSaldo_poupanca(double saldo_poupanca) {
        this.saldo_poupanca = saldo_poupanca;
    }

    /**
     * @return the agencia_poupanca
     */
    public String getAgencia_poupanca() {
        return agencia_poupanca;
    }

    /**
     * @param agencia_poupanca the agencia_poupanca to set
     */
    public void setAgencia_poupanca(String agencia_poupanca) {
        this.agencia_poupanca = agencia_poupanca;
    }

    /**
     * @return the numero_poupanca
     */
    public String getNumero_poupanca() {
        return numero_poupanca;
    }

    /**
     * @param numero_poupanca the numero_poupanca to set
     */
    public void setNumero_poupanca(String numero_poupanca) {
        this.numero_poupanca = numero_poupanca;
        
    }
    
    public void mostraSaldo(){
       System.out.println("Saldo atual da conta: $"+this.getSaldo_poupanca());
   }
   
   public void mostraAgencia(){
       System.out.println("Agencia atual: "+this.getAgencia_poupanca());
       
}
   public void mostraNumero(){
       System.out.println("Conta atual: "+this.getNumero_poupanca());
   }
   public void mostraTitular(){
       System.out.println("Titular da conta: "+this.getTitular_poupanca());
   }
   
   public void recuperaDadosParaImpressao(){
       this.mostraSaldo();
       this.mostraTitular();
       this.mostraAgencia();
       this.mostraNumero();
       
   }
   public abstract double depositar(double valor);
      
   
   public abstract double sacar(double valor);
   }
    
    

    
    

    

