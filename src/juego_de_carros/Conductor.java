package juego_de_carros;


import juego_de_carros.Dado;


/**
 *
 * @author nzaba
 */
public class Conductor {
    String Nombre;
    int Num_Nombre;
    int Distancia_Recorrida;
    Dado dados1 = new Dado();
        
    public Conductor (){
        this.Nombre = Nombre;
        this.Num_Nombre = Num_Nombre;
        this.Distancia_Recorrida = Distancia_Recorrida;
    }
    
    public String asignar_nombre (){
        Num_Nombre = dados1.Tirardado(6);
        switch (Num_Nombre){
            case 1 :
                Nombre = "Hamilton";
                break;
            case  2 :
                Nombre = "Verstappen";
                break;
            case  3 :
                Nombre = "Montoya";
                break;
            case  4 :
                Nombre = "Perez";
                break;    
            case  5 :
                Nombre = "Bottas";
                break;
            case  6 :
                Nombre = "Alonso";
                break;
        }
        return Nombre;
   }
   
    public int turno_tirardados (){
            Distancia_Recorrida = dados1.Tirardado(6);
            return Distancia_Recorrida*100;
    }
    
}
