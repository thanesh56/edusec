import javax.swing.JInternalFrame;
class EmpDepartment {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Depatrtment Form","Name","Alias","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_department";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
