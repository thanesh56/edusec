import javax.swing.JInternalFrame;
class DocumentCategory {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Document Category Info","Name","User Type","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "document_category";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
