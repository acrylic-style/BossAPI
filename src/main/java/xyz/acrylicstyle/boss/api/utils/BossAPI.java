package xyz.acrylicstyle.boss.api.utils;

import com.google.common.util.concurrent.AtomicDouble;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.Collection;

import java.util.UUID;

public interface BossAPI {
    /**
     * Get boss definition.
     * @return Boss definition
     */
    @NotNull
    BossDefinitionAPI getDefinition();

    /**
     * Summons new boss at specified location.
     * @param location A location that boss will spawn.
     * @throws IllegalArgumentException When boss entity instance has already set.
     */
    void summonBoss(Location location) throws IllegalArgumentException;

    /**
     * Decreases health by <i>health</i>.
     * @param health Damage that boss will take.
     */
    void decreaseHealth(double health);

    /**
     * Set boss health.
     * @param health Boss health.
     */
    void setHealth(double health);

    /**
     * Get current health of the boss.
     * @return Current health of the boss.
     */
    double getHealth();

    /**
     * Get max health of the boss.
     * @return Max health of the boss.
     */
    double getMaxHealth();

    /**
     * Get boss entity.
     * @return Boss entity.
     */
    @Nullable
    LivingEntity getBossEntity();

    /**
     * Get damages that players will take.<br>
     * This method just does this math:
     * <pre>base + (level / base)</pre>
     * @param base Base damage
     * @return Damage
     */
    double getDamage(double base);

    Collection<UUID, AtomicDouble> getParticipants();
}
