/**
 * Define a interface para uma calculadora remota
 * Autor: Rodrigo Campiolo
 * Data: 22/11/2006
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Musica extends Remote {
    public boolean add (Music musica) throws RemoteException;
    public boolean remove (int id) throws RemoteException;
    public Music[] getMusic () throws RemoteException;
} //Calculadora