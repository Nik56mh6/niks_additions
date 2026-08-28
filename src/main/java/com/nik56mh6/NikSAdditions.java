package com.nik56mh6;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.nik56mh6.ItemScripts.*;

public class NikSAdditions implements ModInitializer {
	public static final String MOD_ID = "niksadditions";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// for future use with mixin
	// public static final double HAPPY_GHAST_MOUNTED_SPEED = 0.7;
	// public static final double HAPPY_GHAST_UNMOUNTED_SPEED = 0.07;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.initialize();
		ModSounds.register();

		LOGGER.info("Nik's additions have loaded correctly!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
