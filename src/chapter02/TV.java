package chapter02;

public class TV {
	private boolean power;
	private int channel; // 0 ~ 50번까지
	private int volume; // 0 ~ 50 까지
	
	public TV (int channel, int volume, boolean power)
	{
		power(power);
		channel(channel);
		volume(volume);
	}
	
	public void overValueCalc(int value, boolean check)
	{
		if (check)
		{
			if (value < 0)
				this.volume = 50;
			
			else if (value > 50)
				this.volume = 0;
			
			else
			{
				while(true)
				{
					if (value > this.volume)
						volume(true);
					else if (value < this.volume)
						volume(false);
					else
						break;
				}
			}
		}
		
		else
		{
			if (value < 0)
				this.channel = 50;
			
			else if (value > 50)
				this.channel = 0;
			
			else
			{
				while(true)
				{
					if (value > this.channel)
						channel(true);
					else if (value < this.channel)
						channel(false);
					else
						break;
				}
			}
		}
	}
	
	public void volume(int volume)
	{
		overValueCalc(volume, true);
	}
	
	public void volume(boolean volume)
	{
		if (volume)
			overValueCalc(++this.volume, true);
		else
			overValueCalc(--this.volume, true);
	}
	
	public void power(boolean power)
	{
		this.power = power;
	}
	
	public void channel(int channel)
	{
		overValueCalc(channel, false);
	}
	
	public void channel(boolean up)
	{
		if (up)
			overValueCalc(++this.channel, false);
		else
			overValueCalc(--this.channel, false);
	}
	
	public void status()
	{
		System.out.println("TV[power=" + power +
						",channel=" + channel + 
						", volume=" + volume + "]");
	}
}
