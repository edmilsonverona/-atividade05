package edu.mestrado.exercicio04.calculadora;


import edu.mestrado.exercicio04.model.Cargo;
import edu.mestrado.exercicio04.model.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ed_ve
 */
public class CalculadoraDescontoSalario {

    public Double calcularDescontos(Funcionario func) {
       Double salarioDescontado = null; 
       if (func.getCargo().equals(Cargo.DESENVOLVEDOR)){
           if (func.getSalario() >= 3000D){
               salarioDescontado =  func.getSalario() - (func.getSalario() * 0.3);
           } else {
               salarioDescontado =  func.getSalario() - (func.getSalario() * 0.1);
           }
       } else if (func.getCargo().equals(Cargo.DBA) || func.getCargo().equals(Cargo.TESTADOR)){
           if (func.getSalario() >= 2000D){
               salarioDescontado =  func.getSalario() - (func.getSalario() * 0.25);
           } else {
               salarioDescontado =  func.getSalario() - (func.getSalario() * 0.15);
           }
       } else if (func.getCargo().equals(Cargo.GERENTE)){
           if (func.getSalario() >= 5000D){
               salarioDescontado =  func.getSalario() - (func.getSalario() * 0.3);
           } else {
               salarioDescontado =  func.getSalario() - (func.getSalario() * 0.2);
           }
       } 
       return salarioDescontado;
    }

}
