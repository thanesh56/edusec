import javax.swing.JInternalFrame;
class StuDocs {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Documentation Form","Details","Category Id","Path","Submited At","Status","Emp Master Id","Created By"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_docs";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
