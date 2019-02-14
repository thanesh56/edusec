import javax.swing.JInternalFrame;
class StuMaster {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Master Form","Stu Info Id","User Id","Nationality Id","Category Id","Course Id","Batch Id","Section Id","Status Id","Address Id","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_master";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
