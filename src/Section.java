import javax.swing.JInternalFrame;
class Section {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Section Form","Name","Batch Id","Intake","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "section";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
