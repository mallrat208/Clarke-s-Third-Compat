package com.mr208.c3c.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {

	void onPreInit(FMLPreInitializationEvent event);

	void onInit(FMLInitializationEvent event);

	void onPostInit(FMLPostInitializationEvent event);

	default ClientProxy getClientProxy() {
		return null;
	}


}
