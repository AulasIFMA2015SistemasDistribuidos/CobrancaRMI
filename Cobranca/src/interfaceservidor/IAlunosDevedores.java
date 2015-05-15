package interfaceservidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import entidade.Aluno;

public interface IAlunosDevedores extends Remote {
	public ArrayList<Aluno> listaDevedores() throws RemoteException;
}
