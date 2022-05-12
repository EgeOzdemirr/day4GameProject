package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SalesManager implements SalesService {

	@Override
	public void sale(Player player, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " " + game.getName() + " oyununu" + " "
				+ game.getUnitPrice() + " TL fiyatina satin aldý.");

	}

	@Override
	public void saleWithCampaign(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + "" + game.getName() + " oyununu % "
				+ campaign.getDiscount() + " indirimle "
				+ (game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscount() / 100))
				+ " TL fiyatina satin aldi.");

	}

}
