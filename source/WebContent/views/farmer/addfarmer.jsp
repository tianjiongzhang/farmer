<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<title>ũ��¼��</title>
	<!--
	<link type="text/css" rel="stylesheet" href="css/base.css" />
	<link href="css/common.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="css/jquery-ui-1.10.4.custom.min.css"/>
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/jquery-ui-1.10.4.custom.min.js"></script>
	<script src="js/jquery.ui.datepicker-zh-CN.js"></script>
	<script src="js/grid.locale-cn.js" type="text/javascript"></script>
	<script src="js/jquery.jqGrid.min.js" type="text/javascript"></script>
	<script src="js/common.js" type=text/javascript></script>
    -->
	<style type="text/css">
	.form_title {
		color: #ffffff;
		background-color: #ff4500;
		font-family: '΢���ź� Regular', '΢���ź�';
	}
	.form_style {
		margin-left: 50px;
		width: 900px;
		padding: 5px;
		border-style: solid;
		border-width: 1px;
		border-color: #ffd700;
	}
	.input_label {
		font-family: '΢���ź� Regular', '΢���ź�';
	}
	.row_container {
		margin : 20px;
	}
	.field_input {
		font-family: '΢���ź� Regular', '΢���ź�';
	}
	.common_button {
		width: 120px;
		height: 25px;
		border-style: solid;
		border-width: 1px;
		border-color: #696969;
		text-align: center;
		padding-top: 5px;
		float: left;
		margin-left: 50px;
		margin-right: 50px;
	}
	.confirm_button {
		color: #ffffff;
		background-color: #008b8b;
	}
	.cancel_button {
		color: #008b8b;
	}
	.field_selector {
		font-size: 14px;
		font-family: '΢���ź� Regular', '΢���ź�';
	}
	</style>
</head>
<body>
<div class="form_style form_title">ũ��¼��</div>
<form  id="farm_form" method="POST">
<div class="form_style">
	<div class="row_container">
		<label class="input_label">���֤���룺</label>
		<input class="field_input" id="idno_input" name="idNo"/>
		<label class="input_label">��ͥ�Ͷ�����</label>
		<input class="field_input" id="home_labor_input" name="laborNum"/>
		<label class="input_label">������</label>
		<input class="field_input" id="sponsor_amount_input" name="planAidFinance"/>
	</div>
	<div class="row_container">
		<label class="input_label">��������</label>
		<input class="field_input" id="planned_sponsir_input" name="planAidFinance"/>
		<label class="input_label">��ͥ�����룺</label>
		<input class="field_input" id="annual_income_input" name="yearIncome"/>
		<label class="input_label">���������</label>
		<input class="field_input" id="field_size_input" name="farmLand"/>
	</div>
	<div class="row_container">
		<label class="input_label">��ͥ������Ҫ��Դ��</label>
		<input class="field_input" id="family_income_source_input" name="incomeSource" />
	</div>
	<div class="row_container">
		<label class="input_label">��ǰ��ֲ����ֳ����Ҫũ������ϸ��������</label>
		<input class="field_input" id="current_crops_detail_input" name="currentCropsDetail"/>
	</div>
	<div class="row_container">
		<label class="input_label">�ƻ���ֲ����ֳ����Ҫũ������ϸ��������</label>
		<input class="field_input" id="planned_crops_detail_input" name ="planCropsDetail" />
	</div>
	<div class="row_container">
		<label class="input_label">��ͥ��ַ��</label>
		<input class="field_input" id="family_address_input" name="address"/>
	</div>
	<div class="row_container">
		<label class="input_label">���֤��Ƭ��</label>
		<input class="field_input" id="id_photo_input" />
	</div>
	<div class="row_container">
		<label class="input_label">�������˵����</label>
		<input class="field_input" id="notes_input" name="remark"/>
	</div>
</div>
<div class="form_style form_title">��ϵ����Ϣ</div>
<div class="form_style">
	<div class="row_container">
		<label class="input_label">������</label>
		<input class="field_input" id="name_input" />
		<label class="input_label">�Ա�</label>
		<select id="sex_selector" class="field_selector" name="sex_selector"> 
		    <option value="M" selected>��</option>
		    <option value="F">Ů</option>
		</select> 
		<label class="input_label">���䣺</label>
		<input class="field_input" id="sex_input" />
		<label class="input_label">��ϵ��</label>
		<select id="relation_selector" class="field_selector" name="relation_selector"> 
		    <option value="1" selected>����</option>
		    <option value="2">ĸ��</option>
		    <option value="3">����</option>
		    <option value="4">��Ů</option>
		</select> 
	</div>
	<div class="row_container">
		<label class="input_label">������</label>
		<input class="field_input" id="name_input" />
		<label class="input_label">�Ա�</label>
		<select id="sex_selector" class="field_selector" name="sex_selector"> 
		    <option value="M" selected>��</option>
		    <option value="F">Ů</option>
		</select> 
		<label class="input_label">���䣺</label>
		<input class="field_input" id="sex_input" />
		<label class="input_label">��ϵ��</label>
		<select id="relation_selector" class="field_selector" name="relation_selector"> 
		    <option value="1" selected>����</option>
		    <option value="2">ĸ��</option>
		    <option value="3">����</option>
		    <option value="4">��Ů</option>
		</select> 
	</div>
	<div class="row_container">
		<label class="input_label">������</label>
		<input class="field_input" id="name_input" />
		<label class="input_label">�Ա�</label>
		<select id="sex_selector" class="field_selector" name="sex_selector"> 
		    <option value="M" selected>��</option>
		    <option value="F">Ů</option>
		</select> 
		<label class="input_label">���䣺</label>
		<input class="field_input" id="sex_input" />
		<label class="input_label">��ϵ��</label>
		<select id="relation_selector" class="field_selector" name="relation_selector"> 
		    <option value="1" selected>����</option>
		    <option value="2">ĸ��</option>
		    <option value="3">����</option>
		    <option value="4">��Ů</option>
		</select> 
	</div>
	<div class="row_container">
		<input type="checkbox" id="confirm_checkbox" class="field_input">ũ�����ϻ�����Ҫ�󣬲��ҿ���ͨ��־Ը����ȷ��</input>
	</div>
</div>
</form>

<div class="row_container">
	<div id="confirm_button" class="input_label common_button confirm_button"  onclick="farmerSubmit()">����</div>
	<div id="cancel_button" class="input_label common_button cancel_button">ȡ��</div>
</div>

<script type="text/javascript">
      function farmerSubmit(){
           document.getElementById('farm_form').action='<%=basePath%>service/farmer/add';  
           document.getElementById('farm_form').submit();
       
       }
</script>
</body>
</html>
