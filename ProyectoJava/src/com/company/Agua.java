package com.company;

public class Agua extends Bebida {

    private  String grifo;


    public Agua(double cantidad, double precio, String marca, String grifo) {
        super(cantidad, precio, marca);
        this.grifo = grifo;
    }

    public String getGrifo() {
        return grifo;
    }

    public void setGrifo(String grifo) {
        this.grifo = grifo;
    }

    @Override
    public String toString() {
        return super.toString() + "Grifo = " + grifo;
    }
}
