import javax.swing.JInternalFrame;
class EmpDocs {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Documentation Form","Details","Category Id","Path","Submited At","Status","Emp Master Id","Created By"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_docs";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
