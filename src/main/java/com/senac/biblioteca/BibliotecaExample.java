/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.biblioteca;

import com.senac.biblioteca.swing.HomeFrame;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;

/**
 *
 * @author correa_rafael
 */
public class BibliotecaExample {

    public static void main(String[] args) {
        FlatLightFlatIJTheme.setup();
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
    }
}
