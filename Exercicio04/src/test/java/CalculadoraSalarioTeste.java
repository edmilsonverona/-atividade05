/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.mestrado.exercicio04.model.Cargo;
import edu.mestrado.exercicio04.model.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ed_ve
 */
public class CalculadoraSalarioTeste {
    
    public CalculadoraSalarioTeste() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void calculaDescontoSalarioDesenvolvedor() {
        Funcionario func = new Funcionario("JOÃO", "joao@email.com", Cargo.DESENVOLVEDOR, 4000D);
        CalculadoraDescontoSalario calculadora = new CalculadoraDescontoSalario();
        Double salarioComDesconto = calculadora.calcularDescontos(func);
        assertEquals(2800D, salarioComDesconto, 0.01);
    
    }
}
