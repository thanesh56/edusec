import javax.swing.JInternalFrame;
class EmpDesignation {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Designation Form","Name","Alias","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_designation";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
