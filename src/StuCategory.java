import javax.swing.JInternalFrame;
class StuCategory {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Category Form","Name","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_category";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
