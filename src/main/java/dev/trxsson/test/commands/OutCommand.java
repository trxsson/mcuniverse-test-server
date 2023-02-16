package dev.trxsson.test.commands;

import dev.trxsson.test.utils.MessageTransformer;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.apache.logging.log4j.util.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class OutCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        var message = MessageTransformer.replaceUnicodeCharacters(Strings.join(Arrays.asList(args), ' '));
        sender.sendMessage(MiniMessage.miniMessage().deserialize(message));
        return false;
    }
}
