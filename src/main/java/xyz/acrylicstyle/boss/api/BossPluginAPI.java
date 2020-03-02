package xyz.acrylicstyle.boss.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.Collection;
import util.CollectionList;
import xyz.acrylicstyle.boss.api.utils.BossAPI;
import xyz.acrylicstyle.boss.api.utils.BossDefinitionAPI;

import java.util.UUID;

public interface BossPluginAPI {
    /**
     * Returns list of boss definitions files.
     * @return Boss definition files.
     */
    @NotNull
    CollectionList<String> getBossDefinitionFiles();

    /**
     * Returns list of all loaded boss definitions.
     * @return List of boss definitions.
     */
    @NotNull
    CollectionList<BossDefinitionAPI> getBossDefinitions();

    /**
     * @return Cached value of {@link BossPluginAPI#getBossDefinitions()}.
     */
    @NotNull
    CollectionList<BossDefinitionAPI> getBossDefinitionsCached();

    /**
     * Get boss definition by id.
     * @param id Unique id of boss definition.
     * @return Boss definition found by id.
     */
    @Nullable
    BossDefinitionAPI getBossDefinitionById(String id);

    /**
     * Get boss by their UUID.
     * @param uuid UUID of the boss entity.
     * @return Boss entity.
     */
    @Nullable
    BossAPI getBossByUniqueId(UUID uuid);

    /**
     * Get all active bosses.
     * @return All active bosses.
     */
    @NotNull
    Collection<UUID, BossAPI> getBosses();
}
