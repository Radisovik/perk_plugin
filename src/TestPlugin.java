import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class TestPlugin extends JavaPlugin implements Listener {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void itemPickedUp(EntityPickupItemEvent event) {
        getServer().getLogger().info("Item Picked up: " + event.getItem().getName() + " by " + event.getEntity().getName());
        if (event.getItem().getName().equals("Crown")) {
            PotionEffect potionEffect = new PotionEffect(PotionEffectType.HEALTH_BOOST, 9999999, 1);
            event.getEntity().addPotionEffect(potionEffect);
        }
    }
}
