package com.exline.barkcarpets;

import com.exline.barkcarpets.init.BlockInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BarkCarpets implements ModInitializer {

    public static final String MOD_ID = "barkcarpets";

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(
                    new Identifier(MOD_ID, "tab"))
            .displayName(Text.literal("Bark Carpets"))
            .icon(() -> new ItemStack(BlockInit.OAK_BARK_CARPET))
            .build();

    @Override
    public void onInitialize() {
        BlockInit.registerBlocks();
    }
}

