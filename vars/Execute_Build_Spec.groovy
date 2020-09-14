def call(Project_Path, Target_Name, Build_Spec_Name, LabVIEW_Version) {
	def LabVIEW_Dir = "C:\\Program Files (x86)\\National Instruments\\LabVIEW "
	def projectPath = "${LabVIEW_Dir}${LabVIEW_Version}\\LabVIEW.exe"
	
	bat "LABVIEWCLI -OperationName ExecuteBuildSpec -ProjectPath \"${Project_Path}\" -TargetName \"${Target_Name}\" -BuildSpecName \"${Build_Spec_Name}\" -LabVIEWPath \"${projectPath}\" "
}
