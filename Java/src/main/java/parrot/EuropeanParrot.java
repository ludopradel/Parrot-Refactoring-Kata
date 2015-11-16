package parrot;

public class EuropeanParrot extends Parrot
{

	public EuropeanParrot()
	{
		super(ParrotTypeEnum.EUROPEAN);
	}

	@Override
	public double getSpeed()
	{
		return getBaseSpeed();
	}

}
