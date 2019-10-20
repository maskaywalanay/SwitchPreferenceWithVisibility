package ngopi.siang.vrohh;
import android.preference.*;
import android.os.*;

public class SwitchPreferenceSimple extends PreferenceActivity
{
	SwitchPreference mSwitch;
	
	public void onCreate(Bundle b){
		super.onCreate(b);
		addPreferencesFromResource(R.xml.configuration);
		
		mSwitch = (SwitchPreference)findPreference("example");
		mSwitch.setSummaryOn(R.string.switch_summary_on);
		mSwitch.setSummaryOff(R.string.switch_summary_off);
	}
}
