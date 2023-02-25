package org.mineacademy.template;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.util.Vector;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplate extends SimplePlugin {
	/**
	 * apple is yummy
	 */
	int apple = 5;
	int firstNumber = 10;
	int secondNumber = 15;

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {
		// This prints a 1 in the console when the plugin is enabled
		System.out.println(1);
		// This prints a "test2idiot5" in the console when the plugin is enabled.
		System.out.println("test" + (1 + 1) + "idiot" + (apple));

	}

	@Override
	protected void onPluginStop() {

		apple = 3;

		System.out.println(1);
		System.out.println("GoodBye" + (1 + 2) + "SweetCheeeks" + (apple));

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		boolean onGround = event.getRightClicked().isOnGround();
		if (onGround == true) {
			event.getRightClicked().setVelocity(new Vector(0, 2, 0));
		}


		//if (event.getRightClicked().getType() == EntityType.COW)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 15);
	}

	int theAddMachine(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		result = result + 1;
		return result;
	}
}

