package com.tenjava.entries.xNinty.t3.Threads;

import java.util.Random;

import org.bukkit.Bukkit;

import com.tenjava.entries.xNinty.t3.DisasterUtils;
import com.tenjava.entries.xNinty.t3.TenJava;

public class DisasterGenerator implements Runnable {
	
	TenJava instance;

	@Override
	public void run() {
		Random r = new Random(instance.fetchConfigInt("LightningStormSeed"));
		while(true) {
			if (DisasterUtils.disasterCooldown == 0) {
				int i = r.nextInt(instance.fetchConfigInt("LightningStormOdds")); //LightningStormOdds is the odds of creating a lightning storm every tick
				if (i == 1) {
					//TODO Create a Lightning Storm!
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Bukkit.shutdown();
			}
		}
		
	}
	
	public DisasterGenerator(TenJava t) {
		this.instance = t;
	}
	
	
	
	

}
