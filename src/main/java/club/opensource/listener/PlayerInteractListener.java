package club.opensource.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {
  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent e) {
    if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
      // TODO: perform actions (open guis) when work blocks are right-clicked
    }
  }
}
