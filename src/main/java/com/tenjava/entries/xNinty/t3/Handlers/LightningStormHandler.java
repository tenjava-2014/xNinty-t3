package com.tenjava.entries.xNinty.t3.Handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.tenjava.entries.xNinty.t3.TenJava;
import com.tenjava.entries.xNinty.t3.Threads.StormPlayer;

public class LightningStormHandler {
	
	TenJava instance;
	
	public LightningStormHandler (TenJava t) {
		this.instance = t;
		LightningStormPlayers();
		
	}
	
	//Smite 20 blocks around every player with lightning!
	private void LightningStormPlayers() {
		for(Player p : Bukkit.getServer().getOnlinePlayers()) {
			p.sendMessage(ChatColor.RED + "A Lightning Storm has occurred!");
			


		}
		new Thread(new StormPlayer(instance.getServer().getOnlinePlayers())).run();
		
	}

}
