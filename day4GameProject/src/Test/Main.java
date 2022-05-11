package Test;

import java.rmi.RemoteException;

import Adapters.MernisCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		// Kendi bilgilerinizi girerek deneyebilirsiniz
		Player player1 = new Player(1, "Ege", "Özdemir", 2002, "11111111111"); 
		Player player2 = new Player(2,"Muhammed","Demir",2000, "22222222222");
		
		Game game1 = new Game(1, "Red Dead Redemption 2", 299);

		Campaign campaign1 = new Campaign(1, "Halloween", 50);

		// Checking PlayerManager functions
		PlayerManager playerManager = new PlayerManager(new MernisCheckService());
		playerManager.add(player1);
		playerManager.add(player2);

		
		// Test edildi, tüm komutlar çalýþýyor.
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		
		// Test edildi, tüm komutlar çalýþýyor.
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		// Test edildi, tüm komutlar çalýþýyor.
		SalesManager salesManager = new SalesManager();
		salesManager.sale(player1, game1);
		salesManager.saleWithCampaign(player2, game1, campaign1);
		
	}

}
