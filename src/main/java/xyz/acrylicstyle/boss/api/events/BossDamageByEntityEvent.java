package xyz.acrylicstyle.boss.api.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import xyz.acrylicstyle.boss.api.utils.BossAPI;

public class BossDamageByEntityEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private BossAPI boss;
    private double damage;
    private boolean cancelled = false;
    private double finalDamage = 0;

    public BossDamageByEntityEvent(@NotNull BossAPI what, double damage) {
        this.boss = what;
        this.damage = damage;
    }

    public BossAPI getBoss() {
        return boss;
    }

    /**
     * Get damage.
     * @return Damage
     */
    public double getDamage() {
        return damage;
    }

    /**
     * Get final damage. It is 0 by default.
     * @return Final damage
     */
    public double getFinalDamage() {
        return finalDamage;
    }

    /**
     * Set final damage. It won't get affected by damage set from {@link BossDamageByEntityEvent#setDamage(double)}.<br />
     * Damage will be ignored if final damage is other than 0.
     * @param finalDamage Final damage
     */
    public void setFinalDamage(double finalDamage) {
        this.finalDamage = finalDamage;
    }

    /**
     * Set damage.
     * Note that this damage will be recalculated and may does lower damage.<br />
     * Damage will be ignored if final damage is other than 0.
     * @param damage Damage
     */
    public void setDamage(double damage) {
        this.damage = damage;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
