public class introduction { // {} esse corpo é da classe
    // void = não retorna nada
    // main = nome do metodo
    // () = parametro, [] = array, args = parametros ou argumentos
    public static void main (String [] args) { // {} esse corpo é do método

        // System.out.print ("Hello World!");
        // String meuNome = "Daniel";

        // int anoFabricacao = 2024;
 
        // boolean verdadeira = false;

        // anoFabricacao = 2018;

        String primeiroNome = "Daniel";
        String segundoNome = "Oliveira";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}


