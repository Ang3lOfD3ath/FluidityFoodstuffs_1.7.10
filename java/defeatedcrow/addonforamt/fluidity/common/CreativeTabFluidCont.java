package defeatedcrow.addonforamt.fluidity.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabFluidCont extends CreativeTabs {

	// クリエイティブタブのアイコン画像や名称の登録クラス
	public CreativeTabFluidCont(String type) {
		super(type);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return "FluidityFoodstuffs:FluidContainer";
	}

	@Override
	public Item getTabIconItem() {
		return FluidityCore.emptyBottle;
	}
}
