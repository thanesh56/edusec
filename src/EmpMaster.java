import javax.swing.JInternalFrame;
class EmpMaster {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Master Form","Emp Info Id","User Id","Department Id","Designation Id","Category Id","Nationality Id","Emp Address Id","Status Id","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_master";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
