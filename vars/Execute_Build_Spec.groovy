def call(Project_Path, Target_Name, Build_Spec_Name, LabVIEW_Path) {
	
	def projectPath = \"C:\\Program Files (x86)\\National Instruments\\LabVIEW 2020\\LabVIEW.exe\"
	
	bat "LABVIEWCLI -OperationName ExecuteBuildSpec -ProjectPath \"${Project_Path}\" -TargetName \"${Target_Name}\" -BuildSpecName \"${Build_Spec_Name}\" -LabVIEWPath \"${projectPath}\" "
}
