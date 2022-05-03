package models;

public class Folha {
private String nome;
private String cpf;
private int mes;
private int ano;
private double valor;
private int horas;


public Folha(int horasT) {
    this.setHoras(horasT);
}
public Folha() {
}
public int getHoras() {
    return horas;
}
public void setHoras(int horasT) {
    this.horas = horasT;
}
public String getCpf() {
    return cpf;
}

public double isValor() {
    return valor;
}
public void setValor(double d) {
    this.valor = d;
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
public int getMes() {
    return mes;
}
public void setMes(int mes) {
    this.mes = mes;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public void ValorH(double readDouble) {
}
public void add() {
}
@Override
    public String toString() {
        return 
            "Nome: " + nome + 
            " | CPF: " + cpf +
            " | CPF: " + mes +
            " | CPF: " + valor + 
            " | CPF: " + horas +
            " | CPF: " + ano;
    }
public void add(Folha folha) {
}
}


   