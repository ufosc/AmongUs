package club.opensource.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageListener implements Listener {
  // TODO: prevent entity damage dependent on game state and if playing state and entities are on the same team
  @EventHandler
  public void onEntityDamage(EntityDamageByEntityEvent e) {

  }
}
