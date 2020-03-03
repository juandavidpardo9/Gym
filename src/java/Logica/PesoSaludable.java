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
public class PesoSaludable extends TipoDeCliente{    
     @Override
    public String rutinaBrazosHombros() {
        String brazos="Realiza los siguientes ejercicios: Extensión de tríceps con mancuerda, Elevación lateral de hombreso con mancuerna, Flexión de bíceps al unísono, Flexión alterno de bíceps,Tríceps en banco, Press militar de pie; Todos los ejercicios deben realizarse con un peso máximo de 10-15 libras en cada mancuerna,aumentando de a 2 libras cada dos semanas, realiza 4 sesiones de 10 repeticiones en cada ejercicio.";
        return brazos;
    }

    @Override
    public String rutinaPiernas() {
        String piernas="Realiza los siguientes ejercicios: Elevación de pelvis en colchoneta, Sentadillas con barra más 40 libras, Peso muerto con barra más 40 libras,  Elevación de pierna en banca,  Elevación de talones,Flexión de pierna con 20 libras . Realiza 4 sesiones de 30 repeticiones en cada ejercicio."; 
        return piernas;
    }

    @Override
    public String rutinaPecho() {
        String pecho="Realiza los siguientes ejercicios: Comienza con un calentamiento haciendo flexiones de pecho en el piso, despues puedes comenzar con el press de banca inclinado, continuando con press de banca en declive y press de banca horizontal. Puedes utilizar barra con discos de 10 libras, realiza 4 sesiones de 15 repeticiones, aumentando el peso cada 4 semanas.";
        return pecho;
    }

    @Override
    public String rutinaEspalda() {
        String espalda="Realiza los siguientes ejercicios: Remo con barra, jaones al pecho, remo con polea baja, remo en maquina horizontal, peso muerto; Realiza 4 sesiones de 15 repeticiones con un peso de 20 libras, tambien puedes hacer series de 10 dominadas. ";
        return espalda;
    }

   
    
}
