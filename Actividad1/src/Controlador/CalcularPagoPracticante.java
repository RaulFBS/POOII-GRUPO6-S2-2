/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Practicante;

/**
 *
 * @author rs662
 */
public class CalcularPagoPracticante implements CalcularPago{
    private Practicante practicante;

    public CalcularPagoPracticante(Practicante practicante) {
        this.practicante = practicante;
    }
    
    
    @Override
    public double calcularPago() {
        return practicante.getSalario()*0.5;
    } 
    
}
