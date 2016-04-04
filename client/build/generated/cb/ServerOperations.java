package cb;


/**
 * Generated from IDL interface "Server".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 4, 2016 2:41:02 PM
 */

public interface ServerOperations
{
	/* constants */
	/* operations  */
	void one_time(cb.CallBack _cb, java.lang.String mesg);
	void register(cb.CallBack _cb, java.lang.String mesg, short period_secs);
	void shutdown();
}
