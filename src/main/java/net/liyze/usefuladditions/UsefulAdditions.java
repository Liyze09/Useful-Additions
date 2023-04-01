package net.liyze.usefuladditions;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulAdditions implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String ID = "useful_additions"
	@Override
	public void onInitialize() {
		LOGGER.info("Useful Additions");
	}
}
