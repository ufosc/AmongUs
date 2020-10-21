package club.ufopensource.util;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.Arrays;

public class LocationUtil {
  public static Location parseLocation(String locStr) {
    locStr = locStr.replace("\\s", "");
    String[] args = locStr.split(",");
    return new Location(Bukkit.getWorld(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
  }
}
