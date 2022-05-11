package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SalesService {
	void sale(Player player, Game game);
	void saleWithCampaign(Player player, Game game, Campaign campaign);
	
}
