// 长度校验
function checkLength(obj, maxLength) {
	var objValue = $(obj).val();
	var length = objValue.length;
	var leftLength = maxLength - length;
	if (leftLength <= 0) {
		leftLength = 0;
		$(obj).val(objValue.substring(0, maxLength));
		$(obj).next(".errors").html(
				"<font color=\"green\">还可录入" + leftLength + "个字</font>");
	} else {
		$(obj).next(".errors").html(
				"<font color=\"green\">还可录入" + leftLength + "个字</font>");
	}
}

// 将某一个长度设置后赋值到另一个控件
function checkLengthAndSetValueToanother(obj, maxLength, otherId) {
	var objValue = $(obj).val();
	var length = objValue.length;
	var leftLength = maxLength - length;
	if (leftLength <= 0) {
		leftLength = 0;
		$(obj).val(objValue.substring(0, maxLength));
		$("#" + otherId).val(objValue.substring(0, maxLength));
		$(obj).next(".errors").html(
				"<font color=\"green\">还可录入" + leftLength + "个字</font>");
	} else {
		$(obj).next(".errors").html(
				"<font color=\"green\">还可录入" + leftLength + "个字</font>");
	}

}

function checkTxtAreaLength(obj, maxLength) {
	var objValue = $(obj).val();
	var length = objValue.length;
	var leftLength = maxLength - length;

	if (leftLength <= 0) {
		leftLength = 0;
		obj.value = objValue.substring(0, maxLength);
		$(obj).next(".errors").html(
				"<font color=\"green\">还可录入" + leftLength + "个字</font>");
	} else {
		$(obj).next(".errors").html(
				"<font color=\"green\">还可录入" + leftLength + "个字</font>");
	}
}

// 显示错误信息
function showError(obj, msg) {
	obj.next(".errors").html(
			"<font color=\"#EA5200\" style=\"font-size: 14px;\"><b>" + msg
					+ "</b></font>");
}

function isNull(obj) {
	return obj == null || (typeof obj === "undefined");
}

function isNotNull(obj) {
	return !isNull(obj);
}

function isEmpty(str) {
	return isNull(str)
			|| (typeof (str) == 'string' && (str.replace(/(^\s+)|(\s+$)/g, '') == ''));
}

function isNotEmpty(str) {
	return !isEmpty(str);
}

function nullToStr(str) {
	if (isNull(str)) {
		return "";
	} else {
		return str;
	}
}

// 公共表单提交
// url 需为<c:url value=''> targetForm为操作Form可以为null,windowName指向窗口
function formSubmit(formName, url, methodStyle, targetForm, windowName) {
	formName.attr('action', url);
	if (methodStyle != null) {
		formName.attr('method', methodStyle);
	}
	if (targetForm != null) {
		formName.attr('target', targetForm);
	}
	if (windowName != null) {
		window.name = windowName;
	}
	formName.submit();
}

// iframe自适应高度
function iFrameHeight(obj) {
	var ifm = document.getElementById(obj);
	var subWeb = document.frames ? document.frames[obj].document
			: ifm.contentDocument;

	if (ifm != null && subWeb != null) {
		ifm.height = subWeb.body.scrollHeight;
	}
}

// iframe自适应高度+60,forDetail页面
function iFrameHeightForDetail(obj) {
	var ifm = document.getElementById(obj);
	var subWeb = document.frames ? document.frames[obj].document
			: ifm.contentDocument;
	if (ifm != null && subWeb != null) {
		ifm.height = subWeb.body.scrollHeight + 60;
	}
}

// 返回父级页面
function returnParentPage(url) {
	window.location.href = url;
}
