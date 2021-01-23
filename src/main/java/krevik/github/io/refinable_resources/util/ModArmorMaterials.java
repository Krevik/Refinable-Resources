package krevik.github.io.refinable_resources.util;

import krevik.github.io.refinable_resources.registries.ItemsRegistry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterials implements IArmorMaterial {

    REFINED_IRON_I("iron", 16, new int[]{3, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_I.get());
    }),
    REFINED_IRON_II("iron", 17, new int[]{3, 5, 6, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.1F, 0.0F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_II.get());
    }),
    REFINED_IRON_III("iron", 18, new int[]{3, 5, 6, 3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2F, 0.1F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_III.get());
    }),
    REFINED_IRON_IV("iron", 19, new int[]{3, 5, 6, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2F, 0.1F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_IV.get());
    }),
    REFINED_IRON_V("iron", 20, new int[]{3, 6, 6, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.3F, 0.2F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_V.get());
    }),
    REFINED_IRON_VI("iron", 22, new int[]{3, 6, 7, 3}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.4F, 0.2F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_VI.get());
    }),

    REFINED_GOLD_I("gold", 8, new int[]{2, 3, 5, 3}, 26, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.1F, 0.1F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_I.get());
    }),
    REFINED_GOLD_II("gold", 10, new int[]{2, 3, 5, 3}, 27, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.2F, 0.1F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_II.get());
    }),
    REFINED_GOLD_III("gold", 12, new int[]{3, 3, 5, 3}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.2F, 0.2F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_III.get());
    }),
    REFINED_GOLD_IV("gold", 13, new int[]{3, 4, 5, 3}, 28, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.3F, 0.2F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_IV.get());
    }),
    REFINED_GOLD_V("gold", 14, new int[]{3, 5, 5, 3}, 29, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.4F, 0.3F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_V.get());
    }),
    REFINED_GOLD_VI("gold", 16, new int[]{3, 5, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5F, 0.4F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_VI.get());
    }),



    REFINED_DIAMOND_I("diamond", 34, new int[]{3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.2F, 0.1F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_I.get());
    }),
    REFINED_DIAMOND_II("diamond", 35, new int[]{3, 6, 8, 3}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.4F, 0.2F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_II.get());
    }),
    REFINED_DIAMOND_III("diamond", 36, new int[]{3, 6, 8, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.6F, 0.3F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_III.get());
    }),
    REFINED_DIAMOND_IV("diamond", 37, new int[]{3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.8F, 0.4F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_IV.get());
    }),
    REFINED_DIAMOND_V("diamond", 38, new int[]{3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.5F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_V.get());
    }),
    REFINED_DIAMOND_VI("diamond", 39, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.6F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_VI.get());
    }),

    REFINED_NETHERITE_I("netherite", 38, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_I.get());
    }),
    REFINED_NETHERITE_II("netherite", 39, new int[]{3, 6, 8, 3}, 17, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.2F, 0.2F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_II.get());
    }),
    REFINED_NETHERITE_III("netherite", 40, new int[]{3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.4F, 0.4F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_III.get());
    }),
    REFINED_NETHERITE_IV("netherite", 42, new int[]{3, 6, 8, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.6F, 0.5F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_IV.get());
    }),
    REFINED_NETHERITE_V("netherite", 44, new int[]{3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.8F, 0.6F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_V.get());
    }),
    REFINED_NETHERITE_VI("netherite", 45, new int[]{3, 6, 8, 3}, 24, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.8F, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_VI.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float field_234660_o_;
    private final LazyValue<Ingredient> repairMaterial;

    private ModArmorMaterials(String stringName, int maxDamage, int[] dmgReductionArr, int enchantibilty_field, SoundEvent sound, float toughness, float knockbackResistivity, Supplier<Ingredient> repairMaterial) {
        this.name = stringName;
        this.maxDamageFactor = maxDamage;
        this.damageReductionAmountArray = dmgReductionArr;
        this.enchantability = enchantibilty_field;
        this.soundEvent = sound;
        this.toughness = toughness;
        this.field_234660_o_ = knockbackResistivity;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
