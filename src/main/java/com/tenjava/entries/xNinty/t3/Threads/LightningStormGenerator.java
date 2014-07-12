package com.tenjava.entries.xNinty.t3.Threads;

import java.util.Random;

import com.tenjava.entries.xNinty.t3.DisasterUtils;
import com.tenjava.entries.xNinty.t3.TenJava;

public class LightningStormGenerator implements Runnable {
	
	TenJava instance;

	@Override
	public void run() {
		Random r = new Random(instance.fetchConfigInt("LightningStormSeed"));
		while(true) {
			if (DisasterUtils.disasterCooldown == 0) {
				int i = r.nextInt(instance.fetchConfigInt("LightningStormOdds"));
				if (i == 1) {
					//Create a Lightning Storm!
				}
			}
		}
		
	}
	
	public LightningStormGenerator(TenJava t) {
		this.instance = t;
	}
	
	
	
	

}
