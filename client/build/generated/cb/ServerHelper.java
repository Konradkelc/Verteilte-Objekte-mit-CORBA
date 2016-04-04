package cb;


/**
 * Generated from IDL interface "Server".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 4, 2016 2:41:02 PM
 */

public abstract class ServerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ServerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:cb/Server:1.0", "Server");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final cb.Server s)
	{
			any.insert_Object(s);
	}
	public static cb.Server extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:cb/Server:1.0";
	}
	public static Server read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(cb._ServerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final cb.Server s)
	{
		_out.write_Object(s);
	}
	public static cb.Server narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof cb.Server)
		{
			return (cb.Server)obj;
		}
		else if (obj._is_a("IDL:cb/Server:1.0"))
		{
			cb._ServerStub stub;
			stub = new cb._ServerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static cb.Server unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof cb.Server)
		{
			return (cb.Server)obj;
		}
		else
		{
			cb._ServerStub stub;
			stub = new cb._ServerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
