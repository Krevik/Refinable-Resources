package krevik.github.io.refinable_resources.registries;

import krevik.github.io.refinable_resources.RefinableResources;
import krevik.github.io.refinable_resources.items.ItemBase;
import krevik.github.io.refinable_resources.util.ModArmorMaterials;
import krevik.github.io.refinable_resources.util.ModItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RefinableResources.MOD_ID);


        //RESOURCES
        //iron
        public static final RegistryObject<Item> REFINED_IRON_INGOT_I = ITEMS.register("refined_iron_ingot_1", ItemBase::new);
        public static final RegistryObject<Item> REFINED_IRON_INGOT_II = ITEMS.register("refined_iron_ingot_2", ItemBase::new);
        public static final RegistryObject<Item> REFINED_IRON_INGOT_III = ITEMS.register("refined_iron_ingot_3", ItemBase::new);
        public static final RegistryObject<Item> REFINED_IRON_INGOT_IV = ITEMS.register("refined_iron_ingot_4", ItemBase::new);
        public static final RegistryObject<Item> REFINED_IRON_INGOT_V = ITEMS.register("refined_iron_ingot_5", ItemBase::new);
        public static final RegistryObject<Item> REFINED_IRON_INGOT_VI = ITEMS.register("refined_iron_ingot_6", ItemBase::new);
        //gold
        public static final RegistryObject<Item> REFINED_GOLD_INGOT_I = ITEMS.register("refined_gold_ingot_1", ItemBase::new);
        public static final RegistryObject<Item> REFINED_GOLD_INGOT_II = ITEMS.register("refined_gold_ingot_2", ItemBase::new);
        public static final RegistryObject<Item> REFINED_GOLD_INGOT_III = ITEMS.register("refined_gold_ingot_3", ItemBase::new);
        public static final RegistryObject<Item> REFINED_GOLD_INGOT_IV = ITEMS.register("refined_gold_ingot_4", ItemBase::new);
        public static final RegistryObject<Item> REFINED_GOLD_INGOT_V = ITEMS.register("refined_gold_ingot_5", ItemBase::new);
        public static final RegistryObject<Item> REFINED_GOLD_INGOT_VI = ITEMS.register("refined_gold_ingot_6", ItemBase::new);
        //diamond
        public static final RegistryObject<Item> REFINED_DIAMOND_I = ITEMS.register("refined_diamond_1", ItemBase::new);
        public static final RegistryObject<Item> REFINED_DIAMOND_II = ITEMS.register("refined_diamond_2", ItemBase::new);
        public static final RegistryObject<Item> REFINED_DIAMOND_III = ITEMS.register("refined_diamond_3", ItemBase::new);
        public static final RegistryObject<Item> REFINED_DIAMOND_IV = ITEMS.register("refined_diamond_4", ItemBase::new);
        public static final RegistryObject<Item> REFINED_DIAMOND_V = ITEMS.register("refined_diamond_5", ItemBase::new);
        public static final RegistryObject<Item> REFINED_DIAMOND_VI = ITEMS.register("refined_diamond_6", ItemBase::new);
        //netherite
        public static final RegistryObject<Item> REFINED_NETHERITE_INGOT_I = ITEMS.register("refined_netherite_ingot_1", ItemBase::new);
        public static final RegistryObject<Item> REFINED_NETHERITE_INGOT_II = ITEMS.register("refined_netherite_ingot_2", ItemBase::new);
        public static final RegistryObject<Item> REFINED_NETHERITE_INGOT_III = ITEMS.register("refined_netherite_ingot_3", ItemBase::new);
        public static final RegistryObject<Item> REFINED_NETHERITE_INGOT_IV = ITEMS.register("refined_netherite_ingot_4", ItemBase::new);
        public static final RegistryObject<Item> REFINED_NETHERITE_INGOT_V = ITEMS.register("refined_netherite_ingot_5", ItemBase::new);
        public static final RegistryObject<Item> REFINED_NETHERITE_INGOT_VI = ITEMS.register("refined_netherite_ingot_6", ItemBase::new);

    //TOOLS AND ARMOR
    //IRON
    public static final RegistryObject<Item> IRON_PICKAXE_I = ITEMS.register("iron_pickaxe_1", () -> new PickaxeItem(ModItemTiers.REFINED_IRON_I, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL_I = ITEMS.register("iron_shovel_1", () -> new ShovelItem(ModItemTiers.REFINED_IRON_I, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_AXE_I = ITEMS.register("iron_axe_1", () -> new AxeItem(ModItemTiers.REFINED_IRON_I, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SWORD_I = ITEMS.register("iron_sword_1", () -> new SwordItem(ModItemTiers.REFINED_IRON_I, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_HOE_I = ITEMS.register("iron_hoe_1", () -> new HoeItem(ModItemTiers.REFINED_IRON_I, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_HELMET_I = ITEMS.register("iron_helmet_1", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_I, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_CHESTPLATE_I = ITEMS.register("iron_chestplate_1", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_I, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_LEGGINGS_I = ITEMS.register("iron_leggings_1", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_I, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_BOOTS_I = ITEMS.register("iron_boots_1", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_I, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> IRON_PICKAXE_II =ITEMS.register("iron_pickaxe_2", () -> new PickaxeItem(ModItemTiers.REFINED_IRON_II, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL_II =ITEMS.register("iron_shovel_2", () -> new ShovelItem(ModItemTiers.REFINED_IRON_II, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_AXE_II =ITEMS.register("iron_axe_2", () -> new AxeItem(ModItemTiers.REFINED_IRON_II, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SWORD_II =ITEMS.register("iron_sword_2", () -> new SwordItem(ModItemTiers.REFINED_IRON_II, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_HOE_II =ITEMS.register("iron_hoe_2", () -> new HoeItem(ModItemTiers.REFINED_IRON_II, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_HELMET_II =ITEMS.register("iron_helmet_2", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_II, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_CHESTPLATE_II =ITEMS.register("iron_chestplate_2", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_II, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_LEGGINGS_II =ITEMS.register("iron_leggings_2", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_II, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_BOOTS_II =ITEMS.register("iron_boots_2", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_II, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> IRON_PICKAXE_III =ITEMS.register("iron_pickaxe_3", () -> new PickaxeItem(ModItemTiers.REFINED_IRON_III, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL_III =ITEMS.register("iron_shovel_3", () -> new ShovelItem(ModItemTiers.REFINED_IRON_III, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_AXE_III =ITEMS.register("iron_axe_3", () -> new AxeItem(ModItemTiers.REFINED_IRON_III, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SWORD_III =ITEMS.register("iron_sword_3", () -> new SwordItem(ModItemTiers.REFINED_IRON_III, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_HOE_III =ITEMS.register("iron_hoe_3", () -> new HoeItem(ModItemTiers.REFINED_IRON_III, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_HELMET_III =ITEMS.register("iron_helmet_3", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_III, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_CHESTPLATE_III =ITEMS.register("iron_chestplate_3", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_III, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_LEGGINGS_III =ITEMS.register("iron_leggings_3", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_III, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_BOOTS_III =ITEMS.register("iron_boots_3", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_III, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> IRON_PICKAXE_IV =ITEMS.register("iron_pickaxe_4", () -> new PickaxeItem(ModItemTiers.REFINED_IRON_IV, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL_IV =ITEMS.register("iron_shovel_4", () -> new ShovelItem(ModItemTiers.REFINED_IRON_IV, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_AXE_IV =ITEMS.register("iron_axe_4", () -> new AxeItem(ModItemTiers.REFINED_IRON_IV, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SWORD_IV =ITEMS.register("iron_sword_4", () -> new SwordItem(ModItemTiers.REFINED_IRON_IV, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_HOE_IV =ITEMS.register("iron_hoe_4", () -> new HoeItem(ModItemTiers.REFINED_IRON_IV, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_HELMET_IV =ITEMS.register("iron_helmet_4", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_IV, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_CHESTPLATE_IV =ITEMS.register("iron_chestplate_4", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_IV, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_LEGGINGS_IV =ITEMS.register("iron_leggings_4", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_IV, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_BOOTS_IV =ITEMS.register("iron_boots_4", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_IV, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> IRON_PICKAXE_V =ITEMS.register("iron_pickaxe_5", () -> new PickaxeItem(ModItemTiers.REFINED_IRON_V, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL_V =ITEMS.register("iron_shovel_5", () -> new ShovelItem(ModItemTiers.REFINED_IRON_V, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_AXE_V =ITEMS.register("iron_axe_5", () -> new AxeItem(ModItemTiers.REFINED_IRON_V, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SWORD_V =ITEMS.register("iron_sword_5", () -> new SwordItem(ModItemTiers.REFINED_IRON_V, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_HOE_V =ITEMS.register("iron_hoe_5", () -> new HoeItem(ModItemTiers.REFINED_IRON_V, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_HELMET_V =ITEMS.register("iron_helmet_5", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_V, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_CHESTPLATE_V =ITEMS.register("iron_chestplate_5", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_V, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_LEGGINGS_V =ITEMS.register("iron_leggings_5", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_V, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_BOOTS_V =ITEMS.register("iron_boots_5", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_V, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> IRON_PICKAXE_VI =ITEMS.register("iron_pickaxe_6", () -> new PickaxeItem(ModItemTiers.REFINED_IRON_VI, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL_VI =ITEMS.register("iron_shovel_6", () -> new ShovelItem(ModItemTiers.REFINED_IRON_VI, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_AXE_VI =ITEMS.register("iron_axe_6", () -> new AxeItem(ModItemTiers.REFINED_IRON_VI, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_SWORD_VI =ITEMS.register("iron_sword_6", () -> new SwordItem(ModItemTiers.REFINED_IRON_VI, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_HOE_VI =ITEMS.register("iron_hoe_6", () -> new HoeItem(ModItemTiers.REFINED_IRON_VI, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> IRON_HELMET_VI =ITEMS.register("iron_helmet_6", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_VI, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_CHESTPLATE_VI =ITEMS.register("iron_chestplate_6", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_VI, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_LEGGINGS_VI =ITEMS.register("iron_leggings_6", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_VI, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> IRON_BOOTS_VI =ITEMS.register("iron_boots_6", () -> new ArmorItem(ModArmorMaterials.REFINED_IRON_VI, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
    //GOLD
    public static final RegistryObject<Item> GOLD_PICKAXE_I = ITEMS.register("gold_pickaxe_1", () -> new PickaxeItem(ModItemTiers.REFINED_GOLD_I, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL_I = ITEMS.register("gold_shovel_1", () -> new ShovelItem(ModItemTiers.REFINED_GOLD_I, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE_I = ITEMS.register("gold_axe_1", () -> new AxeItem(ModItemTiers.REFINED_GOLD_I, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SWORD_I = ITEMS.register("gold_sword_1", () -> new SwordItem(ModItemTiers.REFINED_GOLD_I, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_HOE_I = ITEMS.register("gold_hoe_1", () -> new HoeItem(ModItemTiers.REFINED_GOLD_I, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_HELMET_I = ITEMS.register("gold_helmet_1", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_I, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_CHESTPLATE_I = ITEMS.register("gold_chestplate_1", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_I, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_LEGGINGS_I = ITEMS.register("gold_leggings_1", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_I, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_BOOTS_I = ITEMS.register("gold_boots_1", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_I, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> GOLD_PICKAXE_II =ITEMS.register("gold_pickaxe_2", () -> new PickaxeItem(ModItemTiers.REFINED_GOLD_II, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL_II =ITEMS.register("gold_shovel_2", () -> new ShovelItem(ModItemTiers.REFINED_GOLD_II, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE_II =ITEMS.register("gold_axe_2", () -> new AxeItem(ModItemTiers.REFINED_GOLD_II, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SWORD_II =ITEMS.register("gold_sword_2", () -> new SwordItem(ModItemTiers.REFINED_GOLD_II, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_HOE_II =ITEMS.register("gold_hoe_2", () -> new HoeItem(ModItemTiers.REFINED_GOLD_II, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_HELMET_II =ITEMS.register("gold_helmet_2", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_II, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_CHESTPLATE_II =ITEMS.register("gold_chestplate_2", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_II, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_LEGGINGS_II =ITEMS.register("gold_leggings_2", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_II, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_BOOTS_II =ITEMS.register("gold_boots_2", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_II, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> GOLD_PICKAXE_III =ITEMS.register("gold_pickaxe_3", () -> new PickaxeItem(ModItemTiers.REFINED_GOLD_III, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL_III =ITEMS.register("gold_shovel_3", () -> new ShovelItem(ModItemTiers.REFINED_GOLD_III, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE_III =ITEMS.register("gold_axe_3", () -> new AxeItem(ModItemTiers.REFINED_GOLD_III, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SWORD_III =ITEMS.register("gold_sword_3", () -> new SwordItem(ModItemTiers.REFINED_GOLD_III, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_HOE_III =ITEMS.register("gold_hoe_3", () -> new HoeItem(ModItemTiers.REFINED_GOLD_III, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_HELMET_III =ITEMS.register("gold_helmet_3", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_III, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_CHESTPLATE_III =ITEMS.register("gold_chestplate_3", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_III, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_LEGGINGS_III =ITEMS.register("gold_leggings_3", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_III, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_BOOTS_III =ITEMS.register("gold_boots_3", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_III, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> GOLD_PICKAXE_IV =ITEMS.register("gold_pickaxe_4", () -> new PickaxeItem(ModItemTiers.REFINED_GOLD_IV, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL_IV =ITEMS.register("gold_shovel_4", () -> new ShovelItem(ModItemTiers.REFINED_GOLD_IV, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE_IV =ITEMS.register("gold_axe_4", () -> new AxeItem(ModItemTiers.REFINED_GOLD_IV, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SWORD_IV =ITEMS.register("gold_sword_4", () -> new SwordItem(ModItemTiers.REFINED_GOLD_IV, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_HOE_IV =ITEMS.register("gold_hoe_4", () -> new HoeItem(ModItemTiers.REFINED_GOLD_IV, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_HELMET_IV =ITEMS.register("gold_helmet_4", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_IV, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_CHESTPLATE_IV =ITEMS.register("gold_chestplate_4", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_IV, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_LEGGINGS_IV =ITEMS.register("gold_leggings_4", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_IV, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_BOOTS_IV =ITEMS.register("gold_boots_4", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_IV, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> GOLD_PICKAXE_V =ITEMS.register("gold_pickaxe_5", () -> new PickaxeItem(ModItemTiers.REFINED_GOLD_V, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL_V =ITEMS.register("gold_shovel_5", () -> new ShovelItem(ModItemTiers.REFINED_GOLD_V, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE_V =ITEMS.register("gold_axe_5", () -> new AxeItem(ModItemTiers.REFINED_GOLD_V, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SWORD_V =ITEMS.register("gold_sword_5", () -> new SwordItem(ModItemTiers.REFINED_GOLD_V, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_HOE_V =ITEMS.register("gold_hoe_5", () -> new HoeItem(ModItemTiers.REFINED_GOLD_V, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_HELMET_V =ITEMS.register("gold_helmet_5", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_V, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_CHESTPLATE_V =ITEMS.register("gold_chestplate_5", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_V, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_LEGGINGS_V =ITEMS.register("gold_leggings_5", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_V, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_BOOTS_V =ITEMS.register("gold_boots_5", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_V, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> GOLD_PICKAXE_VI =ITEMS.register("gold_pickaxe_6", () -> new PickaxeItem(ModItemTiers.REFINED_GOLD_VI, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL_VI =ITEMS.register("gold_shovel_6", () -> new ShovelItem(ModItemTiers.REFINED_GOLD_VI, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE_VI =ITEMS.register("gold_axe_6", () -> new AxeItem(ModItemTiers.REFINED_GOLD_VI, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_SWORD_VI =ITEMS.register("gold_sword_6", () -> new SwordItem(ModItemTiers.REFINED_GOLD_VI, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_HOE_VI =ITEMS.register("gold_hoe_6", () -> new HoeItem(ModItemTiers.REFINED_GOLD_VI, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> GOLD_HELMET_VI =ITEMS.register("gold_helmet_6", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_VI, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_CHESTPLATE_VI =ITEMS.register("gold_chestplate_6", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_VI, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_LEGGINGS_VI =ITEMS.register("gold_leggings_6", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_VI, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> GOLD_BOOTS_VI =ITEMS.register("gold_boots_6", () -> new ArmorItem(ModArmorMaterials.REFINED_GOLD_VI, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
    //DIAMOND
    public static final RegistryObject<Item> DIAMOND_PICKAXE_I = ITEMS.register("diamond_pickaxe_1", () -> new PickaxeItem(ModItemTiers.REFINED_DIAMOND_I, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_I = ITEMS.register("diamond_shovel_1", () -> new ShovelItem(ModItemTiers.REFINED_DIAMOND_I, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE_I = ITEMS.register("diamond_axe_1", () -> new AxeItem(ModItemTiers.REFINED_DIAMOND_I, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SWORD_I = ITEMS.register("diamond_sword_1", () -> new SwordItem(ModItemTiers.REFINED_DIAMOND_I, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_HOE_I = ITEMS.register("diamond_hoe_1", () -> new HoeItem(ModItemTiers.REFINED_DIAMOND_I, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HELMET_I = ITEMS.register("diamond_helmet_1", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_I, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE_I = ITEMS.register("diamond_chestplate_1", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_I, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS_I = ITEMS.register("diamond_leggings_1", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_I, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS_I = ITEMS.register("diamond_boots_1", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_I, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> DIAMOND_PICKAXE_II =ITEMS.register("diamond_pickaxe_2", () -> new PickaxeItem(ModItemTiers.REFINED_DIAMOND_II, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_II =ITEMS.register("diamond_shovel_2", () -> new ShovelItem(ModItemTiers.REFINED_DIAMOND_II, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE_II =ITEMS.register("diamond_axe_2", () -> new AxeItem(ModItemTiers.REFINED_DIAMOND_II, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SWORD_II =ITEMS.register("diamond_sword_2", () -> new SwordItem(ModItemTiers.REFINED_DIAMOND_II, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_HOE_II =ITEMS.register("diamond_hoe_2", () -> new HoeItem(ModItemTiers.REFINED_DIAMOND_II, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HELMET_II =ITEMS.register("diamond_helmet_2", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_II, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE_II =ITEMS.register("diamond_chestplate_2", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_II, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS_II =ITEMS.register("diamond_leggings_2", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_II, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS_II =ITEMS.register("diamond_boots_2", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_II, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> DIAMOND_PICKAXE_III =ITEMS.register("diamond_pickaxe_3", () -> new PickaxeItem(ModItemTiers.REFINED_DIAMOND_III, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_III =ITEMS.register("diamond_shovel_3", () -> new ShovelItem(ModItemTiers.REFINED_DIAMOND_III, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE_III =ITEMS.register("diamond_axe_3", () -> new AxeItem(ModItemTiers.REFINED_DIAMOND_III, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SWORD_III =ITEMS.register("diamond_sword_3", () -> new SwordItem(ModItemTiers.REFINED_DIAMOND_III, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_HOE_III =ITEMS.register("diamond_hoe_3", () -> new HoeItem(ModItemTiers.REFINED_DIAMOND_III, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HELMET_III =ITEMS.register("diamond_helmet_3", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_III, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE_III =ITEMS.register("diamond_chestplate_3", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_III, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS_III =ITEMS.register("diamond_leggings_3", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_III, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS_III =ITEMS.register("diamond_boots_3", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_III, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> DIAMOND_PICKAXE_IV =ITEMS.register("diamond_pickaxe_4", () -> new PickaxeItem(ModItemTiers.REFINED_DIAMOND_IV, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_IV =ITEMS.register("diamond_shovel_4", () -> new ShovelItem(ModItemTiers.REFINED_DIAMOND_IV, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE_IV =ITEMS.register("diamond_axe_4", () -> new AxeItem(ModItemTiers.REFINED_DIAMOND_IV, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SWORD_IV =ITEMS.register("diamond_sword_4", () -> new SwordItem(ModItemTiers.REFINED_DIAMOND_IV, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_HOE_IV =ITEMS.register("diamond_hoe_4", () -> new HoeItem(ModItemTiers.REFINED_DIAMOND_IV, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HELMET_IV =ITEMS.register("diamond_helmet_4", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_IV, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE_IV =ITEMS.register("diamond_chestplate_4", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_IV, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS_IV =ITEMS.register("diamond_leggings_4", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_IV, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS_IV =ITEMS.register("diamond_boots_4", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_IV, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> DIAMOND_PICKAXE_V =ITEMS.register("diamond_pickaxe_5", () -> new PickaxeItem(ModItemTiers.REFINED_DIAMOND_V, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_V =ITEMS.register("diamond_shovel_5", () -> new ShovelItem(ModItemTiers.REFINED_DIAMOND_V, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE_V =ITEMS.register("diamond_axe_5", () -> new AxeItem(ModItemTiers.REFINED_DIAMOND_V, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SWORD_V =ITEMS.register("diamond_sword_5", () -> new SwordItem(ModItemTiers.REFINED_DIAMOND_V, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_HOE_V =ITEMS.register("diamond_hoe_5", () -> new HoeItem(ModItemTiers.REFINED_DIAMOND_V, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HELMET_V =ITEMS.register("diamond_helmet_5", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_V, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE_V =ITEMS.register("diamond_chestplate_5", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_V, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS_V =ITEMS.register("diamond_leggings_5", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_V, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS_V =ITEMS.register("diamond_boots_5", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_V, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> DIAMOND_PICKAXE_VI =ITEMS.register("diamond_pickaxe_6", () -> new PickaxeItem(ModItemTiers.REFINED_DIAMOND_VI, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL_VI =ITEMS.register("diamond_shovel_6", () -> new ShovelItem(ModItemTiers.REFINED_DIAMOND_VI, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE_VI =ITEMS.register("diamond_axe_6", () -> new AxeItem(ModItemTiers.REFINED_DIAMOND_VI, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SWORD_VI =ITEMS.register("diamond_sword_6", () -> new SwordItem(ModItemTiers.REFINED_DIAMOND_VI, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_HOE_VI =ITEMS.register("diamond_hoe_6", () -> new HoeItem(ModItemTiers.REFINED_DIAMOND_VI, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HELMET_VI =ITEMS.register("diamond_helmet_6", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_VI, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_CHESTPLATE_VI =ITEMS.register("diamond_chestplate_6", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_VI, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_LEGGINGS_VI =ITEMS.register("diamond_leggings_6", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_VI, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BOOTS_VI =ITEMS.register("diamond_boots_6", () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND_VI, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
    //NETHERITE
    public static final RegistryObject<Item> NETHERITE_PICKAXE_I = ITEMS.register("netherite_pickaxe_1", () -> new PickaxeItem(ModItemTiers.REFINED_NETHERITE_I, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_I = ITEMS.register("netherite_shovel_1", () -> new ShovelItem(ModItemTiers.REFINED_NETHERITE_I, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_AXE_I = ITEMS.register("netherite_axe_1", () -> new AxeItem(ModItemTiers.REFINED_NETHERITE_I, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SWORD_I = ITEMS.register("netherite_sword_1", () -> new SwordItem(ModItemTiers.REFINED_NETHERITE_I, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_HOE_I = ITEMS.register("netherite_hoe_1", () -> new HoeItem(ModItemTiers.REFINED_NETHERITE_I, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_HELMET_I = ITEMS.register("netherite_helmet_1", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_I, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE_I = ITEMS.register("netherite_chestplate_1", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_I, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS_I = ITEMS.register("netherite_leggings_1", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_I, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS_I = ITEMS.register("netherite_boots_1", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_I, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> NETHERITE_PICKAXE_II =ITEMS.register("netherite_pickaxe_2", () -> new PickaxeItem(ModItemTiers.REFINED_NETHERITE_II, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_II =ITEMS.register("netherite_shovel_2", () -> new ShovelItem(ModItemTiers.REFINED_NETHERITE_II, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_AXE_II =ITEMS.register("netherite_axe_2", () -> new AxeItem(ModItemTiers.REFINED_NETHERITE_II, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SWORD_II =ITEMS.register("netherite_sword_2", () -> new SwordItem(ModItemTiers.REFINED_NETHERITE_II, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_HOE_II =ITEMS.register("netherite_hoe_2", () -> new HoeItem(ModItemTiers.REFINED_NETHERITE_II, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_HELMET_II =ITEMS.register("netherite_helmet_2", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_II, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE_II =ITEMS.register("netherite_chestplate_2", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_II, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS_II =ITEMS.register("netherite_leggings_2", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_II, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS_II =ITEMS.register("netherite_boots_2", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_II, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> NETHERITE_PICKAXE_III =ITEMS.register("netherite_pickaxe_3", () -> new PickaxeItem(ModItemTiers.REFINED_NETHERITE_III, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_III =ITEMS.register("netherite_shovel_3", () -> new ShovelItem(ModItemTiers.REFINED_NETHERITE_III, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_AXE_III =ITEMS.register("netherite_axe_3", () -> new AxeItem(ModItemTiers.REFINED_NETHERITE_III, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SWORD_III =ITEMS.register("netherite_sword_3", () -> new SwordItem(ModItemTiers.REFINED_NETHERITE_III, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_HOE_III =ITEMS.register("netherite_hoe_3", () -> new HoeItem(ModItemTiers.REFINED_NETHERITE_III, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_HELMET_III =ITEMS.register("netherite_helmet_3", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_III, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE_III =ITEMS.register("netherite_chestplate_3", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_III, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS_III =ITEMS.register("netherite_leggings_3", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_III, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS_III =ITEMS.register("netherite_boots_3", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_III, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> NETHERITE_PICKAXE_IV =ITEMS.register("netherite_pickaxe_4", () -> new PickaxeItem(ModItemTiers.REFINED_NETHERITE_IV, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_IV =ITEMS.register("netherite_shovel_4", () -> new ShovelItem(ModItemTiers.REFINED_NETHERITE_IV, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_AXE_IV =ITEMS.register("netherite_axe_4", () -> new AxeItem(ModItemTiers.REFINED_NETHERITE_IV, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SWORD_IV =ITEMS.register("netherite_sword_4", () -> new SwordItem(ModItemTiers.REFINED_NETHERITE_IV, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_HOE_IV =ITEMS.register("netherite_hoe_4", () -> new HoeItem(ModItemTiers.REFINED_NETHERITE_IV, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_HELMET_IV =ITEMS.register("netherite_helmet_4", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_IV, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE_IV =ITEMS.register("netherite_chestplate_4", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_IV, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS_IV =ITEMS.register("netherite_leggings_4", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_IV, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS_IV =ITEMS.register("netherite_boots_4", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_IV, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> NETHERITE_PICKAXE_V =ITEMS.register("netherite_pickaxe_5", () -> new PickaxeItem(ModItemTiers.REFINED_NETHERITE_V, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_V =ITEMS.register("netherite_shovel_5", () -> new ShovelItem(ModItemTiers.REFINED_NETHERITE_V, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_AXE_V =ITEMS.register("netherite_axe_5", () -> new AxeItem(ModItemTiers.REFINED_NETHERITE_V, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SWORD_V =ITEMS.register("netherite_sword_5", () -> new SwordItem(ModItemTiers.REFINED_NETHERITE_V, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_HOE_V =ITEMS.register("netherite_hoe_5", () -> new HoeItem(ModItemTiers.REFINED_NETHERITE_V, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_HELMET_V =ITEMS.register("netherite_helmet_5", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_V, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE_V =ITEMS.register("netherite_chestplate_5", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_V, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS_V =ITEMS.register("netherite_leggings_5", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_V, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS_V =ITEMS.register("netherite_boots_5", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_V, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> NETHERITE_PICKAXE_VI =ITEMS.register("netherite_pickaxe_6", () -> new PickaxeItem(ModItemTiers.REFINED_NETHERITE_VI, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_VI =ITEMS.register("netherite_shovel_6", () -> new ShovelItem(ModItemTiers.REFINED_NETHERITE_VI, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_AXE_VI =ITEMS.register("netherite_axe_6", () -> new AxeItem(ModItemTiers.REFINED_NETHERITE_VI, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_SWORD_VI =ITEMS.register("netherite_sword_6", () -> new SwordItem(ModItemTiers.REFINED_NETHERITE_VI, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_HOE_VI =ITEMS.register("netherite_hoe_6", () -> new HoeItem(ModItemTiers.REFINED_NETHERITE_VI, -2, -1.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    public static final RegistryObject<Item> NETHERITE_HELMET_VI =ITEMS.register("netherite_helmet_6", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_VI, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_CHESTPLATE_VI =ITEMS.register("netherite_chestplate_6", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_VI, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGGINGS_VI =ITEMS.register("netherite_leggings_6", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_VI, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BOOTS_VI =ITEMS.register("netherite_boots_6", () -> new ArmorItem(ModArmorMaterials.REFINED_NETHERITE_VI, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));


    public static void registerItems(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
