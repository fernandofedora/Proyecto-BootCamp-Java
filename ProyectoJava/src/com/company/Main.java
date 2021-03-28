package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Almacen a = new Almacen();
// anadir los productos
        Bebida b;
        for(int i=0; i<10; i++){
            switch (i % 2){
                case 0:
                    b = new Agua(5,15,"fiji", "grifo");
                    a.agregarProducto(b);
                    break;

                case 1:
                    b = new BebidaConAzucar(5,10, "CocaCola", 1.5, true);
                    a.agregarProducto(b);
                    break;
            }
        }
        //Muestro los productos
        a.mostrarProducto();

        //Calculo el precio de todas de los productos
        System.out.println("Precio de todas los productos "+a.calcularPrecioProducto());

        //Elimino un prodcuto
        a.eliminarProducto(5);

        //Muestro los productos
        a.mostrarProducto();

        //
        System.out.println("Precio de todos los productos es: "+a.calcularPrecioProducto());

        System.out.println("Precio de todas las bebidas de la marca fiji es: " +a.calcularPrecioProducto("fiji"));


        System.out.println("Calcular el precio de la columna 0: "+a.calcularPrecioProducto(0));



    }
}
