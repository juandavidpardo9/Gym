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
public class Sobrepeso extends TipoDeCliente implements Cardio{
    
     @Override
    public String ejercicioCardio() {
        String cardio="Despues de realizar las rutinas de ejercicio debe realizar ejercicios cardiovasculares de 30-40 minutos para ir perdiendo grasa y mejorar resistencia.";
        return cardio;
    }

     @Override
    public String rutinaBrazosHombros() {
        String brazos="Realiza los siguientes ejercicios: Extensión de tríceps con mancuerda, Elevación lateral de hombreso con mancuerna, Flexión de bíceps al unísono, Flexión alterno de bíceps,Tríceps en banco, Press militar de pie; Todos los ejercicios deben realizarse con un peso máximo de 5-10 libras en cada mancuerna,aumentando de a 2 libras cada dos semanas, realiza 4 sesiones de 10 repeticiones en cada ejercicio.";
        return brazos;
    }

    @Override
    public String rutinaPiernas() {
        String piernas="Realiza los siguientes ejercicios: Elevación de pelvis en colchoneta, Sentadillas , Peso muerto con barra más 20 libras,  Elevación de pierna en banca,  Elevación de talones, Flexión de pierna con 15-20 libras . Realiza 4 sesiones de 10 repeticiones en cada ejercicio."; 
        return piernas;
    }

    @Override
    public String rutinaPecho() {
        String pecho="Realiza los siguientes ejercicios: Comienza con un calentamiento haciendo flexiones de pecho en el piso, despues puedes comenzar con el press de banca inclinado, continuando con press de banca en declive y press de banca horizontal. Puedes utilizar barra con discos libras, realiza 4 sesiones de 10 repeticiones.  ";
        return pecho;
    }

    @Override
    public String rutinaEspalda() {
        String espalda="Realiza los siguientes ejercicios: Remo con barra, jaones al pecho, remo con polea baja, remo en maquina horizontal, peso muerto; Realiza 3 sesiones de 10 repeticiones con un peso de 5 libras, tambien puedes hacer series de 5 dominadas. ";
        return espalda;
    }
    
}
