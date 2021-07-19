/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_de_carros;

/**
 *
 * @author nzaba
 */
public class Carros {
    String Conductor;
    
    String Color;
    int Codigo_Juego;
    int Num_Color;
    
    Dado dados1 = new Dado();
    
    public Carros () {
        this.Conductor = Conductor;
        this.Color = Color;
        this.Num_Color = Num_Color;
        this.Codigo_Juego = Codigo_Juego;
    }
    
    public String color_carro (){
        Num_Color = dados1.Tirardado(6);
        switch (Num_Color){
            case 1 :
                Color = "Negro";
                break;
            case  2 :
                Color = "Verde";
                break;
            case  3 :
                Color = "Rojo";
                break;
            case  4 :
                Color = "Azul";
                break;    
            case  5 :
                Color = "Amarillo";
                break;
            case  6 :
                Color = "Blanco";
                break;
        }
        return Color;
   }
    
   
}
