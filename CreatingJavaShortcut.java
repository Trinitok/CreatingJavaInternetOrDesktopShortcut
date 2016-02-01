import java.io.*;


public class CreatingJavaInternetShortcut{

  /**
  * name  The name you want the shortcut to have
  * webURL  The URL the shortcut will be linked to
  * icon  The icon you want the shortcut to have  OPTIONAL!!!!!
  */
  public void createInternetShortcut(String name, String webURL, String icon){
    FileWriter shortcut = new FileWriter(System.getenv("userprofile") + "/Desktop/" + name + ".URL");
		shortcut.write("[DesktopShortcut]\n");
		shortcut.write("URL=" + webURL +"\n");
		shortcut.write("IconFile="+icon);
		shortcut.flush();
		shortcut.close(); 
  }
  
  public void createDesktopShortcut(){
    // Not yet implemented
  }
}
