package parrot;

public class Parrot {

	public double getSpeed()
	{
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed()
	{
		return 12.0;
	}


}
