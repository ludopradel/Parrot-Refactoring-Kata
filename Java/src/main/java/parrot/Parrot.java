package parrot;

public class Parrot {

	private ParrotTypeEnum type;
	private int numberOfCoconuts = 0;
	private double voltage;
	private boolean isNailed;


	public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed)
	{
		this.type = _type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed()
	{
		switch (type)
		{
			case AFRICAN:
				return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
			case NORWEGIAN_BLUE:
				return (isNailed) ? 0 : getBaseSpeed(voltage);
			default:
				break;
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(double voltage)
	{
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	private double getLoadFactor()
	{
		return 9.0;
	}

	protected double getBaseSpeed()
	{
		return 12.0;
	}


}
