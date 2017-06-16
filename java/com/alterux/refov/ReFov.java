package com.alterux.refov;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(acceptedMinecraftVersions = ReFov.ACCEPTEDVERSION, modid = ReFov.MODID, name = ReFov.MODNAME, version = ReFov.VERSION)

public class ReFov {
	public static final String ACCEPTEDVERSION = "1.11.2";
	public static final String MODID = "refov";
	public static final String MODNAME = "Removed Effects FOV";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void fovUpdate(FOVUpdateEvent event) {
		float fov = 1.0F;
		if (event.getEntity().isSprinting())
			fov = 1.15F;
		event.setNewfov(fov);
	}

}