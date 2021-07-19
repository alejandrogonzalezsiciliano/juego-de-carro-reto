/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_carros;

import java.util.Random;

/**
 *
 * @author nzaba
 */
public class Dado {
    
     public int Tirardado(int rango) {
        Random random = new Random();
        int dado; // Hay que hacer visible la variable fuera
        dado = random.nextInt(rango)+1; 
        return dado; 
   }
}
