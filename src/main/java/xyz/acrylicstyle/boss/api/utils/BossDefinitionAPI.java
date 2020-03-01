package xyz.acrylicstyle.boss.api.utils;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import util.CollectionList;

public interface BossDefinitionAPI {
    /**
     * Get unique id of this boss.
     * @return Unique id of this boss.
     */
    String getId();

    /**
     * Get max health of this boss.
     * @return Max health of this boss.
     */
    double getMaxHealth();

    /**
     * Get custom name used for boss.
     * @return Custom name used for the boss.
     */
    String getCustomName();

    /**
     * Get level of the boss.
     * @return Level of the boss.
     */
    int getLevel();

    /**
     * Get rewards given on boss death.
     * @return Boss Rewards.
     */
    CollectionList<ItemStack> getRewards();

    /**
     * Convert LivingEntity + BossDefinitionAPI into boss instance.
     * @param entity An entity
     * @return New boss instance
     */
    BossAPI toBoss(LivingEntity entity);

    /**
     * Summons boss at specified location.
     * @param location A location that boss will spawn.
     * @return New boss instance
     */
    BossAPI summonBoss(Location location);
}
