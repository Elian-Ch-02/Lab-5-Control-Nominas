/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5control.de.nominas;

import java.util.Vector;

/**
 *
 * @author UCC
 */
public class ListaEmpleados {
    
    public Vector lista;
    
    public double totalNomina = 0;
    
    public ListaEmpleados(){
        lista=new Vector();
    }
    
    public void agregarEmpledo(Empleado a){
        lista.add(a);
    }
    
    public double calcularTotalNomina(){
        for (int i =0; i < lista.size(); i++){
            Empleado e = (Empleado) lista.elementAt(i);
            totalNomina = totalNomina + e.calcularNomina();
        }
        return totalNomina;
    }
    public String[][] obtenerMstriz(){
        String datos[][] = new String[lista.size()][];
        
        for (int i = 0; i < lista.size(); i++){
            Empleado e = (Empleado) lista.elementAt(i);
            
            datos[1][0] = e.getNombre();
            datos[1][0] = e.getApellidos();
            
            datos[1][0] = Double.toString(e.calcularNomina());
            totalNomina = totalNomina + e.calcularNomina();
        }
        return datos;
    }
    
    public String convertirTexto(){
        String texto = "";
        
       for (int i = 0; i < lista.size(); i++){
            Empleado e = (Empleado) lista.elementAt(i);
            
            texto = texto + "Nombre = " + e.getNombre() + "\n" + "Apellido = " + e.getApellidos() 
                    + "\n" + "Cargo = " + e.getGenero() + "\n" + "Salario = $" + e.getSalarioDia() 
                    + "\n" + "Dias TRabajados = " + e.getDiasTrabajos() + "\n" + "Otros Ingresos =  $ " 
                    + e.getOtrosIngresos() + "\n" + "pagos Salud = $" + e.getPagoCCSS() + "\n" 
                            + "Aportes Pensiones = $" + e.getApotePenciones() + "\n---------\n";
        }
        
        texto = texto + "Total Nomina = $" + String.format("%.2f", calcularTotalNomina());
        return texto;
    }
    
}
