import javax.swing.JInternalFrame;
class EmpCategory {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Category Form","Name","Alias","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "epm_category";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
