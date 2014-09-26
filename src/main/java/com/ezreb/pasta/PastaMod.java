package com.ezreb.pasta;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(name = PastaMod.NAME, modid = PastaMod.MODID, version = PastaMod.VERSION)
public class PastaMod
{
    public static final String MODID = "PastaMod";
    public static final String VERSION = "0.0.1";
    public static final String NAME = "MrabEzreb's Iridium Mod";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("I'm messed up, so are you, I ate lots of pa-sta");
        System.out.println("With a great big hug, and a kiss from blocks to you.");
        System.out.println("Won't you say you'll play, this, mod.");
    }
}
