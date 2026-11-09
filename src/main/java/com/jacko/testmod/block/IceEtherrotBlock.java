package com.jacko.testmod.block;

import com.jacko.testmod.item.TMItems;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class IceEtherrotBlock extends CropBlock {
    public IceEtherrotBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return TMItems.ICE_ETHERROT;
    }
}
