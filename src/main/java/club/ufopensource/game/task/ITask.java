package club.ufopensource.game.task;

import club.ufopensource.game.IInteractable;
import org.bukkit.Location;

import java.util.UUID;

public interface ITask<T extends Location> extends IInteractable {
  boolean isActive();
  UUID getCompleter();
}
