package Chess;


	import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


	public class aide {
		
		public aide(){
			
		}


		
		  public  void displayURL(String url)
		    {
		        boolean windows  ;  
		        String os = System.getProperty("os.name");
		        if ( os != null && os.startsWith("Windows"))
		            windows =  true;
		        else
		            windows =  false;
		        String cmd = null;
		        try
		        {
		            if (windows)
		            {
		           
		                cmd = "rundll32" + " " + "url.dll,FileProtocolHandler" + " " + url;
		                Process p = Runtime.getRuntime().exec(cmd);
		            }
		            else
		            {
		             
		                cmd = "netscape" + " " + "-remote openURL" + "(" + url + ")";
		                Process p = Runtime.getRuntime().exec(cmd);
		                try
		                {
		                    
		                    int exitCode = p.waitFor();
		                    if (exitCode != 0)
		                    {
		                        cmd = "netscape" + " "  + url;
		                        p = Runtime.getRuntime().exec(cmd);
		                    }
		                }
		                catch(InterruptedException x)
		                {
		                    System.err.println("Error bringing up browser, cmd='" +
		                                       cmd + "'");
		                    System.err.println("Caught: " + x);
		                }
		            }
		        }
		        catch(IOException x)
		        {
		            // couldn't exec browser
		            System.err.println("Could not invoke browser, command=" + cmd);
		            System.err.println("Caught: " + x);
		        }
		    }
		    /**
		     * Try to determine whether this application is running under Windows
		     * or some other platform by examing the "os.name" property.
		     *
		     * @return true if this application is running under a Windows OS
		     */
		
		    /**
		     * Simple example.
		     */
	
		    public void run()
		    {
		       this.displayURL("https://www.pousseurdebois.fr/cours/regles-du-jeu-d-echecs/#:~:text=I%20%E2%80%93%20L'%C3%A9chiquier&text=On%20dit%20que%20le%20Roi,il%20est%20%C3%A9chec%20et%20mat.");
		    }
		    
		
		  
		    
		}



