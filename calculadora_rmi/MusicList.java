/**
 * Implementacao do objeto remoto
 * autor: Rodrigo Campiolo
 * data: 22/11/2006
 */

import java.util.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MusicList extends UnicastRemoteObject implements Musica {

    ArrayList <Music> musics = new ArrayList<>();
    public MusicList() throws RemoteException {
        super();
        System.out.println("Objeto remoto instanciado");
    } //Calc

    public boolean add (Music musica) throws RemoteException {
        musics.add(musica);
        return true;
    } //soma

    public boolean remove (int id) throws RemoteException {
        musics.remove(id);
        return true;
    } //subtrai

    public Music[] getMusic () throws RemoteException {
        Music[] m = new Music[musics.size()];
        for(int i = 0; i<musics.size(); i++){
            m[i] = musics.get(i);
        }
        return  (m);
    } // divide


} //Calc
