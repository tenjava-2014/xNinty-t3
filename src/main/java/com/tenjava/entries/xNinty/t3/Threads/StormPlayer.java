package com.tenjava.entries.xNinty.t3.Threads;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class StormPlayer implements Runnable {
	public StormPlayer(Player[] plist) {
		
	}

	@Override
	public void run() {
		for(int i = 0; i <= 20; i++) {
			for (Player p : Bukkit.getServer().getOnlinePlayers()) {
				Location l = p.getLocation();
				Random r = new Random();
				int n = r.nextInt(200);
				i = n - 100;
				l.setX((l.getX() + n));
				i = r.nextInt(200);
				i = n - 100;
				l.setZ((l.getZ() + n)); //finding a place to strike lightning
				l.getWorld().strikeLightning(l);
				l.getWorld().createExplosion(l, 2F);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
