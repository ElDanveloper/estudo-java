public class TiposVariaveis {
    public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, precisa terminar com L
		float pi = 3.14F; // float tem que ter F no final
		double salario = 1275.33;

    //variaveis podem receber novos parametros
    int numero = 5;
    numero = 10;
    System.out.print(numero);


    //constante que não varia: "final", a variavel tem que ser escrita em caixa alta
    final double VALOR_DE_PI = 3.14;


	}
}
