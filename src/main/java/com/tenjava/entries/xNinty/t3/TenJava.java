package com.tenjava.entries.xNinty.t3;

import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {
	
	// More complex onEnable possibly coming soon
	public void onEnable() {
		getLogger().info("Plugin enabled.");
		
	}
	
	public void putDisasterOnCooldown() {
		DisasterUtils.disasterCooldown = getConfig().getInt("disasterCooldown");
	}

	
	
}
