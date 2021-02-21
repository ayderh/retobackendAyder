/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retobackend.core.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;


public class Utilidades {

    public static List<Object> devolverList(Object[] objects) {
        List lista = new ArrayList<Object>(Arrays.asList(objects));
        return lista;
    }

    public static Date convertir_String_a_Date(String cadenaFechaHora) {
        Date fechaConHora = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            fechaConHora = sdf.parse(cadenaFechaHora);
        } catch (Exception e) {
            System.out.println("Error obtener_DateFechaHora_DelServidor:" + e.toString());
        }
        return fechaConHora;
    }
    
    public static String convertir_Date_a_String_Fecha(Date FechaHora) {
        String cadenaFechaHora="";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            cadenaFechaHora = sdf.format(FechaHora);
        } catch (Exception e) {
            System.out.println("Error convertir_Date_a_String_Fecha:" + e.toString());
        }
        return cadenaFechaHora;
    }
    
    public static String convertir_Date_a_String_Hora(Date FechaHora) {
        String cadenaHora="";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            cadenaHora = sdf.format(FechaHora);
        } catch (Exception e) {
            System.out.println("Error convertir_Date_a_String_Hora:" + e.toString());
        }
        return cadenaHora;
    }

    public static ArrayList<String> crearLista_apartirDeCadenaString(String cadenaString, String delimitador) {
        ArrayList<String> lista = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(cadenaString, delimitador);
        while (st.hasMoreTokens()) {
            lista.add(st.nextToken());
        }
        return lista;
    }

}
