import javax.swing.JInternalFrame;
class LoginDetails {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Login Details Form","User Id","Status","Login At","Logout At","User Ip Address"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "login_details";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
