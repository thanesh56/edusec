import javax.swing.JInternalFrame;
class FeesCollectCategory {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Fees Collect Category Form","Name","Batch Id","Details","Start Date","End Date","Due Date","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "fees_collect_category";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
