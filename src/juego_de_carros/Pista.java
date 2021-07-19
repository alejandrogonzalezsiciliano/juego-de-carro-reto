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
public class Pista {
    int num_pista;   
    int num_carriles;
    int kilometros;
    Dado dados1 = new Dado();
  
    public Pista() {
        this.num_pista = num_pista;
        this.num_carriles = num_carriles;
        this.kilometros = kilometros;
    }
    
    public int asignar_pista (){
        num_pista = dados1.Tirardado(6);
        return num_pista;
    }
    public int asignar_longitud_de_pista(){
        kilometros = dados1.Tirardado(6);
        return kilometros;
    }
    
    public int carriles_pista (){
        num_carriles = 0;
        //Este do-while obliga a que las pistas tengan mas de un carril;
        do {
            num_carriles = dados1.Tirardado(6);
        } while (num_carriles <= 1);
        return num_carriles;
    }
    
    
}
