package dev.trxsson.test.commands;

import dev.trxsson.test.utils.MessageTransformer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.apache.logging.log4j.util.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class PlayerListCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) return false;
        var message = MessageTransformer.replaceUnicodeCharacters(Strings.join(Arrays.asList(args), ' '));
        var component = MiniMessage.miniMessage().deserialize(message);
        player.playerListName(component);
        sender.sendMessage(Component.text("Set player list name to: ").append(component));
        return false;
    }
}
