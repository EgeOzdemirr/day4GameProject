package Concrete;

import java.rmi.RemoteException;

import Abstract.PersonCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	PersonCheckService personCheckService;

	public PlayerManager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}
	
	@Override
	public void add(Player player) throws NumberFormatException, RemoteException {
		if(personCheckService.CheckIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " + player.getLastName() + " baþarýyla kayýt oldu.");
		}else {
			System.out.println("Kiþi bulunamadý.");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kaydýný sildi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " bilgilerini güncelledi.");
		
	}

}
