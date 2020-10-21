package club.ufopensource.game.task;

import org.bukkit.Location;

public abstract class Task implements ITask {

  private boolean isActive;
  private Location location;

  public Task(Location location) {
    isActive = false;
    this.location = location;
  }

  @Override
  public boolean isActive() {
    return isActive;
  }

  @Override
  public Location getLocation() {
    return location;
  }
}
