package net.axelandre42.electricalrevolution;

import net.axelandre42.electricalrevolution.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "ElectricalRevolution")
public class ElectricalRevolution {

	@Instance(value = "ElectricalRevolution")
	public static ElectricalRevolution instance;
	
	@SidedProxy(serverSide = "net.axelandre42.electricalrevolution.server.ServerProxy", clientSide = "net.axelandre42.electricalrevolution.client.ClientProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
