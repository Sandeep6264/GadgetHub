package in.gadgethub.listener;

import in.gadgethub.utility.DBUtil;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;


/**
 * Application Lifecycle Listener implementation class DBConnectionListener1
 *
 */
public class DBConnectionListener implements ServletContextListener {

    /**
     * Default constructor.
     */
    public DBConnectionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    @Override
	public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext ctxt=sce.getServletContext();
    	String driver=ctxt.getInitParameter("driver");
    	String url=ctxt.getInitParameter("url");
    	String username=ctxt.getInitParameter("username");
    	String password=ctxt.getInitParameter("password");
    	DBUtil.openConnection(driver, url, username, password);
    }
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    @Override
	public void contextDestroyed(ServletContextEvent sce)  {
         // TODO Auto-generated method stub
    }

}
