import javax.swing.JInternalFrame;
class Batches {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Batche info","Name","Course Id","Alias","Start Date","End Date","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "batches";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
