package cb;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Server".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 4, 2016 2:41:02 PM
 */

public class ServerPOATie
	extends ServerPOA
{
	private ServerOperations _delegate;

	private POA _poa;
	public ServerPOATie(ServerOperations delegate)
	{
		_delegate = delegate;
	}
	public ServerPOATie(ServerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public cb.Server _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		cb.Server __r = cb.ServerHelper.narrow(__o);
		return __r;
	}
	public cb.Server _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		cb.Server __r = cb.ServerHelper.narrow(__o);
		return __r;
	}
	public ServerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ServerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void register(cb.CallBack _cb, java.lang.String mesg, short period_secs)
	{
_delegate.register(_cb,mesg,period_secs);
	}

	public void one_time(cb.CallBack _cb, java.lang.String mesg)
	{
_delegate.one_time(_cb,mesg);
	}

	public void shutdown()
	{
_delegate.shutdown();
	}

}
