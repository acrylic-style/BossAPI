package xyz.acrylicstyle.boss.api.events;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;
import xyz.acrylicstyle.boss.api.utils.BossAPI;

public class BossDeathEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private BossAPI boss;

    public BossDeathEvent(@NotNull BossAPI what) {
        this.boss = what;
    }

    public BossAPI getBoss() {
        return boss;
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
}
