package Adapters;

import java.rmi.RemoteException;

import Abstract.PersonCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements PersonCheckService {
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationlityId()),
				player.getFirstName(), player.getLastName(), player.getBirthYear());
		if (result == true) {
			System.out.println("Ba�ar�l� giri�");
			return true;
		} else {
			System.out.println("Ba�ar�s�z giri�");
			return false;
		}

	}

}
