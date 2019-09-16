/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;


public class Estudiante extends Persona{
    
    //atributos
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {
    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }


    public String getCarnet() {
        return carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
   
    
    public double calcularPromedio(int numeroMaterias, double promedioNotas){
    double promedio;
    
    promedio = promedioNotas/numeroMaterias;
    
    return promedio;
    }
    
    public Estudiante ingresarDatosEstudiante(){
    Estudiante nuevoEstudiante = new Estudiante(); //instancia del objeto
    //datos de la clase padre
 String nombre = "";
String apellido = "";
String carnet = "";
int edad = 0;
int numeroMaterias = 0;
double peso = 0.0;
double promedioNotas = 0;
nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");

    //datos del la propia clase
 carnet = leerDatoTipoCadena("Ingrese el codigo del carnet");
 numeroMaterias =leerDatoTipoEntero("ingrese el numero de materias");
 
for(int i = 0; i < numeroMaterias; i++) {
promedioNotas+=leerDatoTipoReal("ingrese la nota de la materia numero#"+i);
}
  promedioNotas = calcularPromedio(numeroMaterias, promedioNotas);


 nuevoEstudiante.setNombre(nombre);
 nuevoEstudiante.setApellido(apellido);
 nuevoEstudiante.setEdad(edad);
 nuevoEstudiante.setPeso(peso);
 nuevoEstudiante.setCarnet(carnet);
 nuevoEstudiante.setNumeroMaterias(numeroMaterias);
 nuevoEstudiante.setPromedioNotas(promedioNotas);
return nuevoEstudiante;
    }
    
    
    public void imprimirReporteNotasEstudiante(){
       JOptionPane.showMessageDialog(null,"REPORTE"+"\nCarnet: "+carnet+
               "\n Numero de materias "+numeroMaterias+"\n Promedio Estudiante : "+promedioNotas , "Reporte estudiante",JOptionPane.INFORMATION_MESSAGE);
               
    }
    
    
}