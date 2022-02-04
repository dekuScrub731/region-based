package com.regionbased;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.discord.*;

@Slf4j
@PluginDescriptor(
	name = "Example"
)
public class RegionBasedPlugin extends Plugin
{

	private int regionID = -1;
	private RegionBasedDefinition region;

	@Inject
	private Client client;

	@Inject
	private RegionBasedConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			regionID = WorldPoint.fromLocalInstance(client, client.getLocalPlayer().getLocalLocation()).getRegionID();
			region = RegionBasedDefinition.fromRegion(regionID);



			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Area Name: " + region.getAreaName(), null);
		}
	}

	@Provides
	RegionBasedConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RegionBasedConfig.class);
	}
}
