/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.biblioteca.model;

/**
 *
 * @author correa_rafael
 */
public class Emprestimo {
    private int id;
    private String leitor;
    private String livro;
    private String data;
    private boolean devolvido;

    public Emprestimo(String leitor, String livro, String data) {
        this.leitor = leitor;
        this.livro = livro;
        this.data = data;
        this.devolvido = false;
    }

    public int getId() {
        return id;
    }

    public String getLeitor() {
        return leitor;
    }

    public String getLivro() {
        return livro;
    }

    public String getData() {
        return data;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emprestimo other = (Emprestimo) obj;
        return this.id == other.id;
    }
}
