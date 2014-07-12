package com.tenjava.entries.xNinty.t3.Handlers;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.tenjava.entries.xNinty.t3.TenJava;

public class LightningStormPlayer {
	
	TenJava instance;
	
	public LightningStormPlayer (TenJava t) {
		this.instance = t;
		
	}
	
	//Smite 20 blocks around every player with lightning!
	private void LightningStormPlayers() {
		for(Player p : Bukkit.getServer().getOnlinePlayers()) {
			p.sendMessage(ChatColor.RED + "A Lightning Storm has occurred!");
			


		}
		
	}

}
