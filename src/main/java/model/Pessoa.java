package model;

import java.awt.Image;

public class Pessoa {

    private int id;
    private String nome;
    private String usuario;
    private String email;
    private Image imagem;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String usuario, String email, Image imagem) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.email = email;
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }
}
