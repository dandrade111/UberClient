/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import commands.Command;
import gui.MainFrame;
import commands.Command;

/**
 *
 * @author Daniel
 */
public class MessageHandler {
    private Command cmd;
    public MainFrame ui;
    
    public MessageHandler(MainFrame ui){
        this.ui = ui;
    }
    
    public MessageHandler(Command cmd){
        this.cmd = cmd;
    }
    
    public void ResolveMessage(Command c) {
        this.cmd = c;
        
        if(cmd!=null){
            switch(cmd.type){ 
                case "login_cliente":{
                    //System.out.println((boolean)cmd.result);
                    if((boolean)cmd.result){
                      ui.jTextArea1.append("[UberServer > UberCliente] : Login "+(String)cmd.args.listArgs.get(0)+" efectuado! \n");
                      ui.LoginSucess();
                   }
                    else{
                       ui.jTextArea1.append("[UberServer > UberCliente] : Login "+(String)cmd.args.listArgs.get(0)+" inválido! \n");
                    }
                    break;
                }
                
                case "registar_cliente":{
                   if((boolean)cmd.result)
                        ui.jTextArea1.append("[UberServer > UberCliente] : Utilizador "+(String)cmd.args.listArgs.get(0)+" registado! \n");
                     else{
                        ui.jTextArea1.append("[UberServer > UberCliente] : Falhou Registo \n");
                    }
                    break;
                }
                
                case "atribuido_condutor":{
                   if((boolean)cmd.result)
                        ui.jTextArea1.append("[UberServer > UberCliente] : Foi-lhe atribuido um condutor, por favor aguarde pelo veículo com a matrícula: "+(String)cmd.args.listArgs.get(0)+", marca: "+(String)cmd.args.listArgs.get(1)+", chegará dentro de aproximadamente "+(String)cmd.args.listArgs.get(2)+" segundos \n");
                     else{
                        ui.jTextArea1.append("[UberServer > UberCliente] : Falha na atribuição de condutor! \n");
                    }
                    break;
                }
                
                case "veiculo_chegou":{
                    if((boolean)cmd.result)
                        ui.jTextArea1.append("[UberServer > UberCliente] : O seu transporte chegou ao ponto de partida! \n");
                    break;
                }
               
                case "chegou_destino":{
                   //coisas
                    break;
                }
                
                case "viagem_atribuída":{
                   if((boolean)cmd.result)
                        ui.jTextArea1.append("[UberServer > UberCliente] : O seu transporte chegou ao ponto de partida! \n");
                    break;
                }
                //todos os commandos
            }
            }else{
            System.out.println("Invalid Command!\n");
        }
        }
}
