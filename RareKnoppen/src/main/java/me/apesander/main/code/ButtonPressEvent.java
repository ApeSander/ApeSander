package me.apesander.main.code;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ButtonPressEvent implements Listener {
    @EventHandler
    public void onButtonPress(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        Action action = event.getAction();
        Location location = block.getLocation();
        ItemStack iron = new ItemStack(Material.IRON_INGOT, 3);
        ItemStack cobblestone = new ItemStack(Material.COBBLESTONE, 5);
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
        ItemStack dirt = new ItemStack(Material.DIRT, 7);
        ItemStack spyglass = new ItemStack(Material.SPYGLASS, 1);
        ItemStack hoe = new ItemStack(Material.NETHERITE_HOE, 1);
        ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemStack helmet1 = new ItemStack(Material.IRON_HELMET, 1);
        ItemStack helmet2 = new ItemStack(Material.TURTLE_HELMET, 1);
        ItemStack sword = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemStack wood = new ItemStack(Material.OAK_LOG, 3);
        ItemStack planks = new ItemStack(Material.CRIMSON_PLANKS, 9);
        ItemStack rottenflesh = new ItemStack(Material.ROTTEN_FLESH, 4);
        ItemStack poppy = new ItemStack(Material.POPPY, 3);
        ItemStack gravel = new ItemStack(Material.GRAVEL, 7);
        ItemStack diorite = new ItemStack(Material.DIORITE, 3);
        ItemStack sand = new ItemStack(Material.SAND, 8);
        ItemStack carpet = new ItemStack(Material.MAGENTA_CARPET, 2);
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 2);
        ItemStack barrel = new ItemStack(Material.BARREL, 2);
        ItemStack bedrock = new ItemStack(Material.BEDROCK, 1);
        ItemStack water = new ItemStack(Material.WATER_BUCKET, 3);
        ItemStack netherbrick = new ItemStack(Material.NETHER_BRICK_SLAB, 3);



        //checks if player clicked the right mousebutton.
        if (action == Action.RIGHT_CLICK_BLOCK) {
            if (!block.isBlockPowered())
                if (block.getType().equals(Material.STONE_BUTTON) || block.getType().equals(Material.POLISHED_BLACKSTONE_BUTTON) ||
                        block.getType().equals(Material.OAK_BUTTON) || block.getType().equals(Material.SPRUCE_BUTTON) ||
                        block.getType().equals(Material.BIRCH_BUTTON) || block.getType().equals(Material.JUNGLE_BUTTON) ||
                        block.getType().equals(Material.ACACIA_BUTTON) || block.getType().equals(Material.DARK_OAK_BUTTON) ||
                        block.getType().equals(Material.CRIMSON_BUTTON) || block.getType().equals(Material.WARPED_BUTTON)) {
                    int id = new RandomNum().getNum(1, 51);
                    if (id == 1) {
                        block.getWorld().dropItemNaturally(location, iron);
                    }
                    if (id == 2 || id == 25) {
                        block.getWorld().dropItemNaturally(location, cobblestone);
                    }
                    if (id == 3) {
                        block.getWorld().dropItemNaturally(location, diamond);
                    }
                    if (id == 4 || id == 26 || id == 27) {
                        block.getWorld().dropItemNaturally(location, dirt);
                    }
                    if (id == 5) {
                        block.getWorld().dropItemNaturally(location, spyglass);
                    }
                    if (id == 6 || id == 28) {
                        block.getWorld().dropItemNaturally(location, hoe);
                    }
                    if (id == 7) {
                        block.getWorld().dropItemNaturally(location, chestplate);
                    }
                    if (id == 8) {
                        block.getWorld().dropItemNaturally(location, leggings);
                    }
                    if (id == 9) {
                        block.getWorld().dropItemNaturally(location, helmet1);
                    }
                    if (id == 10) {
                        block.getWorld().dropItemNaturally(location, helmet2);
                    }
                    if (id == 11) {
                        block.getWorld().dropItemNaturally(location, sword);
                    }
                    if (id == 12 || id == 29) {
                        block.getWorld().dropItemNaturally(location, wood);
                    }
                    if (id == 13) {
                        block.getWorld().dropItemNaturally(location, planks);
                    }
                    if (id == 14 || id == 30 || id == 31 || id == 32) {
                        block.getWorld().dropItemNaturally(location, rottenflesh);
                    }
                    if (id == 15 || id == 33) {
                        block.getWorld().dropItemNaturally(location, poppy);
                    }
                    if (id == 16 || id == 34) {
                        block.getWorld().dropItemNaturally(location, gravel);
                    }
                    if (id == 17 || id == 35 || id == 36) {
                        block.getWorld().dropItemNaturally(location, diorite);
                    }
                    if (id == 18 || id == 37 || id == 38) {
                        block.getWorld().dropItemNaturally(location, sand);
                    }
                    if (id == 19 || id == 39) {
                        block.getWorld().dropItemNaturally(location, carpet);
                    }
                    if (id == 20) {
                        block.getWorld().dropItemNaturally(location, head);
                    }
                    if (id == 21) {
                        block.getWorld().dropItemNaturally(location, barrel);
                    }
                    if (id == 22) {
                        block.getWorld().dropItemNaturally(location, bedrock);
                    }
                    if (id == 23) {
                        block.getWorld().dropItemNaturally(location, water);
                    }
                    if (id == 24 || id == 40) {
                        block.getWorld().dropItemNaturally(location, netherbrick);
                    }
                    if (id >= 41) {
                        player.sendMessage(ChatColor.AQUA + "Bad luck!!");
                    }
            }
        }
    }
}
