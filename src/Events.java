import javax.swing.JInternalFrame;
class Events {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Events Info","Title","Detail","Start Date","End Date","Type","URL","All Day","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "events";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
