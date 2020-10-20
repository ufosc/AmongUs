package club.opensource;

import club.opensource.game.Team;
import com.google.common.io.ByteStreams;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

// TODO: add custom game state events

public final class AmongUs extends JavaPlugin {

  public Team impostors;
  public Team innocents;

  @Override
  public void onEnable() {
    // Plugin startup logic

    loadResource("config.yml");

    try {
      registerListeners();
    } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
      e.printStackTrace();
    }

    impostors = new Team("Impostors");
    innocents = new Team("Innocents");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }

  // used for loading resourcefiles such as "config.yml"
  private File loadResource(String resource) {
    File folder = getDataFolder();

    if (!folder.exists())
      folder.mkdir();

    File resourceFile = new File(folder, resource);

    try {
      if (!resourceFile.exists()) {
        resourceFile.createNewFile();
        try (InputStream in = getResource(resource); OutputStream out = new FileOutputStream(resourceFile)) {
          ByteStreams.copy(in, out);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return resourceFile;
  }

  private void registerListeners() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    File dir = new File("listener/");
    if (dir.exists()) {
      File[] files = dir.listFiles();
      for (File f : files != null ? files : new File[0]) {
        if (f.getName().endsWith(".class"))
          getServer().getPluginManager().registerEvents(
                  (Listener) Class.forName("club.opensource.listener" + "." + f.getName().substring(0, f.getName().length() - 6)).getDeclaredConstructor().newInstance(),
                  this);
      }
    }
  }
}
