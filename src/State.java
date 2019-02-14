import javax.swing.JInternalFrame;
class State {	
	public JInternalFrame showGUI() {
		String[] labels  = {"State Info","Name","Country Id","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "state";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
