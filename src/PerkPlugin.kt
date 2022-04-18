import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerLoginEvent
import org.bukkit.plugin.java.JavaPlugin


class PerkPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        super.getServer().pluginManager.registerEvent(this, this)
    }

    @EventHandler
    fun normalLogin(event: PlayerLoginEvent?) {
        // Some code here
    }
}
