package club.ufopensource.game.task;

import club.ufopensource.game.IInteractable;
import org.bukkit.Location;

public interface ITask<T extends Location> extends IInteractable {
  boolean isActive();
  Location getLocation();
}
