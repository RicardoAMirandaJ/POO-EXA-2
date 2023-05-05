/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author ricar
 */
abstract class Movimiento implements Captura {
    
    private double v0;
    private double vf;
    private double a;
    private double t;
    
    @Override
    public double getV0() {
        return v0;
    }

    @Override
    public void setV0(double v0) {
        this.v0 = v0;
    }

    @Override
    public double getVf() {
        return vf;
    }

    @Override
    public void setVf(double vf) {
        this.vf = vf;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getT() {
        return t;
    }

    @Override
    public void setT(double t) {
        this.t = t;
    }
    
    public Movimiento() {
        v0 = 1.0;
        vf = 1.0;
        a = 1.0;
        t = 1.0;
    }

    public Movimiento(double v0, double vf, double a, double t) {
        this.v0 = v0;
        this.vf = vf;
        this.a = a;
        this.t = t;
    }

    public abstract double CalcularDistancia();
}
