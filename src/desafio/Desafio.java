package desafio;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User Cea
 */
public class Desafio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        double totalplanilla=0;
        double total = 0;
        double renta = 0;
        
        
        String[] nombre = new String[2];
        double[] salario = new double[2];
        double[] horastrabajadas = new double[2];
        String ax = JOptionPane.showInputDialog("BIENVENIDO A SU PROGRAMA CONTABLE\n\n"+"MENU DE OPCIONES\n\n"+"1) Agregar empleado\n"+"2) Calcular planilla\n"+"3) Salir\n\n"+"Opcion:\n");
        
                  
        switch (ax) {

            case "1":
                        
            for (int t=0; t<2; t++){
            System.out.print("-------------------------------\n");
            System.out.print("Ingrese los datos del empleado "+(t+1)+"\n");
            System.out.print("-------------------------------\n");
            System.out.print("Nombre del Trabajador: ");
            nombre[t] = scanner.nextLine();
            System.out.print("\n Salario Base: $");
            salario[t] = Double.parseDouble(scanner.nextLine());
            System.out.print("\n Horas Trabajadas: ");
            horastrabajadas[t] = Double.parseDouble(scanner.nextLine());
        }
        
          
        
        

            

            case "2": 
        
            
        ax = JOptionPane.showInputDialog("GRACIAS POR SU PREFERENCIA\n\n"+"MENU DE OPCIONES\n\n"+"2) Calcular planilla\n"+"3) Salir\n\n"+"Opcion:\n");       
                
                
        System.out.print("-------------------------------------------------\n");
        System.out.print("Nombre\tSalario\tHoras_Trabajadas\tSueldo\tRentan\tSueldoLiquido\n");
        System.out.print("-------------------------------------------------\n");
        
        
            for(int i=0; i<2; i++){
              System.out.print(nombre[i]);              
              System.out.print("\t$");
              System.out.print(salario[i]);              
              System.out.print("\t\t");
              System.out.print(horastrabajadas[i]);              
              System.out.print("\t\t$");  
              System.out.print(horastrabajadas[i]*salario[i]);              
              System.out.print("\t"); 
              System.out.print(horastrabajadas[i]*salario[i]*0.10);              
              System.out.print("\t");
              System.out.print((horastrabajadas[i]*salario[i])-(horastrabajadas[i]*salario[i]*0.10));              
              System.out.print("\t");
              System.out.print("\n"); 
              total += horastrabajadas[i];
              totalplanilla += horastrabajadas[i]*salario[i];
              renta = totalplanilla*0.10;
              
         }
      
      System.out.print("-------------------------------\n");
      System.out.print("Total de horas trabajadas: "+total);
      System.out.print("\nTotal de planilla: $"+totalplanilla);
      System.out.print("\n-------------------------------\n\n");
            
            
            
            
            
            break;

            case "3": 
            
            System.exit(0); 
            
            break;

            default:  
                
            break;

        }
        
        
        
        
        
        
        /*for (int t=0; t<5; t++) {
            System.out.print(nombre[t] + " \t\t " + salario[t] + " \t\t\t " + horastrabajadas[t] + " \t\t\t$ " + (salario[t] * horastrabajadas[t]));

            total += horastrabajadas[t]; 
            totalplanilla += (salario[t] * horastrabajadas[t]);
    }*/
        
              
    }
}