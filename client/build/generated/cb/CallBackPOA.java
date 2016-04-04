package cb;


/**
 * Generated from IDL interface "CallBack".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 4, 2016 2:41:02 PM
 */

public abstract class CallBackPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, cb.CallBackOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "call_back", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:cb/CallBack:1.0"};
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
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // call_back
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				call_back(_arg0);
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
