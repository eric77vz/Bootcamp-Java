/** Segunda parte:

 Crear una clase coche.

 Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

 Una función que incremente el número de puertas que tiene el coche.

 Crear un objeto miCoche en el main y añadirle una puerta.

 Mostrar el número de puertas que tiene el objeto.**/

public class Coche {
    protected int puertasCoche;

    public Coche (){
        puertasCoche=4;
    }
    //función incrementa puertas
    public int  incPuertas(){
       return puertasCoche ++;
    }
    //Getter devuelve datos puertas
    public int getPuertasCoche(){
        return puertasCoche;
    }
}
