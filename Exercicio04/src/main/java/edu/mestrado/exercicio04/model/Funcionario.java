/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mestrado.exercicio04.model;

/**
 *
 * @author ed_ve
 */
public class Funcionario {
    
    private String nome, email;
    private Cargo cargo;
    private double salario;

    public Funcionario(String nome, String email, Cargo cargo, double salario) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
}
