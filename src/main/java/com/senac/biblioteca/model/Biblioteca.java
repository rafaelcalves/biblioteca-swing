/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author correa_rafael
 */
public class Biblioteca {
    private final String nome;
    private final List<Livro> livros;
    private int idCounter = 0;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }
    
    public void addLivro(Livro livro){
        livro.setId(++this.idCounter);
        this.livros.add(livro);
    }
    
    public void editLivro(Livro livro){
        if(livro.getId()> 0){
            int index = this.livros.indexOf(livro);
            if(index >= 0)
                this.livros.set(index, livro);
        } else {
            addLivro(livro);
        }
    }
    
    public void removeLivro(Livro livro){
        this.livros.remove(livro);
    }

    public List<Livro> findLivro(String titulo, String autor, String categoria){
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : this.livros) {
            if(livro.getTitulo().equals(titulo))
                resultado.add(livro);
            else if(livro.getAutor().equals(autor))
                resultado.add(livro);
            else if(livro.getCategoria().equals(categoria))
                resultado.add(livro);
        }
        return resultado;
    }
    
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
