/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdesk;

/**
 *
 * @author Fábio
 */
public class GCDeskPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Projeto criado para desktop
	
        String usuario, senha;
        usuario = new String ();
        usuario = JOptionPane.showInputDialog("Digite o usuario:");
        senha = new String ();
        senha = JOptionPane.showInputDialog("Digite o senha:");         JOptionPane.showMessageDialog(null, "Usuario: " + usuario);

    }
}
