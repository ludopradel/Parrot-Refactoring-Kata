package parrot;

public class EuropeanParrot extends Parrot
{

	public EuropeanParrot(double voltage, boolean isNailed)
	{
		super(ParrotTypeEnum.EUROPEAN, voltage, isNailed);
	}

	@Override
	public double getSpeed()
	{
		return getBaseSpeed();
	}

}
