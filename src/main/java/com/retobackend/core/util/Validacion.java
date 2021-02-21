package com.retobackend.core.util;


import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Validacion {

    public static String convertFecha(String fecha) {
        String[] campos = fecha.split("-");
        String anio = campos[0];
        String mes = campos[1];
        String dia = campos[2];

        return dia + "/" + mes + "/" + anio;
    }

    public static String convertHora(String hora) {
        String[] campos = hora.split(":");
        String hh = campos[0];
        String mm = campos[1];
        String ss = campos[2];
        return hh + "" + mm + "" + ss;
    }

    public static String validaCampoSiEstaVacio(String nombre, boolean obligatorio) {
        String bandera = "ok";
        String campo = nombre.trim();
        if (obligatorio) {
            if (campo.length() <= 0) {
                bandera = "No se admiten campos vacios";
            }
        } else {
            bandera = "ok";
        }
        return bandera;
    }

    public static String validaCampoNumerosNDigitos(String nombre, int maximo, boolean tipo) {
        String bandera = "ok";
        String campo = nombre.trim();
        if (campo.length() > maximo) {
            bandera = "Maximo " + maximo + " digitos en campo ";
        } else if ((campo.length() > 0)
                && (!isNumero(campo))) {
            if (tipo) {
                if (campo.contains(".")) {
                    bandera = "ok";
                } else {
                    bandera = "No se admiten caracteres en el campo ";
                }
            } else {
                bandera = "No se admiten caracteres en el campo ";
            }

        }

        return bandera;
    }

    public static String validaCampoNumerosNDigitosXXX(String nombre, int maximo, boolean tipo) {
        String bandera = "ok";
        String campo = nombre.trim();
        if (campo.length() > maximo) {
            bandera = "Maximo " + maximo + " digitos en campo ";
        } else if ((campo.length() > 0)
                && (!isNumero(campo))) {
            if (tipo) {
                if (!campo.contains("."));
            }

        }

        return bandera;
    }

    public static String validaSiCampoesdeNDigitos(String nombre, int n) {
        String bandera = "ok";
        String campo = nombre.trim();
        System.out.println("N: " + campo.length());
        if (campo.length() == n || campo.length() == (n - 1)) {
            bandera = "ok";
        } else {
            bandera = "no_Ok";
        }

        return bandera;
    }

    public static boolean isNumero(String cadena) {
        boolean bandera = true;
        int pos = 0;
        while ((pos < cadena.length()) && (bandera)) {
            char car = cadena.charAt(pos);
            if (!Character.isDigit(car)) {
                bandera = false;
            }
            pos++;
        }
        return bandera;
    }

    public static String encriptarMD5(String password) throws NoSuchAlgorithmException {
        char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder(2 * bytes.length);
        for (int i = 0; i < bytes.length; i++) {
            int low = bytes[i] & 0xF;
            int high = (bytes[i] & 0xF0) >> 4;
            sb.append(HEXADECIMAL[high]);
            sb.append(HEXADECIMAL[low]);
        }
        password = sb.toString();
        return password;
    }

    public static String retornar_ip() {
        String ip_local = "";
        try {
            InetAddress loc = InetAddress.getLocalHost();
            ip_local = loc.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ip_local;
    }

    public static double TruncarDosDecimales(double numero) {
        double valor = 0.0D;
        valor = numero;
        valor *= 100.0D;
        valor = Math.round(valor);
        valor /= 100.0D;
        return valor;
    }

    public static String encriptar(String cad) {
        String clue = "";
        for (int i = 0; i < cad.length(); i++) {
            for (int j = 0; j < 256; j++) {
                if (cad.charAt(i) == (char) j) {
                    clue = clue + (char) (j + 5);
                }
            }
        }
        return clue;
    }

    public static String desencriptar(String cad) {
        String clue = "";
        for (int i = 0; i < cad.length(); i++) {
            for (int j = 0; j < 256; j++) {
                if (cad.charAt(i) == (char) j) {
                    clue = clue + (char) (j - 5);
                }
            }
        }
        return clue;
    }
}
