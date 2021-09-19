package com.company;

public class professor<string> extends pessoa {

    private double salario;
    private string nomeCurso;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public string getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(string nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

public double calcularSalarioliquido(){
    return 0;
}
 }