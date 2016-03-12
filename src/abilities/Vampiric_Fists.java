package abilities;

import mainResourcesPackage.SoundEffect;

public class Vampiric_Fists extends _PunchAbility
{

	public Vampiric_Fists(int p)
	{
		super("Vampiric Fists", p);

		sounds.add(new SoundEffect("Vampiric Fists.wav"));
		steal = 0.2 * level;
	}
}
