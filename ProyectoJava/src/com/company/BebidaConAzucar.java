package com.company;

public class BebidaConAzucar extends Bebida {

    private  double porcentajeAzucar;
    private  boolean promocion;

    public BebidaConAzucar(double cantidad, double precio, String marca, double porcentajeAzucar, boolean promocion) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public double getProcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setProcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public double getPrecio(){
        if(isPromocion()){
            return super.getPrecio()*0.10;
        }else {
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "porcentajeAzucar = " + porcentajeAzucar + ", Promocion" + promocion;
    }
}
