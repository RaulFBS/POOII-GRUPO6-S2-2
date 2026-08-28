/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Empleado;

/**
 *
 * @author rs662
 */
public class Reporte {
    public String generarReporte(Empleado empleado){
       
        return "Generando reporte para el empleado"+ empleado.getNombre()+"..." ;
    }
    
}
