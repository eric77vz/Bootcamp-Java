public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Primera Parte -------------");
        ///Aquí llamo a la función suma
        int usoFuncion = MiFuncion.suma(2, 4, 6);
        System.out.println("El uso de nuestra función suma dió como resultado: " + usoFuncion);

        System.out.println("-------------Segunda Parte--------------");

        Coche miCoche = new Coche();//Objeto

        miCoche.incPuertas();//Aquí añade una puerta

        System.out.println("El objeto miCoche tiene " + miCoche.getPuertasCoche() + " Puertas. ");
    }
}
