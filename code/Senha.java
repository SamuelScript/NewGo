package code;

public class Senha {
    private String conteudo;
    public static Senha create(String senha_c) {
        Senha senha = null;
        if (Senha.validate(senha_c)) {
            senha = new Senha();
            System.out.println("ok");
        }
        return senha;
    }
    private static boolean validate(String senha) {
        boolean valida = true;
        valida = valida && (senha.length() >= 10 && senha.length() <= 30);
        valida = valida && (!senha.equals(senha.toLowerCase()));
        valida = valida && (!senha.equals(senha.toUpperCase()));
        valida = valida && (senha.matches("\\d"));
        return valida;
    }
    private static int passwordstrong(String senha) {
        int strong = 75;
        int length_weight = senha.length()/10;
        return strong;
    }
}
