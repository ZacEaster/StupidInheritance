package stupid;

public class Dumber extends Dumb
{
	public Dumber()
	{
		super(9);
	}
	
	public int getBlerg()
	{
		return super.getBlerg() + 7;
	}
	
	public void changeBlerg()
	{
		this.setBlerg(getBlerg()*getBlerg());
	}
}
