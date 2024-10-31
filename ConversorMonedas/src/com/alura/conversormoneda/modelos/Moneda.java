package com.alura.conversormoneda.modelos;

public class Moneda {
    private String tipoTargetA;

    private double valorTargetA;

    private String getTipoTargetB;

    private double valorTargetB;


    public Moneda(String tipoTargetA, double valorTargetA, String getTipoTargetB, double valorTargetB) {
        this.tipoTargetA = tipoTargetA;
        this.valorTargetA = valorTargetA;
        this.getTipoTargetB = getTipoTargetB;
        this.valorTargetB = valorTargetB;
    }

    public void setTipoTargetA(String tipoTargetA) {
        this.tipoTargetA = tipoTargetA;
    }

    public void setValorTargetA(double valorTargetA) {
        this.valorTargetA = valorTargetA;
    }

    public void setGetTipoTargetB(String getTipoTargetB) {
        this.getTipoTargetB = getTipoTargetB;
    }

    public String getTipoTargetA() {
        return tipoTargetA;
    }

    public double getValorTargetA() {
        return valorTargetA;
    }

    public String getGetTipoTargetB() {
        return getTipoTargetB;
    }

    public double getValorTargetB() {
        return valorTargetB;
    }
}
