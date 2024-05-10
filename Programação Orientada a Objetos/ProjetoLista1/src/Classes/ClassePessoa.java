package Classes;

/**
 *
 * author Alek
 */
public class ClassePessoa {
    // Atributos
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    
    // Construtores
    public ClassePessoa(){
    }
    
    public ClassePessoa(String nome, String endereco, String email, String telefone){
        // Verifica se o email é válido antes de atribuir
        if (isValidEmail(email)) {
            this.nome = nome;
            this.endereco = endereco;
            this.email = email;
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Email inválido!");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Verifica se o email é válido antes de atribuir
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido!");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Verifica se o email é válido
    private boolean isValidEmail(String email) {
        // Lógica de verificação de email (pode ser mais complexa)
        return email.contains("@") && email.contains(".");
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + 
                "\nEndereço: " + endereco + 
                "\nEmail: " + email + 
                "\nTelefone: " + telefone;
    }
}
