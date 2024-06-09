public class Main {
    public static void main(String[] args) {
        String nome;
        String sobrenome;

        nome = "Victor";
        sobrenome = "Silva";

        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        System.out.println("Olá, meu nome é " + nomeCompleto);
    }
}