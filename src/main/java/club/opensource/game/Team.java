package club.opensource.game;

import java.util.ArrayList;
import java.util.UUID;

public class Team extends ArrayList<UUID> {
  private final String name;
  public Team(String name) {
    this.name = name;
  }

  @Override
  public boolean add(UUID uuid) {
    if (!contains(uuid)) {
      super.add(uuid);
      return true;
    }

    return false;
  }

  public String getName() { return name; }
}
