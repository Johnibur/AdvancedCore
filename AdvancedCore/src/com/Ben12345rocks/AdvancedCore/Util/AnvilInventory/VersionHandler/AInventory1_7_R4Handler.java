package com.Ben12345rocks.AdvancedCore.Util.AnvilInventory.VersionHandler;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Ben12345rocks.AdvancedCore.Utils;
import com.Ben12345rocks.AdvancedCore.Util.AnvilInventory.AInventory.AnvilClickEventHandler;
import com.Ben12345rocks.AdvancedCore.Util.AnvilInventory.AInventory.AnvilSlot;

/**
 * The Class AInventory1_7_R4Handler.
 */
public class AInventory1_7_R4Handler implements AInventoryVersionHandler {

	/**
	 * Instantiates a new a inventory 1 7 R 4 handler.
	 *
	 * @param player
	 *            the player
	 * @param anvilClickEventHandler
	 *            the anvil click event handler
	 */
	public AInventory1_7_R4Handler(final Player player, AnvilClickEventHandler anvilClickEventHandler) {
		Utils.getInstance().setPlayerMeta(player, "AInventory", anvilClickEventHandler);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Ben12345rocks.AdvancedCore.Util.AnvilInventory.VersionHandler.
	 * AInventoryVersionHandler#loadClasses()
	 */
	@Override
	public void loadClasses() {

	}

	/** The inv. */
	private Inventory inv;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Ben12345rocks.AdvancedCore.Util.AnvilInventory.VersionHandler.
	 * AInventoryVersionHandler#open(org.bukkit.entity.Player,
	 * java.util.HashMap)
	 */
	@Override
	public void open(Player player, HashMap<AnvilSlot, ItemStack> items) {
		player.sendMessage("Anvils on 1.7.10 are not supported, sorry!");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Ben12345rocks.AdvancedCore.Util.AnvilInventory.VersionHandler.
	 * AInventoryVersionHandler#getInventory()
	 */
	@Override
	public Inventory getInventory() {

		return inv;
	}

}
