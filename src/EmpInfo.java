import javax.swing.JInternalFrame;
class EmpInfo {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Info","Unique Id","Attendance Id","Title","First Name","Middle Name","Last Name","Alias Name","Mother Name","Gender","DOB","Religion","Blood Group","Joining Date","Birth Place","Email Id","Marital Status","Mobile No.","Photo","Language","Bank A/c No.","Qualification","Specialization","Experience year","Experience Month","Hobbies","Reference","Guardian Name","Guardian Relation","Guardian Qualification","Guardian Occupation","Guardian Income","Guardian Home Address ","Guardian Official Address","Guardian Mob. No.","Guardian Phone No.","Guardian Email","Emp Master Id"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_info";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
