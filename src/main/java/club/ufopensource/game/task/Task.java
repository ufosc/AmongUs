package club.ufopensource.game.task;

import org.bukkit.Location;

import java.util.UUID;

public abstract class Task implements ITask {

  private boolean isActive;
  private UUID completer;

  public Task(UUID completer) {
    this.isActive = false;
    this.completer = completer;
  }

  @Override
  public boolean isActive() {
    return isActive;
  }

  @Override
  public UUID getCompleter() {
    return completer;
  }
}
