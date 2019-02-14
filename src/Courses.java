import javax.swing.JInternalFrame;
class Courses {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Course Info","Name","Code","Alias","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "courses";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
