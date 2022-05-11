package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PersonCheckService {
	boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException;
}
