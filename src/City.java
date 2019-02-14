import javax.swing.JInternalFrame;
class City {	
	public JInternalFrame showGUI() {
		String[] labels  = {"City Info","Name","State Id","Country Id","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "city";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
