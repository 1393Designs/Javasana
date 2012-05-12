import com.designs_1393.javasana.core.*;

public class JavasanaTest
{
	public static void main( String[] args )
	{
		AsanaHelper ah = new AsanaHelper("REPLACE_WITH_YOUR_API_KEY");

		System.out.println(ah.getWorkspaces());
	}
}
