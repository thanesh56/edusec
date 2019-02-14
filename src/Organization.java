import javax.swing.JInternalFrame;
class Organization {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Organization Form","Name","Alias","Address1","Address2","Phone","Email","Website","Logo","Logo Type","Student Prefix","Employee Prefix","Created At","Created By","Updated At","Updated By"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "organization";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
