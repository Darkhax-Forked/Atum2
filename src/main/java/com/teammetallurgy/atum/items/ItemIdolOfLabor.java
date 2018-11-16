package com.teammetallurgy.atum.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ItemIdolOfLabor extends Item {

    @Override
    @Nonnull
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand hand) {
        player.sendStatusMessage(new TextComponentTranslation(this.getTranslationKey() + "." + MathHelper.getInt(itemRand, 1, 10)).setStyle(new Style().setColor(TextFormatting.YELLOW)), true);
        return super.onItemRightClick(world, player, hand);
    }
}