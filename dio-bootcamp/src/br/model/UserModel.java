package br.model;




import java.time.OffsetDateTime;

public class UserModel {
    private long id;
    private String nome, email;
    private OffsetDateTime aniversario;

    

    public UserModel(long id, String nome, String email, OffsetDateTime aniversario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public UserModel(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OffsetDateTime getAniversario() {
        return aniversario;
    }

    public void setAniversario(OffsetDateTime aniversario) {
        this.aniversario = aniversario;
    }

}
