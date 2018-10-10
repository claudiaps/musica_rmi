import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class Music extends UnicastRemoteObject  {

    String name;

    public Music(String nome) throws RemoteException {
        this.name = nome;
    }

}