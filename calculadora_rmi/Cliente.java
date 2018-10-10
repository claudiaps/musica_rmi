
/**
 * Solicita o servico
 * autor: Rodrigo Campiolo
 * data:22/11/2006
 */

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Cliente {
    public static void main(String args[]) {
        try {
            System.out.println("Cliente iniciado ...");

            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            } // if

            /* obtem a referencia para o objeto remoto */
            Registry registry = LocateRegistry.getRegistry("localhost");
            Musica mu = (Musica)registry.lookup("ServicoMusica");
            
            Music music_name = new Music("teste nome");
            System.out.println(music_name.name);
            mu.add(music_name);
            
            System.out.println("Adicionar: ");

        } catch (Exception e) {
            System.out.print("test2");
            e.printStackTrace();
        } // catch

    } // main
} // Cliente