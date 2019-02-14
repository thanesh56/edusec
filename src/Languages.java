import javax.swing.JInternalFrame;
class Languages {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Laguage Form","Name","Created At","Created By","Updated At","Updated By"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "languages";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
