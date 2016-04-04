package cb;


/**
 * Generated from IDL interface "Server".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 4, 2016 2:41:02 PM
 */

public abstract class ServerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, cb.ServerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "register", Integer.valueOf(0));
		m_opsHash.put ( "one_time", Integer.valueOf(1));
		m_opsHash.put ( "shutdown", Integer.valueOf(2));
	}
	private String[] ids = {"IDL:cb/Server:1.0"};
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
			case 0: // register
			{
				cb.CallBack _arg0=cb.CallBackHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				short _arg2=_input.read_ushort();
				_out = handler.createReply();
				register(_arg0,_arg1,_arg2);
				break;
			}
			case 1: // one_time
			{
				cb.CallBack _arg0=cb.CallBackHelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				one_time(_arg0,_arg1);
				break;
			}
			case 2: // shutdown
			{
				_out = handler.createReply();
				shutdown();
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
