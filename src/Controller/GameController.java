/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.No;
import View.MenuSelecaoView;

/**
 *
 * @author paulo
 */
public class GameController {
    
    private MenuSelecaoView Menu;
    private No no;
    
    public GameController() 
    {
        Menu = new MenuSelecaoView();
        
        iniciaArvore();
    }
    public No getNo(){
        return no;
    }
      public void iniciaArvore() {
       no = new No("Massa");

        no.setEsq(new No("Lasanha"));
        no.setDir(new No("Bolo de Chocolate"));
    }

   
    public void Inicio()
    {
         Menu.mensagemInicial();
        int i=1;
        do {            
            
            i = Menu.confirmaPratoPensado(no);
            
            if(i==0)
                Buscar(no.getEsq());
            else if(i==1)
            {
                Buscar(no.getDir());
            }
            Menu.mensagemInicial();
        } while (i!=-1);
    }
    
     public void Buscar(No no)
    {
        int resposta = Menu.confirmaPratoPensado(no);
        if(resposta ==0)
        {
            if(no.getEsq()==null)
                Menu.mensagemAcerto();
            else
                Buscar(no.getEsq());
        }
        else{
            if(no.getDir()==null)
                Inserir(no);
            else
                Buscar(no.getDir());
        }
    }
     
         public void Inserir(No no)
    {
        String pratoPensado = Menu.perguntaPensado();
        String respCompara = Menu.diferenciaEscolha(pratoPensado, no);
        no.setPrato(respCompara);
        no.setEsq(new No(pratoPensado));
        no.setDir(new No(respCompara));
    }
    
}
