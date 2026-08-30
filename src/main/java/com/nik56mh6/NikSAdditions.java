package com.nik56mh6;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nik56mh6.ItemScripts.*;

public class NikSAdditions implements ModInitializer {
	public static final String MOD_ID = "niksadditions";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.initialize();
		ModSounds.register();
		ServerTickEvents.START_SERVER_TICK.register(this::onServerTick);

		LOGGER.info("Nik's additions have loaded correctly!");
	}

	private void onServerTick(MinecraftServer server) {
		boolean isImmediateRespawnRuleSet = false;

		boolean immediateRespawnRule = server.getGameRules().get(net.minecraft.world.level.gamerules.GameRules.IMMEDIATE_RESPAWN);
		if(!immediateRespawnRule == isImmediateRespawnRuleSet) return; {
			server.getGameRules().set(net.minecraft.world. level.gamerules.GameRules.IMMEDIATE_RESPAWN, true, server);
		}
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
