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
public class GuardarDatos {
    public String guardarEnBaseDeDatos(Empleado empleado){
        
        return "Guardando empleado"+ empleado.getNombre()+"en la base de datos";
    }
    
}
