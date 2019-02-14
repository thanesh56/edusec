import javax.swing.JInternalFrame;
class Country {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Country Info","Name","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "country";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
