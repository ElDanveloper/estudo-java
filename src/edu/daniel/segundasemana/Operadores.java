public class Operadores {
    public static void main (String[] args){
        
    //classe Operadores.java
    String nome = "GLEYSON";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();



    //classe Operadores.java
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    // Exemplo de operação booleana
    int a, b;
    a = 5;
    b = 6;

    String resultado = "";

    if(a==b)
      resultado = "verdadeiro";
    else  
      resultado = "falso";

    System.out.println(resultado);

    // OU se for igual verdadeiro, se não falso

    // String resultado = a==b ? "verdadeiro" : "falso";
    // System.out.println(resultado);
    

    //Validando condições
    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2){
      System.out.println("as duas condições são verdadeiras");

    } else{
      System.out.println("as duas condições são falsas");
    }
    // OU
    if (condicao1 || condicao2){
      System.out.println("as duas condições é verdadeira");

    }
}
