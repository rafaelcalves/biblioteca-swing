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
    private final List<Emprestimo> emprestimos;
    private int idCounter = 0;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }
    
    public void addEmprestimo(Emprestimo emprestimo){
        emprestimo.setId(++this.idCounter);
        this.emprestimos.add(emprestimo);
    }
    
    public void editEmprestimo(Emprestimo emprestimo){
        if(emprestimo.getId()> 0){
            int index = this.emprestimos.indexOf(emprestimo);
            if(index >= 0)
                this.emprestimos.set(index, emprestimo);
        } else {
            addEmprestimo(emprestimo);
        }
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
    
    public Livro getLivroByID(int id){
        int index = this.livros.indexOf(new Livro(id));
        return this.livros.get(index);
    }

    public List<Livro> findLivro(String titulo, String autor, String categoria){
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : this.livros) {
            if(livro.isDisponivel()){
                if(!titulo.isEmpty() && livro.getTitulo().toUpperCase().contains(titulo.toUpperCase()))
                    resultado.add(livro);
                else if(!autor.isEmpty() && livro.getAutor().toUpperCase().contains(autor.toUpperCase()))
                    resultado.add(livro);
                else if(!categoria.isEmpty() && livro.getCategoria().toUpperCase().contains(categoria.toUpperCase()))
                    resultado.add(livro);
            }
        }
        return resultado;
    }
    
    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
