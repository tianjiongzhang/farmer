<div ng-controller = "benefactorController" ng-data-init = "init()">
<div ng-show = "resultStat == 'success'">
<font color = "red" face = "宋体">提交捐助者成功！</font>
</div>
<form>
	捐助者类型：&nbsp;&nbsp;
	<label><input type = "radio" name = "benefactorType" value = "01" ng-model = "benefactor.benefactorType">个人</label>&nbsp;&nbsp;
	<label><input type = "radio" name = "benefactorType" value = "02" ng-model = "benefactor.benefactorType">机构</label>
	<br>
	姓名：<input type = "text" name = "name" ng-model = "benefactor.name"><br>
	联系人姓名：<input type = "text" name = "contractName" ng-model = "benefactor.contractName"><br>
	电话：<input type = "text" name = "telNumber" ng-model = "benefactor.telNumber"><br>
	手机：<input type = "text" name = "mobileNumber" ng-model = "benefactor.mobileNumber"><br>
	邮箱：<input type = "text" name = "e_mail" ng-model = "benefactor.e_mail"><br>
	<div class="ui buttons" ng-show = "editType != 'editView'">
        <div class="ui blue submit button" ng-click="addBenefactor()">保存</div>
        <div class="or"></div>
        <div id="reset_button" class="ui button">重置</div>
    </div>
    {{id}} {{editType}}
</form>
</div>
	