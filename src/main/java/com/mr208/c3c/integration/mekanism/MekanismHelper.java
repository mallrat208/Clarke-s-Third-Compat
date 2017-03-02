package com.mr208.c3c.integration.mekanism;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;

import mekanism.api.gas.Gas;
import mekanism.api.gas.GasStack;

public class MekanismHelper {

	public MekanismHelper(){

	}

	public static void addOsmiumCompressorRecipe(@Nonnull ItemStack itemOutput, @Nonnull ItemStack itemInput, @Nonnull Gas gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasType", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("OsmiumCompressorRecipe", recipeTag, deleteRecipe);
	}
	public static void addAmbientGasRecipe(int dimensionID, @Nonnull GasStack gasOutput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setInteger("input", dimensionID);
		recipeTag.setTag("output", gasOutput.write(new NBTTagCompound()));

		sendIMC("AmbientAccumulatorRecipe", recipeTag, deleteRecipe);
	}

	public static void addEnrichmentChamberRecipe(@Nonnull ItemStack itemOutput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("output", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("EnrichmentChamberRecipe",recipeTag,deleteRecipe);
	}

	public static void addCombinerRecipe(@Nonnull ItemStack itemOutput, @Nonnull ItemStack itemInput, @Nonnull Gas gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasType", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("CombineRecipe",recipeTag, deleteRecipe);
	}

	public static void addCrusherRecipe(@Nonnull ItemStack itemOuput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("output", itemOuput.writeToNBT(new NBTTagCompound()));

		sendIMC("CrusherRecipe", recipeTag, deleteRecipe);
	}

	public static void addMetallurgicInfuserRecipe(@Nonnull ItemStack itemOuput, @Nonnull ItemStack itemInput, InfuseType infuseType, int infuseAmount, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setString("infuseType", infuseType.getName());
		recipeTag.setInteger("infuseAmount", infuseAmount);
		recipeTag.setTag("output", itemOuput.writeToNBT(new NBTTagCompound()));

		sendIMC("MetallurgicInfuserRecipe",recipeTag, deleteRecipe);
	}

	public static void addPurificationChamberRecipe(@Nonnull ItemStack itemOutput, @Nonnull ItemStack itemInput, @Nonnull Gas gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasType", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("PurificationChamberRecipe", recipeTag, deleteRecipe);
	}

	public static void addChemicalOxidizerRecipe(@Nonnull GasStack gasOutput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("output", gasOutput.write(new NBTTagCompound()));

		sendIMC("ChemicalOxidizer", recipeTag, deleteRecipe);

	}

	public static void addChemicalInfuserRecipe(@Nonnull GasStack gasOutput, @Nonnull GasStack leftInput, @Nonnull GasStack rightInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("leftInput", leftInput.write(new NBTTagCompound()));
		recipeTag.setTag("rightInput", rightInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", gasOutput.write(new NBTTagCompound()));

		sendIMC("ChemicalInfuserRecipe", recipeTag, deleteRecipe);
	}

	public static void addChemicalInjectionChamberRecipe(@Nonnull ItemStack itemOutput, @Nonnull ItemStack itemInput, @Nonnull Gas gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("gasType", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("ChemicalInjectionChamberRecipe", recipeTag, deleteRecipe);
	}

	public static void addElectrolyticSeperatorRecipe(@Nonnull GasStack leftOutput, @Nonnull GasStack rightOutput, @Nonnull FluidStack fluidInput, double energy, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", fluidInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setDouble("energy", energy);
		recipeTag.setTag("leftOutput", leftOutput.write(new NBTTagCompound()));
		recipeTag.setTag("rightOutput", rightOutput.write(new NBTTagCompound()));

		sendIMC("ElectrolyticSeperatorRecipe", recipeTag, deleteRecipe);
	}

	public static void addPrecisionSawmillRecipe(@Nonnull ItemStack primaryOutput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("primaryOutput", primaryOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("PrecisionSawmillRecipe", recipeTag, deleteRecipe);
	}

	public static void addPrecisionSawmillRecipe(@Nonnull ItemStack primaryOutput,@Nonnull ItemStack secondaryOutput, double secondaryChance, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("primaryOutput", primaryOutput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("seconadryOutput", secondaryOutput.writeToNBT(new NBTTagCompound()));
		recipeTag.setDouble("secondaryChance", secondaryChance);

		sendIMC("PrecisionSawmillRecipe", recipeTag, deleteRecipe);
	}

	public static void addChemicalDissolutionChamberRecipe(@Nonnull GasStack gasOutput, @Nonnull ItemStack itemInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input",itemInput.writeToNBT(new NBTTagCompound()));
		recipeTag.setTag("output", gasOutput.write(new NBTTagCompound()));

		sendIMC("ChemicalDissolutionChamberRecipe", recipeTag, deleteRecipe);
	}

	public static void addChemicalWasherRecipe(@Nonnull GasStack gasOutput, @Nonnull GasStack gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", gasOutput.write(new NBTTagCompound()));

		sendIMC("ChemicalWasherRecipe", recipeTag, deleteRecipe);
	}

	public static void addChemicalCrystallizerRecipe(@Nonnull ItemStack itemOutput, @Nonnull GasStack gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", itemOutput.writeToNBT(new NBTTagCompound()));

		sendIMC("ChemicalCrystallizerRecipe", recipeTag, deleteRecipe);
	}

	public static void modifySolarNeutronActivatorRecipe(@Nonnull GasStack gasOutput, @Nonnull GasStack gasInput, boolean deleteRecipe) {

		NBTTagCompound recipeTag = new NBTTagCompound();
		recipeTag.setTag("input", gasInput.write(new NBTTagCompound()));
		recipeTag.setTag("output", gasOutput.write(new NBTTagCompound()));

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
