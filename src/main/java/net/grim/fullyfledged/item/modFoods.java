package net.grim.fullyfledged.item;

import net.minecraft.world.food.FoodProperties;

public class modFoods {
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.3f).build();
    public static final FoodProperties GRILLED_CORN = new FoodProperties.Builder().nutrition(9)
            .saturationMod(0.6f).build();
    public static final FoodProperties POPCORN = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.2f).build();
}
