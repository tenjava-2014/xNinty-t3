package com.tenjava.entries.xNinty.t3.Handlers;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.tenjava.entries.xNinty.t3.TenJava;

public class HeatWaveHandler {
	TenJava instance;
	
	public HeatWaveHandler(TenJava t) {
		this.instance = t;
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
		for (int x = 0; x < 32; x++) {
			for (int y = 0; y < 32; y++) {
				for (int z = 0; z < 32; z++) {
					Location l = p.getLocation();
					l.setX(l.getX() + x - 16);
					l.setY(l.getY() + y - 16);
					l.setZ(l.getZ() + z - 16);
					if (l.getBlock().getType().equals(Material.GRASS)) {
						Random r = new Random(10);
						if (r.nextInt(5) == 1) {
							l.getBlock().setType(Material.DIRT);
							if (r.nextInt(2) == 1) {
								l.setY(l.getY() + 1);
								l.getBlock().setType(Material.FIRE);
							}
						}
					}
				}
			}
		}
		}
	}

}
