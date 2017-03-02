package com.mr208.c3c.integration.mekanism;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;

import mekanism.api.gas.GasStack;

public class MekanismHelper {

	public MekanismHelper(){

	}

	public static void addOsmiumCompressorRecipe() {

	}

	public static void addEnrichmentChamberRecipe() {

	}

	public static void addCombinerRecipe() {

	}

	public static void addCrusherRecipe() {

	}

	public static void addMetallurgicInfuserRecipe() {

	}

	public static void addPurificationChamberRecipe() {

	}

	public static void addRotaryCondensentratorRecipe() {

	}

	public static void addChemicalOxidizerRecipe() {

	}

	public static void addChemicalInfuserRecipe() {

	}

	public static void  addChemicalInjectionChamberRecipe() {

	}

	public static void addElectrolyticSeperatorRecipe() {

	}

	public static void addPrecisionSawmillRecipe() {

	}

	public static void addChemicalDissolutionChamberRecipe() {

	}

	public static void addChemicalWasherRecipe() {

	}

	public static void addChemicalCrystallizerRecipe() {

	}

	public static void addSolarNeutronActivatorRecipe() {

	}

	public static void addPressurizedReactionChamberRecipe(@Nonnull ItemStack itemOutput, @Nonnull GasStack gasOutput,@Nonnull ItemStack itemInput,@Nonnull FluidStack fluidInput,@Nonnull GasStack gasInput) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("itemInput", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("fluidInput", fluidInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasInput", gasInput.write(new NBTTagCompound()));

		recipeTag.setTag("itemOutput", itemOutput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasOutput", gasOutput.write(new NBTTagCompound()));

		sendIMC("PressurizedReactionChamberRecipe", recipeTag);
	}

	protected static void sendIMC(String messageType, NBTTagCompound recipeTag)
	{
		FMLInterModComms.sendMessage("Mekanims", messageType, recipeTag);
	}
}
