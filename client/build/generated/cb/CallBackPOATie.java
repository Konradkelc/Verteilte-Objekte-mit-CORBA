package cb;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CallBack".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 4, 2016 2:41:02 PM
 */

public class CallBackPOATie
	extends CallBackPOA
{
	private CallBackOperations _delegate;

	private POA _poa;
	public CallBackPOATie(CallBackOperations delegate)
	{
		_delegate = delegate;
	}
	public CallBackPOATie(CallBackOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public cb.CallBack _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		cb.CallBack __r = cb.CallBackHelper.narrow(__o);
		return __r;
	}
	public cb.CallBack _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		cb.CallBack __r = cb.CallBackHelper.narrow(__o);
		return __r;
	}
	public CallBackOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CallBackOperations delegate)
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
	public void call_back(java.lang.String mesg)
	{
_delegate.call_back(mesg);
	}

}
