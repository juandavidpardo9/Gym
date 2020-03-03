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
public class ObesidadMuySevera extends TipoDeCliente implements Cardio{

    @Override
    public String ejercicioCardio() {
        String cardio="Despues de realizar las rutinas de ejercicio debe realiza ejercicios cardiovasculares por 20 minutos para ir perdiendo grasa y mejorar resistencia.";
        return cardio;
    }

     @Override
   public String calentar() {
        String calentar="Comienza en caminadora con una velocidad moredara caminando por 20 min.";
        return calentar;
    }
   @Override
    public String rutinaBrazosHombros() {
        String brazos="Realiza los siguientes ejercicios: Extensión de tríceps con mancuerda, Elevación lateral de hombreso con mancuerna, Flexión de bíceps al unísono, Flexión alterno de bíceps,Tríceps en banco, Press militar de pie; Todos los ejercicios deben realizarse con un peso máximo de 5 libras en cada mancuerna,aumentando de a 1 libra cada dos semanas, realiza 4 sesiones de 5-8 repeticiones en cada ejercicio.";
        return brazos;
    }

    @Override
    public String rutinaPiernas() {
        String piernas="Realiza los siguientes ejercicios: Elevación de pelvis en colchoneta, Sentadillas , Peso muerto con barra más 5 libras,  Elevación de pierna en banca,  Elevación de talones. Realiza 3 sesiones de 5-8 repeticiones en cada ejercicio."; 
        return piernas;
    }

    @Override
    public String rutinaPecho() {
        String pecho="Realiza los siguientes ejercicios: Comienza con un calentamiento haciendo flexiones de pecho en el piso, despues puedes comenzar con el press de banca inclinado, continuando con press de banca en declive y press de banca horizontal. Puedes utilizar mancuernas de 3 libras, realiza 3 sesiones de 5-8 repeticiones.  ";
        return pecho;
    }

    @Override
    public String rutinaEspalda() {
        String espalda="Realiza los siguientes ejercicios: Remo con barra, jaones al pecho, remo con polea baja, remo en maquina horizontal, peso muerto; Realiza 3 sesiones de 5-8 repeticiones con un peso de 5 libras. ";
        return espalda;
    }
    
}
