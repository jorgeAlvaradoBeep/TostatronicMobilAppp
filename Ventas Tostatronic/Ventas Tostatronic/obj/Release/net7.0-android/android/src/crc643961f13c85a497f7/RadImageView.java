package crc643961f13c85a497f7;


public class RadImageView
	extends android.widget.ImageView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_invalidate:()V:GetInvalidateHandler\n" +
			"";
		mono.android.Runtime.register ("Telerik.Maui.Controls.Compatibility.Common.Android.RadImageView, Telerik.Maui.Controls.Compatibility", RadImageView.class, __md_methods);
	}


	public RadImageView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RadImageView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Compatibility.Common.Android.RadImageView, Telerik.Maui.Controls.Compatibility", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public RadImageView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RadImageView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Compatibility.Common.Android.RadImageView, Telerik.Maui.Controls.Compatibility", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public RadImageView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RadImageView.class) {
			mono.android.TypeManager.Activate ("Telerik.Maui.Controls.Compatibility.Common.Android.RadImageView, Telerik.Maui.Controls.Compatibility", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1, p2 });
		}
	}


	public void invalidate ()
	{
		n_invalidate ();
	}

	private native void n_invalidate ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
