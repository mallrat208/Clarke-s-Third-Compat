package com.mr208.c3c.integration.mekanism;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;

import mekanism.api.gas.GasStack;
import mekanism.api.gas.GasTank;

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

	public static void addElectrolyticSeperatorRecipe(@Nonnull GasStack leftOutput, @Nonnull GasStack rightOutput, @Nonnull FluidStack fluidInput, double energy, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("fluidInput", fluidInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setDouble("energy", energy);
		recipeTag.setTag("leftOutput", leftOutput.write(new NBTTagCompound()));
		recipeTag.setTag("rightOutput", rightOutput.write(new NBTTagCompound()));

		sendIMC("ElectrolyticSeperatorRecipe", recipeTag, deleteRecipe);
	}

	public static void addPrecisionSawmillRecipe(@Nonnull ItemStack primaryOutput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("itemInput", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("primaryOutput", primaryOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("PrecisionSawmillRecipe", recipeTag, deleteRecipe);

	}

	public static void addPrecisionSawmillRecipe(@Nonnull ItemStack primaryOutput,@Nonnull ItemStack secondaryOutput, double secondaryChance, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("itemInput", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("primaryOutput", primaryOutput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("seconadryOutput", secondaryOutput.writeToNBT(new NBTTagCompound()));
		recipeTag.setDouble("secondaryChance", secondaryChance);

		sendIMC("PrecisionSawmillRecipe", recipeTag, deleteRecipe);

	}

	public static void addChemicalDissolutionChamberRecipe(@Nonnull GasStack gasOutput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("itemInput",itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasOutput", gasOutput.write(new NBTTagCompound()));

		sendIMC("ChemicalDissolutionChamberRecipe", recipeTag, deleteRecipe);

	}

	public static void addChemicalWasherRecipe(@Nonnull GasStack gasOutput, @Nonnull GasStack gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("gasInput", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("gasOutput", gasOutput.write(new NBTTagCompound()));

		sendIMC("ChemicalWasherRecipe", recipeTag, deleteRecipe);
	}

	public static void addChemicalCrystallizerRecipe(@Nonnull ItemStack itemOutput, @Nonnull GasStack gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("gasInput", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("itemOutput", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("ChemicalCrystallizerRecipe", recipeTag, deleteRecipe);
	}

	public static void modifySolarNeutronActivatorRecipe(@Nonnull GasStack gasOutput, @Nonnull GasStack gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("gasInput", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("gasOutput", gasOutput.write(new NBTTagCompound()));

		sendIMC("SolarNeutronActivatorRecipe", recipeTag, deleteRecipe);

	}

	public static void modifyPressurizedReactionChamberRecipe(@Nonnull ItemStack itemOutput, @Nonnull GasStack gasOutput,@Nonnull ItemStack itemInput,@Nonnull FluidStack fluidInput,@Nonnull GasStack gasInput,boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("itemInput", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("fluidInput", fluidInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasInput", gasInput.write(new NBTTagCompound()));

		recipeTag.setTag("itemOutput", itemOutput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasOutput", gasOutput.write(new NBTTagCompound()));

		sendIMC("PressurizedReactionChamberRecipe", recipeTag,deleteRecipe);
	}

	protected static void sendIMC(String messageType, NBTTagCompound recipeTag, boolean deleteRecipe)
	{
		FMLInterModComms.sendMessage("Mekanims", (deleteRecipe?"Delete":"")+messageType, recipeTag);
	}

	public enum InfuseType {
		CARBON("CARBON"),
		TIN("TIN"),
		DIAMOND("DIAMOND"),
		REDSTONE("REDSTONE"),
		FUNGI("FUNGI"),
		BIO("BIO"),
		OBSIDIAN("OBSIDIAN");

		private String name;

		String getName(){
			return this.name;
		}

		InfuseType(String n){

			name = n;
		}
	}
}
