import com.designs_1393.javasana.core.*;

import java.lang.Long;

public class JavasanaTest
{
	public static void main( String[] args )
	{
		AsanaHelper ah = new AsanaHelper("REPLACE_WITH_YOUR_API_KEY");

		System.out.println("All workspaces:");
		System.out.println("\t" +ah.getWorkspaces());

		System.out.println("All projects in any workspace:");
		System.out.println("\t" +ah.getAllProjects());

		System.out.println("All projects in workspace \"1393 Designs\"");
		System.out.println("\t" +ah.getProjectsInWorkspace( 185645369321L ));

		System.out.println("Create a task with name \"Javasana test\" to workspace \"1393 Designs\"");
		System.out.println("\t" +ah.createTask( "Javasana test",
			185645369321L ));
	}
}
