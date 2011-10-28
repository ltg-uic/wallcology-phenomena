package ltg.ps.phenomena.wallcology;

import ltg.ps.api.phenomena.Phenomena;
import ltg.ps.api.phenomena.PhenomenaWindow;

public class WallcologyControlWindow extends PhenomenaWindow {
	
	private Wallcology wc = null;

	public WallcologyControlWindow(String windowName) {
		super(windowName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toXML() {
		if (wc!=null)
			return wc.toXML();
		return "";
	}

	@Override
	public void update(Phenomena p) {
		this.wc = (Wallcology) p;

	}
}
