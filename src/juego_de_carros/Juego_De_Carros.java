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
public class Juego_De_Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           //Dado dados1 = new Dado(); 	
           //int res = dados1.Tirardado(6);
           Pista pista_carrera = new Pista();
           int pista_Asignada = pista_carrera.asignar_pista();
           System.out.println("Pista Asignada: "+pista_Asignada);
           int kilometros_pista = pista_carrera.asignar_longitud_de_pista();
           System.out.println("Longitus de la Pista: "+kilometros_pista+" Kilometros");
           int carriles = pista_carrera.carriles_pista();
           System.out.println("Numeros de Carriles Pista: "+carriles);
           System.out.println("-----------------------------------------");
           int numerocarros = 0;
           String [] vcarros = new String[carriles];
           String [] vconductores = new String[carriles];
            
           Carros carro = new Carros();
           Conductor conductor_asignado = new Conductor();
           while (numerocarros < carriles) {
                 String Color_del_Carro = carro.color_carro();
                 //System.out.println("El color de carro es: "+Color_del_Carro);
                 String Nombre_Conductor = conductor_asignado.asignar_nombre();
                 //System.out.println("El nombre del conductor asignado al carro: "+Color_del_Carro+" es: "+Nombre_Conductor);
                vcarros[numerocarros] = Color_del_Carro;
                vconductores[numerocarros] = Nombre_Conductor;
                numerocarros = numerocarros+1;
           }
           for (int i = 0; i <= carriles-1;) {
               System.out.println("Carro: "+vcarros[i]);
               System.out.println("Conductor: "+vconductores[i]);
               System.out.println("-----------------------------------------");
               i++;
           }
           int [] vrecorrido = new int [carriles];
           int sw = 0;
           int recor = 0;
           int turnos = 0;
           int apuntador = 0;
           int podio = 0;
           int [] vpodioganadores = new int [3];
           while (sw <= 5){
               //recor = conductor_asignado.turno_tirardados();
               turnos = 0;
               while (turnos < carriles-1){
                  apuntador = vrecorrido[turnos];
                  recor = conductor_asignado.turno_tirardados();
                  vrecorrido[turnos] = apuntador+recor;
                  
                  System.out.println("Carro: "+vcarros[turnos]);
                  System.out.println("Conductor: "+vconductores[turnos]);
                  System.out.println("-----------------------------------------");
                  System.out.println("turno: "+turnos+"recor: "+recor);
                  System.out.println("Recorrido Carro: "+vrecorrido[turnos]);
                  turnos = turnos+1;
                  //sw= sw+1;
               }
               for (int i = 0; i <= carriles-1;) {
                    podio = vrecorrido[i];
                     System.out.println("Podio: "+podio);
                    if (podio >= (kilometros_pista*1000)) {
                       vpodioganadores[i] = i;
                       sw = sw+1;
                    } 
                    System.out.println("posicion: "+i);
                    System.out.println("SW: "+sw);
                    i++;
               }     
               //sw =3;
               }
           
           //int metros_Recorridos = conductor_asignado.turno_tirardados();
           //System.out.println("la distancia recorrida del carro: "+Color_del_Carro+" es: "+metros_Recorridos+" metros");
           
    }
    
}
