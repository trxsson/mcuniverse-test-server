package dev.trxsson.test;

import dev.trxsson.test.commands.OutCommand;
import dev.trxsson.test.commands.PlayerListCommand;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class TestServer extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Objects.requireNonNull(Bukkit.getPluginCommand("out")).setExecutor(new OutCommand());
        Objects.requireNonNull(Bukkit.getPluginCommand("playerlist")).setExecutor(new PlayerListCommand());
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event) {
        if (event.toWeatherState()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onThunderChange(ThunderChangeEvent event) {
        if (event.toThunderState()) {
            event.setCancelled(true);
        }
    }
}
