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
public enum Cargo {
    
    DESENVOLVEDOR("DES"), DBA("DBA"), TESTADOR("TES"), GERENTE("GER");
    
    
    public String tipo;

    private Cargo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
