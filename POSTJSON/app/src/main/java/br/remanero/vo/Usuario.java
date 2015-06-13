package br.remanero.vo;

/**
 * Created by renato.002227 on 29/05/2015.
 */
public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }
}
