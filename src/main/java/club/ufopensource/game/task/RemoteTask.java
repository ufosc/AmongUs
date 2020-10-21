package club.ufopensource.game.task;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * A remote task is one the requires teleporation.
 */
public abstract class RemoteTask extends Task {
  private Location source;
  private Location destination;
  public RemoteTask(Location source, Location destination, UUID completer) {
    super(completer);
    this.source = source;
    this.destination = destination;
  }

  public void sendToSource() {
    Player p = Bukkit.getPlayer(getCompleter());
    if (p != null && p.isOnline())
      p.teleport(source);
  }

  public void sendToDestination() {
    Player p = Bukkit.getPlayer(getCompleter());
    if (p != null && p.isOnline())
      p.teleport(destination);
  }

  public Location getSource() {
    return source;
  }

  public Location getDestination() {
    return destination;
  }
}
