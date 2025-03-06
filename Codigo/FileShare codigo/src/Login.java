public class Login {
    // Atributos
    private String email;
    private String senha;
    private String infoSeguranca;

    // Construtor
    public Login(String email, String senha, String infoSeguranca) {
        this.email = email;
        this.senha = senha;
        this.infoSeguranca = infoSeguranca;
    }

    // Métodos

    // Método para criptografar a senha
    public String criptografar() {
        // Implementação simples de criptografia (exemplo básico)
        // Em uma implementação real, você utilizaria bibliotecas como javax.crypto para criptografar a senha
        StringBuilder criptografada = new StringBuilder();
        for (int i = 0; i < senha.length(); i++) {
            criptografada.append((char)(senha.charAt(i) + 3));  // Shift simples de Caesar (shift de 3 posições)
        }
        return criptografada.toString();
    }

    // Método para descriptografar a senha
    public String descriptografar() {
        // Desfaz o processo de criptografia simples
        StringBuilder descriptografada = new StringBuilder();
        for (int i = 0; i < senha.length(); i++) {
            descriptografada.append((char)(senha.charAt(i) - 3));  // Shift de 3 posições (operação inversa)
        }
        return descriptografada.toString();
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getInfoSeguranca() {
        return infoSeguranca;
    }

    public void setInfoSeguranca(String infoSeguranca) {
        this.infoSeguranca = infoSeguranca;
    }
}
