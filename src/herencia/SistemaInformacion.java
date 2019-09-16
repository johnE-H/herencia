
package herencia;

import javax.swing.JOptionPane;


public class SistemaInformacion {
    
    //Constructor de la clase
public SistemaInformacion() {

}

public static void main(String[] args)
{

    int opcion = 0;
Persona sistemaInformacion = new Persona();
try{


do{

opcion = sistemaInformacion.leerDatoTipoEntero("1. Para procesar los datos del empleado"+"\n"
        +"2. Para procesar datos del Estudiante "+"\n 3. para Salir del menu ");
if (opcion == 1){
JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
manejadorEmpleado.imprimirReporteEstadoEmpleado();
}
else{
    if(opcion == 2){
       
        JOptionPane.showMessageDialog(null,"Procesando datos del estudiante");
        Estudiante manejadorEstudiante = new Estudiante();
        //leemos datos estudiante
       manejadorEstudiante = manejadorEstudiante.ingresarDatosEstudiante();
       //imprimimos datos basicos de la persona
      manejadorEstudiante.imprimirDatosPersona();
      //imprimimos reporte basico del estudiante 
      manejadorEstudiante.imprimirReporteNotasEstudiante();
    }else{
        if(opcion == 3){
            
            JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
            break;
            }else{
            JOptionPane.showMessageDialog(null,"Opción inválida");
            }

        }
    
    }

}while (opcion <= 1 || opcion >= 3);//fin del do-while


}//Fin del try
catch (Exception errorMain)
{
JOptionPane.showMessageDialog(null,"Error en la digitación: ");
errorMain.printStackTrace();
}


}

    
}
