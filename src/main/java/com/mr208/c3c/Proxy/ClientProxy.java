package com.mr208.c3c.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public ClientProxy getClientProxy(){
		return this;
	}

	@Override
	public void onPreInit(FMLPreInitializationEvent event) {
		super.onPreInit(event);
	}

	@Override
	public void onInit(FMLInitializationEvent event) {
		super.onInit(event);
	}

	@Override
	public void onPostInit(FMLPostInitializationEvent event) {
		super.onPostInit(event);
	}
}
