package tk.genesishub.gFeatures.gWarsSuite.Tiers;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import tk.genesishub.gFeatures.gWarsSuite.Constants;
import tk.genesishub.gFeatures.gWarsSuite.KitManagerSecondary;

/*
gFeatures
https://github.com/Seshpenguin/gFeatures

   Copyright 2015 DolphinBox

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

public class TierOne {
	Constants cons = new Constants();
	tk.genesishub.gFeatures.gWarsSuite.StatsRetrieve sr = new tk.genesishub.gFeatures.gWarsSuite.StatsRetrieve();
	KitManagerSecondary kmh = new KitManagerSecondary();
	public void Initialize(CommandSender sender, String value){
		ItemStack ammo = new ItemStack(Material.MELON_SEEDS,32);
		Player player = (Player)sender;
		if((sr.getKills(player.getName()))<5){
			sender.sendMessage("You don't have enough kills! 5 kills is required for Tier 1 weapons.");
		}
		else if(Constants.gunin.contains(player.getName())){
			
		}
		else{
		player.getInventory().addItem(ammo);
		player.getInventory().remove(Material.CHEST);
		Constants.gunin.add(player.getName());
		switch(value){
		case "sniper":
			Sniper(sender);
			break;
		case "shotgun":
			Shotgun(sender);
			break;
		case "autorifle":
			AutoRifle(sender);
			break;
		case "special":
			Special(sender);
			break;
		}
		}	
	}
	public void Sniper(CommandSender sender){
		Player player = (Player)sender;
		kmh.gunKitsSetup(player, "ULR338");
		kmh.gunKitsSetup(player, "Python");
	}
	public void Shotgun(CommandSender sender){
		Player player = (Player)sender;
		kmh.gunKitsSetup(player, "Colt Model 1");
		kmh.gunKitsSetup(player, "Python");
	}
	public void Special(CommandSender sender){
		Player player = (Player)sender;
		kmh.gunKitsSetup(player, "Bazooka");
		kmh.gunKitsSetup(player, "Python");
	}
	public void AutoRifle(CommandSender sender){
		Player player = (Player)sender;
		kmh.gunKitsSetup(player, "m16");
		kmh.gunKitsSetup(player, "Python");
	}
}
