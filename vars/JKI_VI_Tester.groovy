def call(path, LabVIEW_Version) {

	def LabVIEW_Dir = "C:\\Program Files (x86)\\National Instruments\\LabVIEW "
	def LabVIEW_Path = "${LabVIEW_Dir}${LabVIEW_Version}\\LabVIEW.exe"

	bat "LABVIEWCLI -OperationName RunVI -VIPath \"C:\\Program Files (x86)\\Dummy\\JKI_VI_Tester.vi\" \"${path}\" -LabVIEWPath \"${LabVIEW_Path}\" "
}
