package com.jacko.testmod.item.equipment;

import java.util.Map;

import com.google.common.collect.Maps;
import com.jacko.testmod.TMCommon;
import com.jacko.testmod.tags.TMItemTags;

import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public interface TMArmorMaterials {
    ArmorMaterial ICE_ETHER = new ArmorMaterial(
        37, makeDefense(3, 6, 8, 3, 11), 10,
        SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
        TMItemTags.REPAIRS_ICE_ETHER_ARMOR, createId("ice_ether")
    );
    
	static Map<ArmorType, Integer> makeDefense(final int boots, final int legs, final int chest, final int helm, final int body) {
		return Maps.newEnumMap(Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body));
	}
    
    static ResourceKey<EquipmentAsset> createId(final String name) {
		return ResourceKey.create(EquipmentAssets.ROOT_ID, TMCommon.id(name));
	}
}
