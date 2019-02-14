import javax.swing.JInternalFrame;
class StuInfo {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Info","Unique Id","Title","First Name","Middle Name","Last Name","Gender","DOB","Email","Blood Group","Birth Place","Religion","Admission Date","Photo","Language","Mobile No.","Master Id"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_info";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
