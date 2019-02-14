import javax.swing.JInternalFrame;
class FeesCategoryDetails {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Fees Category Details","Name","Category Id","Description","Amount","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "fees_category_details";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
