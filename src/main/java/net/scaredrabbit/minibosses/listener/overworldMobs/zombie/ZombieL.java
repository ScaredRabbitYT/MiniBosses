package net.scaredrabbit.minibosses.listener.overworldMobs.zombie;

import net.scaredrabbit.minibosses.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Objects;

public class ZombieL implements Listener {

    private static final Main config = Main.getInstance();
    ItemStack helmet;
    ItemStack chestPlate;
    ItemStack leggings;
    ItemStack boots;

    ItemStack sword;

    @EventHandler
    public void onZombieSpawn(CreatureSpawnEvent e) {


        if (config.getConfig().getBoolean("isZombieMiniBossEnabled")) {
            if (e.getEntityType() == EntityType.ZOMBIE) {
                Zombie z = (Zombie) e.getEntity();
                if (Objects.requireNonNull(config.getConfig().getString("opMobsUseMaterial")).equalsIgnoreCase("NETHERITE")) {
                    helmet = new ItemStack(Material.NETHERITE_HELMET);
                    chestPlate = new ItemStack(Material.NETHERITE_CHESTPLATE);
                    leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
                    boots = new ItemStack(Material.NETHERITE_BOOTS);

                    helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    helmet.addEnchantment(Enchantment.MENDING, 1);
                    helmet.addEnchantment(Enchantment.DURABILITY, 3);

                    chestPlate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    chestPlate.addEnchantment(Enchantment.MENDING, 1);
                    chestPlate.addEnchantment(Enchantment.DURABILITY, 3);

                    leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    leggings.addEnchantment(Enchantment.MENDING, 1);
                    leggings.addEnchantment(Enchantment.DURABILITY, 3);

                    boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    boots.addEnchantment(Enchantment.MENDING, 1);
                    boots.addEnchantment(Enchantment.DURABILITY, 3);


                    z.getEquipment().setHelmetDropChance(config.getConfig().getInt("helmetDropChance"));
                    z.getEquipment().setChestplateDropChance(config.getConfig().getInt("chestPlateDropChance"));
                    z.getEquipment().setLeggingsDropChance(config.getConfig().getInt("leggingsDropChance"));
                    z.getEquipment().setBootsDropChance(config.getConfig().getInt("bootsDropChance"));
                    z.getEquipment().setItemInMainHandDropChance(config.getConfig().getInt("swordDropChance"));



                    z.getEquipment().setHelmet(helmet);
                    z.getEquipment().setChestplate(chestPlate);
                    z.getEquipment().setLeggings(leggings);
                    z.getEquipment().setBoots(boots);

                } else if (Objects.requireNonNull(config.getConfig().getString("opMobsUseMaterial")).equalsIgnoreCase("DIAMOND")) {
                    helmet = new ItemStack(Material.DIAMOND_HELMET);
                    chestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                    boots = new ItemStack(Material.DIAMOND_BOOTS);

                    helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    helmet.addEnchantment(Enchantment.MENDING, 1);
                    helmet.addEnchantment(Enchantment.DURABILITY, 3);

                    chestPlate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    chestPlate.addEnchantment(Enchantment.MENDING, 1);
                    chestPlate.addEnchantment(Enchantment.DURABILITY, 3);

                    leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    leggings.addEnchantment(Enchantment.MENDING, 1);
                    leggings.addEnchantment(Enchantment.DURABILITY, 3);

                    boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    boots.addEnchantment(Enchantment.MENDING, 1);
                    boots.addEnchantment(Enchantment.DURABILITY, 3);

                    z.getEquipment().setHelmetDropChance(config.getConfig().getInt("helmetDropChance"));
                    z.getEquipment().setChestplateDropChance(config.getConfig().getInt("chestPlateDropChance"));
                    z.getEquipment().setLeggingsDropChance(config.getConfig().getInt("leggingsDropChance"));
                    z.getEquipment().setBootsDropChance(config.getConfig().getInt("bootsDropChance"));


                    z.getEquipment().setHelmet(helmet);
                    z.getEquipment().setChestplate(chestPlate);
                    z.getEquipment().setLeggings(leggings);
                    z.getEquipment().setBoots(boots);

                }

                if (config.getConfig().getBoolean("isSwordEnabled") && Objects.requireNonNull(config.getConfig().getString("opMobsUseMaterial")).equalsIgnoreCase("NETHERITE")){
                    sword = new ItemStack(Material.NETHERITE_SWORD);
                    sword.addEnchantment(Enchantment.DURABILITY, 3);
                    sword.addEnchantment(Enchantment.MENDING,1 );
                    sword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                    sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                    sword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
                    z.getEquipment().setItemInHandDropChance(config.getConfig().getInt("swordDropChance"));
                    z.getEquipment().setItemInHand(sword);
                }
                if (config.getConfig().getBoolean("isSwordEnabled") && Objects.requireNonNull(config.getConfig().getString("opMobsUseMaterial")).equalsIgnoreCase("DIAMOND")) {
                    sword = new ItemStack(Material.DIAMOND_SWORD);
                    sword.addEnchantment(Enchantment.DURABILITY, 3);
                    sword.addEnchantment(Enchantment.MENDING,1 );
                    sword.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                    sword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                    sword.addEnchantment(Enchantment.SWEEPING_EDGE, 3);
                    z.getEquipment().setItemInHandDropChance(config.getConfig().getInt("swordDropChance"));
                    z.getEquipment().setItemInHand(sword);
                }
            }

        }
    }
}
