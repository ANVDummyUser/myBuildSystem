def call(Config_Path, Report_Path, Config_Password, Report_Save_Type) {

	bat "LABVIEWCLI -OperationName RunVIAnalyzer -ConfigPath \"${Config_Path}\ -ReportPath \"${Report_Path}\ -ReportSaveType {Report_Save_Type} -ConfigPassword {Config_Password}
}
