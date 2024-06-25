public class MinhaClasse {
    
    public static void main(String[] args) {
        String primeiroNome = "Carolina";
        String segundoNome = "Vitório";
        
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "O resultado do método criado é: " + primeiroNome.concat(" ").concat(segundoNome);
    
    }
}

//as classes armazenam os metodos do codigo, é composta 99% por "public" sua nomenclatura sempre se inicia com letra maiúscula
// ex public class Calculadora e se for palavras compostas sempre a primeira letra será maiuscula "CalculadoraCientfica"

//os metodos são compostos por argumentos que a classe executará, ao contrário de uma classe o método é inicado
// por letra minuscula metodo, e se for composta a segunda palavra será maiuscula meuMetodo 
//  