package club.ufopensource.game.task;

import org.bukkit.Location;

import java.util.UUID;

public class OddOneOutTask extends RemoteTask {
  public OddOneOutTask(Location source, Location destination, UUID uuid) {
    super(source, destination, uuid);
  }

  // TODO: Spawn non-hostile mobs (3 skeletons, one zombie for example) and allow the player to shoot the odd one out with a bow or something of that nature
  // TODO: allow mobs to wander, if player shoots wrong one, round resets immediately
  @Override
  public void perform() {
    sendToDestination();
  }
}
