/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5control.de.nominas;

/**
 *
 * @author UCC
 */
public class Empleado {
    private String nombre;
    private String apellidos;
    private double salarioDia;
    private double otrosIngresos;
    private double pagoCCSS;
    private double aportePensiones;
    private int diasTrabajados;
    private TipoCargo cargo;
    private TipoGenero genero;
    
    public Empleado(String nomnre, String apellido, double salarioDia, double otrosIngresos, double pagoCCSS, double aportePensiones, int diasTrabajados, TipoCargo cargo, TipoGenero Genero){
        this.nombre = nomnre;
        this.apellidos = apellidos;
        this.salarioDia = salarioDia;
        this.otrosIngresos = otrosIngresos;
        this.pagoCCSS = pagoCCSS;
        this.aportePensiones = aportePensiones;
        this.diasTrabajados = diasTrabajados;
        this.cargo = cargo;
        this.genero = genero; 
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public double getSalarioDia(){
        return salarioDia;
    }
    public double getOtrosIngresos(){
        return otrosIngresos;
    }
    public double getPagoCCSS(){
        return pagoCCSS;
    }
    public double getApotePenciones(){
        return aportePensiones;
    }
    public int getDiasTrabajos(){
        return diasTrabajados;
    }
    public TipoCargo getCargo(){
        return cargo;
    }
    public TipoGenero getGenero(){
        return genero;
    }
    
    public double calcularNomina(){
        return ((salarioDia * diasTrabajados) + otrosIngresos - pagoCCSS - aportePensiones);
    }
    
}
