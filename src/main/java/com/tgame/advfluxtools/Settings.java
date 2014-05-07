package com.tgame.advfluxtools;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.Configuration;

import java.util.logging.Logger;

/**
 * @author tgame14
 * @since 29/04/14
 */
public class Settings
{
	public static final String ID = "advfluxtools";
	public static final String NAME = "Advanced Fluxian Tools";
	public static final String CHANNEL = ID;
	public static final String VERSION = "@VERSION@";
	public static final String AUTHOR = "@AUTHOR@";

	public static final String RESOURCE_LOCATION = ID + ":";

	public static final Logger LOGGER = Logger.getLogger(ID);
	static
	{
		LOGGER.setParent(FMLLog.getLogger());
	}
	public static Configuration CONFIGURATION;



}
