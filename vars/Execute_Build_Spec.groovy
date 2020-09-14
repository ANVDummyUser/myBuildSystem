def call(Project_Path, Target_Name, Build_Spec_Name, LabVIEW_Path) {

	
	bat "LABVIEWCLI -OperationName ExecuteBuildSpec -ProjectPath \"${Project_Path}\" -TargetName \"${Target_Name}\" -BuildSpecName \"${Build_Spec_Name}\" -LabVIEWPath "\"${C:\Program Files (x86)\National Instruments\LabVIEW}\"\"${LabVIEW_Path}\"\"${LabVIEW.exe}\"" "
}
