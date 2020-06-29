/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class DadosModel extends javax.swing.JFrame {

    public static String executor="xterm -e ";
    private static String   statusFezPorUltimo="";  
    private String[] placasDeRede = new String[] { "wlxc83a35cdb6", "wlp2s0", "wlan0", "wlan1", "wlan2", "run0", "enp1s0", " ", " "};
    private String[] chanelWifi = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" };        
    private String[] ipsPreDefinidos = new String[] { "localhost", "192.168.1.5", "192.168.1.6", "127.0.0.1", "200.204.0.10", "49.88.112.66", "124.238.113.126", "114.119.10.11" };      
    private String[] tiposAtaques = new String[] {"windows/meterpreter/reverse_tcp", "windows/meterpreter/reverse_udp", "linux/meterpreter/reverse_tcp", "linux/meterpreter/reverse_udp", "macosx/meterpreter/reverse_tcp"};        

    public static String getExecutor() {
        return executor;
    }

    public static String getStatusFezPorUltimo() {
        return statusFezPorUltimo;
    }

    public String[] getPlacasDeRede() {
        return placasDeRede;
    }

    public String[] getChanelWifi() {
        return chanelWifi;
    }

    public String[] getIpsPreDefinidos() {
        return ipsPreDefinidos;
    }

    public String[] getTiposAtaques() {
        return tiposAtaques;
    }

    public static void setStatusFezPorUltimo(String statusFezPorUltimo) {
        DadosModel.statusFezPorUltimo = statusFezPorUltimo;
    }
          
            
}
