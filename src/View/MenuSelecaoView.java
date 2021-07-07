/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.No;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MenuSelecaoView {
    JFrame frame = new JFrame("Jogo Gourmet");
    public void mensagemInicial() {
        JOptionPane.showMessageDialog(frame, "Pense em um prato que gosta");
    }
    public void mensagemAcerto() {
        JOptionPane.showMessageDialog(frame, "Acertei de novo!");
    }
    public String perguntaPensado() {
        return JOptionPane.showInputDialog(frame, "Qual prato você pensou?");
    }
    public int confirmaPratoPensado(No no) {
        return JOptionPane.showConfirmDialog(frame, "O prato que você pensou é " + no.getPrato() + "?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
    public String diferenciaEscolha(String prato, No no) {
        return JOptionPane.showInputDialog(frame, String.format(" %s é ____ mas %s não.",prato,no.getPrato()));
    }
}
