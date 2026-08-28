/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Gerente;

/**
 *
 * @author rs662
 */
public class CalcularPagoGerente implements CalcularPago{
    private Gerente gerente;

    public CalcularPagoGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    

    @Override
    public double calcularPago() {
        return gerente.getSalario()+1000;
    }
    
    
}
