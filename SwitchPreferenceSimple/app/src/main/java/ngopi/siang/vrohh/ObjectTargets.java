package ngopi.siang.vrohh;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.preference.*;
import android.view.*;

public class ObjectTargets extends LinearLayout
{
	
	public ObjectTargets(Context context, AttributeSet attr, int defStyle){
		super(context, attr, defStyle);
		setOnOff();
	}

	public ObjectTargets(Context context, AttributeSet attr){
		super(context, attr);
		setOnOff();
	}
	
	public ObjectTargets(Context context){
		super(context);
		setOnOff();
	}
	
	private void setOnOff()
	{
		if(!Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("example",false)).booleanValue()){
			ObjectTargets.this.setVisibility(View.GONE);
		}
	}
}
