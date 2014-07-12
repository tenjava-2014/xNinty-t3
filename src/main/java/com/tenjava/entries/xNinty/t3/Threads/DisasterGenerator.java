package com.tenjava.entries.xNinty.t3.Threads;

import java.util.Random;

import org.bukkit.Bukkit;

import com.tenjava.entries.xNinty.t3.DisasterUtils;
import com.tenjava.entries.xNinty.t3.TenJava;
import com.tenjava.entries.xNinty.t3.Handlers.HeatWaveHandler;
import com.tenjava.entries.xNinty.t3.Handlers.LightningStormHandler;

public class DisasterGenerator implements Runnable {
	
	TenJava instance;

	@Override
	public void run() {
		Random r = new Random(instance.fetchConfigInt("LightningStormSeed"));
		while(true) {
			if (DisasterUtils.disasterCooldown == 0) {
				int i = r.nextInt(instance.fetchConfigInt("LightningStormOdds")); //LightningStormOdds is the odds of creating a lightning storm every tick
				if (i == 1) {
					i = r.nextInt(2);
					if (i == 1) {
						new LightningStormHandler(instance);
					}
					if (i == 2) {
						new HeatWaveHandler(instance);
					}
				}
			}
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				Bukkit.shutdown();
			}
		}
		
	}
	
	public DisasterGenerator(TenJava t) {
		this.instance = t;
	}
	
	
	
	

}
