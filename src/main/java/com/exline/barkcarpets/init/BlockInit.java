package com.exline.barkcarpets.init;

import com.exline.barkcarpets.BarkCarpets;
import com.exline.barkcarpets.block.BarkCarpetBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
    public static final BarkCarpetBlock OAK_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock SPRUCE_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock BIRCH_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock DARK_OAK_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock JUNGLE_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock ACACIA_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock MANGROVE_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock CRIMSON_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));
    public static final BarkCarpetBlock WARPED_BARK_CARPET = new BarkCarpetBlock(FabricBlockSettings.of(Material.WOOD).strength(0.1f,0.1f));

    public static void registerBlocks() {
        registerBlock("oak_bark_carpet", OAK_BARK_CARPET);
        registerBlock("spruce_bark_carpet", SPRUCE_BARK_CARPET);
        registerBlock("birch_bark_carpet", BIRCH_BARK_CARPET);
        registerBlock("dark_oak_bark_carpet", DARK_OAK_BARK_CARPET);
        registerBlock("jungle_bark_carpet", JUNGLE_BARK_CARPET);
        registerBlock("acacia_bark_carpet", ACACIA_BARK_CARPET);
        registerBlock("mangrove_bark_carpet", MANGROVE_BARK_CARPET);
        registerBlock("crimson_bark_carpet", CRIMSON_BARK_CARPET);
        registerBlock("warped_bark_carpet", WARPED_BARK_CARPET);
    }

    public static void registerBlock(String name, BarkCarpetBlock block) {
        Registry.register(Registry.BLOCK, new Identifier(BarkCarpets.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(BarkCarpets.MOD_ID, name), new BlockItem(block, new Item.Settings().group(BarkCarpets.ITEM_GROUP)));
    }
}