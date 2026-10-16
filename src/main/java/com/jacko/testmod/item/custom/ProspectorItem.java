package com.jacko.testmod.item.custom;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class ProspectorItem extends Item {
    public ProspectorItem(Properties properties) {
        super(properties);
    }
    
    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos posClicked = context.getClickedPos();
        Player player = context.getPlayer();
        Level level = context.getLevel();

        if (level.isClientSide()) return InteractionResult.PASS;

        boolean found = false;
        if (Minecraft.getInstance().hasShiftDown()) {
            for (int y = 0; y <= posClicked.getY() + 64; y++) {
                BlockPos pos = posClicked.below(y);
                BlockState blockState = level.getBlockState(pos);
                String name = blockState.getBlock().getName().getString();
                
                if (isCorrectBlock(blockState)) {
                    player.sendSystemMessage(Component.literal(String.format("Found %s!", name)));
                    player.sendSystemMessage(Component.literal(String.format("Pos: [%d, %d, %d]", pos.getX(), pos.getY(), pos.getZ())));
                    found = true;
                    break;
                }
            }
        } else {
            for (int y = 0; y <= posClicked.getY() + 64; y++) {
                for (int x = 0; x < 5; x++) {
                    for (int z = 0; z < 5; z++) {
                        BlockPos pos = posClicked.below(y).east(x).north(z);
                        BlockState blockState = level.getBlockState(pos);
                        String name = blockState.getBlock().getName().getString();

                        if (isCorrectBlock(blockState)) {
                            player.sendSystemMessage(Component.literal(String.format("Found %s!", name)));
                            player.sendSystemMessage(Component.literal(String.format("Pos: [%d, %d, %d]", pos.getX(), pos.getY(), pos.getZ())));
                            found = true;
                            break;
                        }
                    }
                }
            }
        }
        if (!found) {
            player.sendSystemMessage(Component.literal("No ore found!"));
        }
        context.getItemInHand().hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
        return InteractionResult.SUCCESS;
    }

    private boolean isCorrectBlock(BlockState blockState) {
        return blockState.is(Blocks.DIAMOND_ORE) || blockState.is(Blocks.DEEPSLATE_DIAMOND_ORE);
    }
}
