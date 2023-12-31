package org.example;

import org.example.imposto.CalculadoraImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

        System.out.println("Valor do ISS: " + calculadoraImpostos.calcular(orcamento, new ISS(null)));
        System.out.println("Valor do ICMS: " + calculadoraImpostos.calcular(orcamento, new ICMS(new ISS(null))));
    }
}