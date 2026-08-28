/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Desarrollador;

/**
 *
 * @author rs662
 */
public class CalcularPagoDesarrollador implements CalcularPago{
    private Desarrollador desarrollador;

    public CalcularPagoDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }
    
 

    @Override
    public double calcularPago() {
        return  desarrollador.getSalario();
    }
    
    
}
