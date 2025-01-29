package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    /*
     * Ingresar el empleado donde la clase sea el id del
     * Empleado
     * @param int id del empleado a buscar
     * @return False si no ingreso porque ya existe
     *         True si ingreso correctamente
     */
    public boolean addEmpleado(Empleado empleado){
        if(empleados.containsKey(empleado.getId())){
            return false;
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    } 

    /*
     * Ingresar el empleado donde la clase sea el id del
     * Empleado
     * @param int id a ingresar al mapa
     * @return Empleado segun id
     *         
     */
    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }

    public void displayEmpleados(){
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres(){
        System.out.println("display Empleados Solo Nombres: ");
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getValue().getName());
        }
    }

    public void displayLlaves(){
        System.out.println("---- displayLlaves ----");
        for(Integer llaves : empleados.keySet()){
            System.out.println(llaves);
        }
    }

    public void displayValues(){
        System.out.println("---- displayValues ----");
        for(Empleado valores : empleados.values()){
            System.out.println(valores);
        }
    }

}