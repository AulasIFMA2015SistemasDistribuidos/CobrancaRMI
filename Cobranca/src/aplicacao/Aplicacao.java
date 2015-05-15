package aplicacao;

import interfaceservidor.IAlunosDevedores;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import entidade.Aluno;
import entidade.Mensalidade;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recuperar um objeto remoto do servidor
		try {
			IAlunosDevedores alunosdev = (IAlunosDevedores) 
					Naming.lookup("//localhost/servicofinanceiro");
			for (Aluno aluno : alunosdev.listaDevedores()) {
				System.out.println("Nome:" + aluno.getNome());
				System.out.println("Matricula:" + aluno.getMatricula());
				for (Mensalidade mensalidade : aluno.getMensalidadesemaberto()) {
					System.out.println("Parcela em Aberto:" + mensalidade.getNumparcela());
					System.out.println("Mes:" + mensalidade.getMes());
				}
			}
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
