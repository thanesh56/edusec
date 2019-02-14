import javax.swing.JInternalFrame;
class Nationality {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Nationality Form","Name","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "nationality";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
