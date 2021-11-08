package com.juh9870.pooptrain;

import com.juh9870.pooptrain.integrations.enderstorage.EnderStorageRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("pooptrain")
public class PoopTrain {
	public static int managerGeneration = 0;

	public static final Logger LOGGER = LogManager.getLogger();
	public PoopTrain() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(PoopTrain::init);
	}

	public static void init(FMLCommonSetupEvent event) {
        if(ModList.get().isLoaded("enderstorage")){
            EnderStorageRegistry.register();
        }
	}
}
