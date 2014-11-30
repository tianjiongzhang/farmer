<%@ include file="/views/common.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title><fmt:message key="portal.view.index" /></title>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="icon" type="image/x-icon" href="images/yiqiye.ico" />
<link rel="shortcut_icon" type="image/x-icon" href="images/yiqiye.ico" />

<link rel="stylesheet" type="text/css" href="css/ui-reset.jqgrid.css" />
<link rel="stylesheet" type="text/css" href="css/base.css" />
<link rel="stylesheet" type="text/css" href="css/common.css" />

<script type="text/javascript" src="js/external/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/external/jquery-ui-1.10.4.custom.min.js"></script>
<script type="text/javascript" src="js/dynamic-tab.js" ></script>

</head>
<body>
	<!--整体菜单展示风格样式-->
	<div class="header_wrap">
		<div class="header pr">
			<div class="slide_ico pr fl">
				<i class="ico1"></i> <i class="ico2 pb"></i> <i class="ico3 pb"></i>
			</div>
			<!-- 下拉主菜单 -->
			<div class="nav pb" id="nav">
				<dl class="oh no_bd">
					<dt>
						<i class="nav_ico8"></i><fmt:message key="portal.navi.foundation" />
					</dt>
					<dd>
						<a href="javascript:" onclick="addTab('foundationProject', '<fmt:message key='portal.navi.foundation.project' />', '<c:url value='/views/project/list.jsp' />', true);">
							<fmt:message key="portal.navi.foundation.project" />
						</a>
						<a href="javascript:" onclick="addTab('foundationReport', '<fmt:message key='portal.navi.foundation.report' />', '<c:url value='/views/report/list.jsp' />', true);">
							<fmt:message key="portal.navi.foundation.report" />
						</a>
					</dd>
				</dl>
				<dl class="oh">
					<dt>
						<i class="nav_ico9"></i><fmt:message key="portal.navi.cooperative" />
					</dt>
					<dd>
						<a href="javascript:" onclick="addTab('cooperativeProject', '<fmt:message key='portal.navi.cooperative.project' />', '<c:url value='/views/project/list.jsp' />', true);">
							<fmt:message key="portal.navi.cooperative.project" />
						</a>
						<a href="javascript:" onclick="addTab('cooperativeRepayment', '<fmt:message key='portal.navi.cooperative.repayment' />', '<c:url value='/views/project/list.jsp' />', true);">
							<fmt:message key="portal.navi.cooperative.repayment" />
						</a>
						<a href="javascript:" onclick="addTab('cooperativeReport', '<fmt:message key='portal.navi.cooperative.report' />', '<c:url value='/views/report/quarterly-list.jsp' />', true);">
							<fmt:message key="portal.navi.cooperative.report" />
						</a>
					</dd>
				</dl>
				<dl class="oh">
					<dt>
						<i class="nav_ico1"></i><fmt:message key="portal.navi.volunteer" />
					</dt>
					<dd>
						<a href="javascript:" onclick="addTab('volunteerProject', '<fmt:message key='portal.navi.volunteer.project' />', '<c:url value='/views/project/list.jsp' />', true);">
							<fmt:message key="portal.navi.volunteer.project" />
						</a>
						<a href="javascript:" onclick="addTab('volunteerFarmer', '<fmt:message key='portal.navi.volunteer.farmer' />', '<c:url value='/service/farmers' />', true);">
							<fmt:message key="portal.navi.volunteer.farmer" />
						</a>
					</dd>
				</dl>
				<dl class="oh">
					<dt>
						<i class="nav_ico5"></i><fmt:message key="portal.navi.system" />
					</dt>
					<dd>
						<a href="javascript:" onclick="addTab('systemCooperative', '<fmt:message key='portal.navi.system.cooperative' />', '<c:url value='/views/cooperative/list.jsp' />', true);">
							<fmt:message key="portal.navi.system.cooperative" />
						</a>
						<a href="javascript:" onclick="addTab('systemVolunteer', '<fmt:message key='portal.navi.system.volunteer' />', '<c:url value='/views/volunteer/list.jsp' />', true);">
							<fmt:message key="portal.navi.system.volunteer" />
						</a>
						<a href="javascript:" onclick="addTab('systemDonator', '<fmt:message key='portal.navi.system.donator' />', '<c:url value='/views/system/donator_list.jsp' />', true);">
							<fmt:message key="portal.navi.system.donator" />
						</a>
					</dd>
				</dl>
			</div>
			<div class="logo fl pdl20">
				<fmt:message key="portal.logo.title" />
			</div>
			<div class="header_r fr">
				<ul class="oh">
					<li><fmt:message key="portal.menu.hello" /><a href="javascript:">Zhangsan</a></li>
					<li><a href="javascript:"><fmt:message key="portal.menu.contact" /></a></li>
					<li><a href="javascript:"><fmt:message key="portal.menu.help" /></a></li>
					<li><a href="javascript:"><fmt:message key="portal.menu.profile" /></a></li>
					<li class="no_bd"><a href="javascript:"><fmt:message key="portal.menu.logout" /></a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<!-- 标签区域 -->
	<div id="tabbar" class="tabbar" >
	</div>
	
	<!-- 内容区域 -->
	<div id="contentArea" style="-webkit-overflow-scrolling:touch; overflow:auto; float:left;" >
	</div>

	<script type="text/javascript">
		$(function() {
			// 鼠标移入动作
			$(".slide_ico").hover(function() {
				$(this).addClass("on").next().show();
			}, function() {
				$(this).removeClass("on").next().hide();
			});
			
			$(".nav").hover(function() {
				$(this).show().prev().addClass("on");
			}, function() {
				$(this).hide().prev().removeClass("on");
			});
		});
	</script>

	<script type="text/javascript">
		$(document).ready(function() {
			addTab('dashboard', '<fmt:message key='portal.navi.dashboard' />', '<c:url value='/views/report/dashboard.jsp' />', false);
		});
	</script>
		
</body>
</html>
