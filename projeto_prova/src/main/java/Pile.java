
public class Pile {
    Object[] pilha;
    int inicio = -1;
    int posicaoPilha;
    int tamanhoPilha;
    int i = 0;
    String sentence[];
    char[] converted;
    
    public Pile(){
        this.posicaoPilha = -1;
        this.pilha = new Object[30];
    }
  public void stringToArray(String sentence){
        
        if(this.posicaoPilha<=0){        
        while(i<sentence.length()){             
        this.pilha[++this.posicaoPilha] = sentence.charAt(i);
        i++;
       

        }
        
        }else System.out.println("Impossível fazer inserção");
    }
    public boolean isVazio(){
        if(this.posicaoPilha == -1){
            return true;
        }
        
        else return false;
    }
    
    public int tamanho(){
        if (this.isVazio()==true){
            return 0;
            
        }
        return this.posicaoPilha++;
    }
    public void push(Object valor){
        if (this.posicaoPilha < this.pilha.length - 1){
            this.pilha[++this.posicaoPilha] = valor;
        }
    }
    public Object pop(){
        if(isVazio()==true){
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
    public void exibeValores(){
        while(isVazio()==false)
            System.out.print(pop());
    }
    public void mostraElemento(){
        System.out.print(pilha[posicaoPilha]);
    
}
           public void buscaDelimitador(String expression){
         int j = 0;
         while(j<=expression.length()){
             if(expression.charAt(j)=='{' || expression.charAt(j) == '[' ||
                     expression.charAt(j) == '(' || expression.charAt(j) == ')'||
                             expression.charAt(j) == ']' || expression.charAt(j) == '}'){
             this.push(expression.charAt(j));
                      }
         }
         
     }
}