package parrot;

public class Parrot {

	private ParrotTypeEnum type;

	public Parrot(ParrotTypeEnum _type)
	{
		this.type = _type;
	}

	public double getSpeed()
	{
		switch (type)
		{
			default:
				break;
		}
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed()
	{
		return 12.0;
	}


}
