/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author david
 */
public class TipoDeCliente implements Rutinas{
    
    private String Nombre;
    private String Edad;
    private String Peso;
    private String Altura;
    

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }   

   
   
    public String calentar() {
        String calentar="Comienza con un calentamiento general del cuerpo de aproximadamente 10 minutos, puedes saltar lazo, hacer skipping medio/alto y hacer saltos del payaso";
        return calentar;
    }



    public String estirar() {
        String estirar="El estiramiento debe ser de todo el cuerpo, cada estiramiento debe durar alrededor de 15-30 segundos, comenzamos con los dorsales y tríceps, dorsal e intercostal, gemelos y tendones, cuádriceps y piernas, hombros, brazos y abdomen.";
        return estirar;
    }

    @Override
    public String rutinaBrazosHombros() {
        String brazos="default";
        return brazos;
    }

    @Override
    public String rutinaPiernas() {
        String brazos="default";
        return brazos;
    }

    @Override
    public String rutinaPecho() {
         String brazos="default";
        return brazos;
    }

    @Override
    public String rutinaEspalda() {
         String brazos="default";
        return brazos;
    }
    
  
            
            
    
    
    
}
