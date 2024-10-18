package com.strubium.goback.config;

import com.strubium.goback.Tags;
import net.minecraftforge.common.config.Config;

@Config(modid = Tags.MOD_ID)
public class GoBackConfig {


    @Config.Name("Slow Factor")
    @Config.Comment("The speed to slow the player down by")
    @Config.RangeDouble(min = 0, max = 1.0)
    @Config.RequiresMcRestart
    public static double slowFactor = 0.5;
}