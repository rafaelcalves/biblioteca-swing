/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.biblioteca;

import com.senac.biblioteca.model.Biblioteca;
import com.senac.biblioteca.model.Livro;

/**
 *
 * @author correa_rafael
 */
public class DadosService {
    private Biblioteca biblioteca;

    public DadosService() {
        initDados();
    }
    
    private void initDados(){
        // Inicializa biblioteca
        this.biblioteca = new Biblioteca("Biblioteca Municipal");
        this.biblioteca.addLivro(new Livro("Biblia","Não informado","Religião"));
        this.biblioteca.addLivro(new Livro("Turma da Mônica","Maurício de Souza","Infantil"));
        this.biblioteca.addLivro(new Livro("Harry Potter","J.K. Rownling","Fantasia"));
        this.biblioteca.addLivro(new Livro("O Código Da Vinci","Dan Brown","Ficção"));
        this.biblioteca.addLivro(new Livro("Vinte mil léguas submarinas","Julio Verne","Ficção"));
    }
    
    public Biblioteca getBiblioteca(){
        return this.biblioteca;
    }
}
