package com.uraneptus.sullysmod.core.data.server.tags;

import com.uraneptus.sullysmod.SullysMod;
import com.uraneptus.sullysmod.core.other.tags.SMItemTags;
import com.uraneptus.sullysmod.core.registry.SMBlocks;
import com.uraneptus.sullysmod.core.registry.SMItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public class SMItemTagsProvider extends ItemTagsProvider {

    public SMItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, pProvider, blockProvider, SullysMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //Mod Tags
        tag(SMItemTags.TORTOISE_FOOD).add(
                Items.MELON_SLICE,
                Items.GLOW_BERRIES,
                Items.SWEET_BERRIES,
                Items.APPLE
        );

        //Minecraft Tags
        tag(ItemTags.BUTTONS).add(
                SMBlocks.COPPER_BUTTON.get().asItem(),
                SMBlocks.EXPOSED_COPPER_BUTTON.get().asItem(),
                SMBlocks.WEATHERED_COPPER_BUTTON.get().asItem(),
                SMBlocks.OXIDIZED_COPPER_BUTTON.get().asItem(),
                SMBlocks.WAXED_COPPER_BUTTON.get().asItem(),
                SMBlocks.WAXED_EXPOSED_COPPER_BUTTON.get().asItem(),
                SMBlocks.WAXED_WEATHERED_COPPER_BUTTON.get().asItem(),
                SMBlocks.WAXED_OXIDIZED_COPPER_BUTTON.get().asItem()
        );
        tag(ItemTags.SLABS).add(
                SMBlocks.POLISHED_JADE_BRICK_SLAB.get().asItem(),
                SMBlocks.POLISHED_SMALL_JADE_BRICK_SLAB.get().asItem(),
                SMBlocks.POLISHED_JADE_TILE_SLAB.get().asItem(),
                SMBlocks.POLISHED_JADE_SHINGLE_SLAB.get().asItem(),
                SMBlocks.ROUGH_JADE_BRICK_SLAB.get().asItem(),
                SMBlocks.ROUGH_JADE_TILE_SLAB.get().asItem(),
                SMBlocks.SMOOTHED_ROUGH_JADE_SLAB.get().asItem()
        );
        tag(ItemTags.STAIRS).add(
                SMBlocks.POLISHED_JADE_BRICK_STAIRS.get().asItem(),
                SMBlocks.POLISHED_SMALL_JADE_BRICK_STAIRS.get().asItem(),
                SMBlocks.POLISHED_JADE_TILE_STAIRS.get().asItem(),
                SMBlocks.POLISHED_JADE_SHINGLE_STAIRS.get().asItem(),
                SMBlocks.ROUGH_JADE_BRICK_STAIRS.get().asItem(),
                SMBlocks.ROUGH_JADE_TILE_STAIRS.get().asItem(),
                SMBlocks.SMOOTHED_ROUGH_JADE_STAIRS.get().asItem()
        );
        tag(ItemTags.FISHES).add(
                SMItems.LANTERNFISH.get(),
                SMItems.COOKED_LANTERNFISH.get(),
                SMItems.PIRANHA.get(),
                SMItems.COOKED_PIRANHA.get()
        );
        tag(ItemTags.MUSIC_DISCS).add(
                SMItems.MUSIC_DISC_SCOUR.get()
        );

        //Forge Tags
        tag(SMItemTags.RAW_LANTERNFISH).add(
                SMItems.LANTERNFISH.get()
        );
        tag(SMItemTags.RAW_PIRANHA).add(
                SMItems.PIRANHA.get()
        );
        tag(SMItemTags.RAW_FISHES).addTags(
                SMItemTags.RAW_LANTERNFISH,
                SMItemTags.RAW_PIRANHA
        );
        tag(SMItemTags.COOKED_LANTERNFISH).add(
                SMItems.COOKED_LANTERNFISH.get()
        );
        tag(SMItemTags.COOKED_PIRANHA).add(
                SMItems.COOKED_PIRANHA.get()
        );
        tag(SMItemTags.COOKED_FISHES).addTags(
                SMItemTags.COOKED_LANTERNFISH,
                SMItemTags.COOKED_PIRANHA
        );
        tag(Tags.Items.STORAGE_BLOCKS).add(
                SMBlocks.ROUGH_JADE_BLOCK.get().asItem(),
                SMBlocks.POLISHED_JADE_BLOCK.get().asItem()
        );
        tag(Tags.Items.ORES).addTag(
                SMItemTags.JADE_ORES
        );
        tag(SMItemTags.JADE_ORES).add(
                SMBlocks.JADE_ORE.get().asItem(),
                SMBlocks.DEEPSLATE_JADE_ORE.get().asItem()
        );
        tag(Tags.Items.ORES_IN_GROUND_STONE).add(
                SMBlocks.JADE_ORE.get().asItem()
        );
        tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(
                SMBlocks.DEEPSLATE_JADE_ORE.get().asItem()
        );
        tag(Tags.Items.TOOLS_SHIELDS).add(
                SMItems.JADE_SHIELD.get()
        );
    }
}
