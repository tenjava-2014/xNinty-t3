package com.tenjava.entries.xNinty.t3;

import org.bukkit.plugin.java.JavaPlugin;

import com.tenjava.entries.xNinty.t3.Threads.DisasterGenerator;

public class TenJava extends JavaPlugin {
	
	TenJava instance = this; //Allow other classes to access the methods
	
	// More complex onEnable possibly coming soon
	public void onEnable() {
		getLogger().info("Plugin enabled.");
		getConfig().options().copyDefaults(true);
		saveConfig();
		DisasterUtils.changeCooldown = false;
		DisasterUtils.disasterCooldown = 168000;
		new Thread(new DisasterGenerator(instance)).run();
		
	}
	
	/**
	 * @param s
	 * Path to fetch from
	 * @return
	 * Int in path s
	 */
	public int fetchConfigInt(String s) {
		return getConfig().getInt(s); //Fetch an int from the config
	}
	
	public void putDisasterOnCooldown() {
		DisasterUtils.disasterCooldown = getConfig().getInt("disasterCooldown");
		DisasterUtils.changeCooldown = true;
		//Create a cooldown and allow it to be changed
	}

	
	
}
