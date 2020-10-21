package club.ufopensource.util;

import org.bukkit.ChatColor;

public class StringUtils {
  public static String fmt(String msg) {
    if (msg == null) return "";

    return ChatColor.translateAlternateColorCodes('&', msg);
  }
}
