//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3]; //Crear array--> Polimorfismo

        //Crear los objetos dentro del array
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Animal();

        for (Animal n:animales){ //Recorre el array asignando la variable 'n' a cada elemento para que lo recorra --> Array fue declarado con 'Animal'
            n.hacerSonido();
        }
    }
}