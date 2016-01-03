package me.StevenLawson.TotalFreedomMod;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.CO_OWNERS;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.EXECUTIVES;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.SFM_DEVELOPERS;
import static me.StevenLawson.TotalFreedomMod.TFM_Util.SYS_ADMINS;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class TylerUtilities {

    public static boolean isHighRank(Player player) {
        String name = player.getName();
        if (SYS_ADMINS.contains(name)
                || EXECUTIVES.contains(name)
                || SFM_DEVELOPERS.contains(name)
                || TFM_ConfigEntry.SERVER_OWNERS.getList().contains(name)
                || CO_OWNERS.contains(name)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isHighRank(CommandSender sender) {
        if (!(sender instanceof Player)) {
            return true;
        }
        return isHighRank((Player) sender);
    }

    public static void spawnMob(Player player, EntityType entity, int amount) {
        int i = 0;
        do {
            player.getWorld().spawnEntity(player.getLocation(), entity);
            i++;
        } while (i <= amount);
    }

    public static void asciiDog() {
        //This was VERY annoying to make!
        TFM_Util.bcastMsg("                     ,", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                ,.  | \\ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("               |: \\ ; :\\ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("               :' ;\\| ::\\", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                \\ : | `::\\ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                _)  |   `:`. ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("              ,' , `.    ;: ; ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("            ,' ;:  ;\"'  ,:: |", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("           /,   ` .    ;::: |:`-.__ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("        _,' _o\\  ,::.`:' ;  ;   . ' ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("    _,-'           `:.          ;\"\"", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg(" ,-'                     ,:         `-;, ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg(" \\,                       ;:           ;--._ ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("  `.______,-,----._     ,' ;:        ,/ ,  ,` ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("         / /,-';'  \\     ; `:      ,'/,::.::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("       ,',;-'-'_,--;    ;   :.   ,',',;:::::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("      ( /___,-'     `.     ;::,,'o/  ,::::::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("       `'             )    ;:,'o /  ;\"-   -:: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                      \\__ _,'o ,'         ,:: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                         ) `--'       ,..:::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                         ; `.        ,::::::: ", TFM_Util.randomChatColor());
        TFM_Util.bcastMsg("                          ;  ``::.    ::::::: ", TFM_Util.randomChatColor());
    }

    public static void asciiHorse() {
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + ",  ,.~\"\"\"\"\"~~..");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + " )\\,)\\`-,       `~._                                     .--._");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + " \\  \\ | )           `~._                   .-\"\"\"\"\"-._   /     `.");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "/ ('  ( _(\\            `~~,__________..-\"'          `-<        \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + " )   )   `   )/)   )        \\                            \\,-.     |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "') /)`      \\` \\,-')/\\      (                             \\ /     |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "(_(\\ /7      |.   /'  )'  _(`                              Y      |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "   \\       (  `.     ')_/`                                |      /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "     \\       \\   \\                                         |)    (");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "      \\ _  /\\/   /                                         (      `~.");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "       `-._)     |                                        / \\        `,");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                |                          |           .'   )      (`");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                \\                        _,\\          /     \\_    (`");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                  `.,      /       __..'7\"  \\         |       )  (");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                  .'     _/`-..--\"\"      `.   `.        \\      `._/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                .'    _.j     /            `-.  `.       \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "              .'   _.'   \\    |               `.  `.      \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "             |   .'       ;   ;               .'  .'`.     \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "             \\_  `.       |   \\             .'  .'   /    .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "               `.  `-, __ \\   /           .'  .'     |   (");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                 `.  `'` \\|  |           /  .-`     /   .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                   `-._.--t  ;          |_.-)      /  .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                          ; /           \\  /      / .'");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         / /             `'     .' /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                        /,_\\                  .',_(");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                       /___(                 /___(");
    }

    public static void asciiUnicorn() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.playSound(player.getLocation(), Sound.FIREWORK_TWINKLE, 1.0F, 1.0F);
        }
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                                         ,/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                                        //");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                                      ,//");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                          ___   /|   |//");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                      `__/\\_ --(/|___/-/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                   \\|\\_-\\___ __-_`- /-/ \\.");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                  |\\_-___,-\\_____--/_)' ) \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                   \\ -_ /     __ \\( `( __`\\|");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                                   `\\__|      |\\)\\ ) /(/|");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           ,._____.,            ',--//-|      \\  |  '   /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "          /     __. \\,          / /,---|       \\       /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        |  | ( (  \\   |      ,/\\'__/'/          |     |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        |  \\  \\`--, `_/_------______/           \\(   )/");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        | | \\  \\_. \\,                            \\___/\\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        | |  \\_   \\  \\                                 \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "        \\ \\    \\_ \\   \\   /                             \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "         \\ \\  \\._  \\__ \\_|       |                       \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "          \\ \\___  \\      \\       |                        \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           \\__ \\__ \\  \\_ |       \\                         |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           |  \\_____ \\  ____      |                           |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           | \\  \\__ ---' .__\\     |        |                 |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "           \\  \\__ ---   /   )     |        \\                /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "            \\   \\____/ / ()(      \\          `---_         /|");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "             \\__________/(,--__    \\_________.    |       ./ |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "               |     \\ \\  `---_\\--,           \\   \\_,./   |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "               |      \\  \\_ ` \\    /`---_______-\\   \\\\    /");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                \\      \\.___,`|   /              \\   \\\\   \\");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                 \\     |  \\_ \\|   \\              (   |:    |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                  \\    \\      \\    |             /  / |    ;");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                   \\    \\      \\    \\          ( `_'   \\  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                    \\.   \\      \\.   \\          `__/   |  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                      \\   \\       \\.  \\                |  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                       \\   \\        \\  \\               (  )");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                        \\   |        \\  |                |  |");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         |  \\         \\ \\               I  `");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         ( __;        ( _;                ('-_';");
        TFM_Util.bcastMsg(TFM_Util.randomChatColor() + "                         |___\\       \\___:              \\___:");
    }

    public static boolean inGod(Player player) {
        return TFM_PlayerData.getPlayerData(player).inGod();
    }

    public static void setGod(Player player, boolean enabled) {
        TFM_PlayerData.getPlayerData(player).setGod(enabled);
    }

    public static void SeniorAdminChatMessage(CommandSender sender, String message, boolean senderIsConsole) {
        String name = sender.getName() + " " + TFM_PlayerRank.fromSender(sender).getPrefix() + ChatColor.WHITE;
        TFM_Log.info("[Senior-Admin] " + name + ": " + message);

        for (Player player : Bukkit.getOnlinePlayers()) {
            if (TFM_AdminList.isSeniorAdmin(player)) {
                player.sendMessage(ChatColor.AQUA + "[" + ChatColor.RED + "SrA Chat" + ChatColor.AQUA + "] " + ChatColor.DARK_RED + name + ": " + ChatColor.RED + message);
            }
        }
    }

    public static boolean isDoubleJumper(Player player) {
        return TFM_PlayerData.getPlayerData(player).isDoubleJumper();
    }

    public static void setDoubleJumper(Player player, boolean state) {
        TFM_PlayerData.getPlayerData(player).setDoubleJumper(state);
    }

    public static String getPlayerFromIp(String ip) {
        for (TFM_Player player : TFM_PlayerList.getAllPlayers()) {
            if (player.getIps().contains(ip)) {
                return " " + player.getLastLoginName();
            }
        }
        return "";
    }
}
