import java.lang.RuntimeException;

public class StackUnderFlowException extends RuntimeException
{

	private static final long serialVersionUID = 1379324098649974111L;

	public StackUnderFlowException()
	{
		super();
	}

	public StackUnderFlowException(String message)
	{
		super(message);
	}

}