def call(Config_Path, Report_Path, Config_Password, Report_Save_Type, LabVIEW_Version) {

	def LabVIEW_Dir = "C:\\Program Files (x86)\\National Instruments\\LabVIEW "
	def LabVIEW_Path = "${LabVIEW_Dir}${LabVIEW_Version}\\LabVIEW.exe"


	bat "LABVIEWCLI -OperationName RunVIAnalyzer -ConfigPath \"${Config_Path}\" -ReportPath \"${Report_Path}\" -ReportSaveType \"${Report_Save_Type}\" -ConfigPassword \"${Config_Password}\" -LabVIEWPath \"${LabVIEW_Path}\""
}
