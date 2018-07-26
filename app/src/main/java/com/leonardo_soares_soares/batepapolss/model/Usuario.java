package com.leonardo_soares_soares.batepapolss.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.leonardo_soares_soares.batepapolss.config.ConfiguracaoFireBase;

/**
 * Created by Leonardo Soares on 17/07/18.
 * leonardo_soares_santos@outlook.com
 */
public class Usuario {

    private String id, nome, email, senha;


    public Usuario() {


    }

    public void salvar() {

        DatabaseReference referenceFireBase = ConfiguracaoFireBase.getFireBase();
        referenceFireBase.child("usuarios").child(getId()).setValue(this);

    }

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
