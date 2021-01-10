package krevik.github.io.refinable_resources.util;

import krevik.github.io.refinable_resources.registries.ItemsRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTiers implements IItemTier {
    REFINED_IRON_I(2, 275, 6.0F, 2.0F, 15, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_I.get());
    }),
    REFINED_IRON_II(2, 300, 6.2F, 2.1F, 16, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_II.get());
    }),
    REFINED_IRON_III(2, 325, 6.4F, 2.2F, 17, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_III.get());
    }),
    REFINED_IRON_IV(2, 350, 6.6F, 2.3F, 18, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_IV.get());
    }),
    REFINED_IRON_V(2, 375, 6.8F, 2.4F, 19, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_V.get());
    }),
    REFINED_IRON_VI(3, 400, 7.0F, 2.5F, 20, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_IRON_INGOT_VI.get());
    }),


    REFINED_DIAMOND_I(3, 1661, 8.2F, 3.2F, 11, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_I.get());
    }),
    REFINED_DIAMOND_II(3, 1761, 8.4F, 3.4F, 12, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_II.get());
    }),
    REFINED_DIAMOND_III(3, 1861, 8.6F, 3.6F, 14, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_III.get());
    }),
    REFINED_DIAMOND_IV(3, 1961, 8.8F, 3.8F, 16, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_IV.get());
    }),
    REFINED_DIAMOND_V(3, 2061, 9.0F, 3.8F, 17, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_V.get());
    }),
    REFINED_DIAMOND_VI(4, 2261, 9.2F, 4.0F, 18, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_DIAMOND_VI.get());
    }),


    REFINED_GOLD_I(0, 64, 12.5F, 0.0F, 23, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_I.get());
    }),
    REFINED_GOLD_II(0, 128, 13.0F, 0.0F, 25, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_II.get());
    }),
    REFINED_GOLD_III(0, 156, 13.5F, 0.1F, 27, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_III.get());
    }),
    REFINED_GOLD_IV(1, 256, 14.0F, 0.1F, 29, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_IV.get());
    }),
    REFINED_GOLD_V(2, 312, 14.5F, 0.2F, 32, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_V.get());
    }),
    REFINED_GOLD_VI(3, 400, 15.0F, 0.3F, 34, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_GOLD_INGOT_VI.get());
    }),


    REFINED_NETHERITE_I(4, 2100, 9.2F, 4.2F, 17, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_I.get());
    }),
    REFINED_NETHERITE_II(4, 2200, 9.5F, 4.4F, 18, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_II.get());
    }),
    REFINED_NETHERITE_III(4, 2300, 9.8F, 4.6F, 19, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_III.get());
    }),
    REFINED_NETHERITE_IV(4, 2400, 10.0F, 4.8F, 20, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_IV.get());
    }),
    REFINED_NETHERITE_V(4, 2500, 10.4F, 5.0F, 22, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_V.get());
    }),
    REFINED_NETHERITE_VI(4, 2600, 11.0F, 5.2F, 24, () -> {
        return Ingredient.fromItems(ItemsRegistry.REFINED_NETHERITE_INGOT_VI.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ModItemTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
