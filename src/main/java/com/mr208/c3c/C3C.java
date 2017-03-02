package com.mr208.c3c;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.mr208.c3c.proxy.IProxy;

@Mod(modid = C3C.MOD_ID, name = C3C.MOD_NAME, version = C3C.MOD_VERSION, dependencies = C3C.MOD_DEPENDENCIES)
public class C3C {

	public final static String MOD_ID = "c3c";
	public final static String MOD_NAME = "Clarke's Third Compat";
	public final static String MOD_VERSION = "@VERSION@";
	public final static String MOD_DEPENDENCIES = "required-after:Mekanism;after:base";
	public final static String PROXY_CLIENT = "com.mr208.c3c.proxy.ClientProxy";
	public final static String PROXY_SERVER = "com.mr208.c3c.proxy.ServerProxy";


	@Mod.Instance(C3C.MOD_ID)
	public static C3C instance;

	@SidedProxy(clientSide = C3C.PROXY_CLIENT, serverSide = C3C.PROXY_SERVER, modId = C3C.MOD_ID)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.onPreInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.onInit(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.onPostInit(event);
	}

}
