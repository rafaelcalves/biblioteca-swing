/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.biblioteca.swing;

import com.senac.biblioteca.model.Livro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author correa_rafael
 */
public class LivroTableModel extends AbstractTableModel{
    private List<Livro> items;
    private Class[] types = new Class [] {
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.Boolean.class
    };
    private String[] columns = new String[] {
        "Código",
        "Título",
        "Autor",
        "Categoria",
        "Disponível"
    };
    private boolean[] canEdit = new boolean [] {
        false, 
        false, 
        false, 
        false, 
        false
    };

    public LivroTableModel(List<Livro> items) {
        this.items = items;
        this.addTableModelListener(null);
    }

    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
     public Object getValueAt(int rowIndex, int columnIndex) {
        Livro item = items.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getId();
            case 1: return item.getTitulo();
            case 2: return item.getAutor();
            case 3: return item.getCategoria();
            case 4: return item.isDisponivel();
        }
        return null;
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
    }
    
    public void add(Livro item) {
        items.add(item);
        int row = items.indexOf(item);
        fireTableRowsInserted(row, row);
    }
    
    public void remove(Livro item) {
        if (items.contains(item)) {
            int row = items.indexOf(item);
            items.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
}