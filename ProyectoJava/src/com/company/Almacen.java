package com.company;

public class Almacen {

    private Bebida[][] inventario;

    public Almacen(int filas, int columnas) {
        inventario = new Bebida[filas][columnas];

    }

    public Almacen() {
        inventario = new Bebida[5][5];

    }

    public void agregarProducto(Bebida b) {

        boolean existe = false;

        for (int i = 0; i < inventario.length && !existe; i++) {
            for (int j = 0; j < inventario[0].length && !existe; j++) {
                if (inventario[i][j] == null) {
                    inventario[i][j] = b;
                    existe = true;
                }
            }
        }

        if (existe) {
            System.out.println("Bebida agregada");
        } else {
            System.out.println("No se pudo agregar la Bebida");
        }
    }

    public void eliminarProducto(int id) {

        boolean existe = false;

        for (int i = 0; i < inventario.length && !existe; i++) {
            for (int j = 0; j < inventario[0].length && !existe; j++) {
                if (inventario[i][j] != null) {
                    if (inventario[i][j].getId() == id) {

                        inventario[i][j] = null;
                        existe = true;
                    }


                }
            }
        }

        if (existe) {
            System.out.println("La Bebida numero " + id + " Fue eliminada");
        } else {
            System.out.println("no se pudo Eliminar");
        }
    }

    public void mostrarProducto() {

        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[0].length; j++) {
                if (inventario[i][j] != null) {
                    System.out.println("fila " + i + ", columanas: " + j + " Productos: " + inventario[i][j].toString());

                }
            }
        }

    }
    public double calcularPrecioProducto() {

        double precioTotal = 0;
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[0].length; j++) {
                if(inventario [i][j] !=null) {
                    precioTotal += inventario[i][j].getPrecio();
                }
            }
        }
        return precioTotal;

    }//final de la funcion

    public double calcularPrecioProducto(String marca) {
        double precioTotal = 0;
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[0].length; j++) {
                if(inventario [i][j] != null){
                    if (inventario[1][j].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal += inventario[i][j].getPrecio();
                     }


                }

            }
        }

        return precioTotal;
    }//final de funcion

    public double calcularPrecioProducto(int columna) {
        double precioTotal = 0;

        if(columna >=0 && columna < inventario[0].length){

            for(int i = 0; i < inventario.length; i++){
                if(inventario [i] [columna] !=null) {
                    precioTotal += inventario [i] [columna].getPrecio();
                }
            }

        }else {
            System.out.println("El inventraio esta entre 0 y" + inventario[0].length);
        }
            return precioTotal;
    }//final de la funcion

}//final






/*


    public double caluclarPrecioProducto() {

        double precioTotal = 0;

        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[0].length; j++) {
                if (inventario[i][j] != null) {
                    precioTotal += inventario[i][j].getPrecio();
                }

            }
        }
        return precioTotal;
    }


    public double caluclarPrecioProducto(String marca) {

        double precioTotal = 0;

        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[0].length; j++) {
                if (inventario[i][j] != null) {
                    if (inventario[1][j].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal += inventario[i][j].getPrecio();
                    }

                }

            }
        }
        return precioTotal;
    }



    }
*/






