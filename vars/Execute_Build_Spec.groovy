def call(Project_Path, Target_Name, Build_Spec_Name) {

	bat "LABVIEWCLI -OperationName ExecuteBuildSpec -ProjectPath \"${Project_Path}\" -TargetName \"${Target_Name}\" -BuildSpecName \"${Build_Spec_Name}\" "
}
